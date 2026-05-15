import java.awt.*;
import java.util.*;
import java.util.List;
/**
 * Write a description of class finalProject here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class finalProject
{
    
    public static void main(String[] args)
    {
        Picture cats1 = new Picture("images/cats.jpg");
        Picture cats2 = new Picture("images/cats.jpg");
        Picture cats3 = new Picture("images/cats.jpg");
        Picture cats4 = new Picture("images/cats.jpg");
        Picture cats5 = new Picture("images/cats.jpg");
        Picture cats6 = new Picture("images/cats.jpg");
        Picture hearts = new Picture("images/hearts.jpg");
        Picture canvas = new Picture("images/canvas.jpg");
        copytoCanvas(cats1, canvas, 0, 0);
        mirrorVertical(cats2);
        copytoCanvas(cats2, canvas, cats2.getWidth(), 0);
        blackAndWhite(cats3);
        copytoCanvas(cats3, canvas, 0, cats3.getHeight());
        invert(cats4);
        copytoCanvas(cats4, canvas, cats4.getWidth(), cats4.getHeight());
        overlay(cats5, hearts);
        copytoCanvas(cats5, canvas, 0, cats5.getHeight() * 2); 
        recursion(cats6, cats6, cats6.getWidth(), cats6.getHeight());
        copytoCanvas(cats6, canvas, cats6.getWidth(), cats6.getHeight() * 2);
        canvas.explore();
        
        canvas.write("images/finalcollage.jpg");
        //canvas.write(“images/finalcollage.jpg”);
    }
    
    /**
     * Method to mirror on a vertical line in the middle of the picture based on the width
     */
    public static void mirrorVertical(Picture source)
    {
        int width = source.getWidth();
        int mirrorPoint = width / 2;
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        
        //loop through all the rows
        for (int y = 0; y < source.getHeight(); y++)
        {
            //loop from 0 to the middle
            for (int x = 0; x < mirrorPoint; x++)
            {
                leftPixel = source.getPixel(x, y);
                rightPixel = source.getPixel(width - 1 - x, y);
                rightPixel.setColor(leftPixel.getColor());
                
            }
        }
    }
    
    public static void greyScale(Picture source)
    {
        int red, green, blue, grey;
        Pixel[] pixels = source.getPixels();
         
        for (Pixel spot: pixels)
        {
            red = spot.getRed();
            green = spot.getGreen();
            blue = spot.getBlue();
            grey = (red + green + blue)/3;
            spot.setRed(grey);
            spot.setGreen(grey);
            spot.setBlue(grey);
        }
    }
    
    public static void blackAndWhite(Picture source)
    {
        int red, green, blue;
        greyScale(source);
        Pixel[] pixels = source.getPixels();
        
        for (Pixel spot: pixels)
        {
            if (spot.getRed() > 75)
            {
                spot.setRed(255);
                spot.setGreen(255);
                spot.setBlue(255);
            }
            else
            {
                spot.setRed(0);
                spot.setGreen(0);
                spot.setBlue(0);
            }
        }
    }
    
    public static void invert(Picture source)
    {
        int red, green, blue;
        Pixel[] pixels = source.getPixels();
         
        for (Pixel spot: pixels)
        {
            red = 255 - spot.getRed();
            green = 255 - spot.getGreen();
            blue = 255 - spot.getBlue();
            spot.setRed(red);
            spot.setGreen(green);
            spot.setBlue(blue);
        }
    }
    
    public static void overlay(Picture source1, Picture source2)
    {
        int red, green, blue;
        
        for (int y = 0; y < source2.getHeight(); y++)
        {
            for (int x = 0; x < source2.getWidth(); x++)
            {
                Pixel pixels1 = source1.getPixel(x, y);
                Pixel pixels2 = source2.getPixel(x, y);
                
                red = (pixels1.getRed() + pixels2.getRed()) / 2;
                green = (pixels1.getGreen() + pixels2.getGreen()) / 2;
                blue = (pixels1.getBlue() + pixels2.getBlue()) / 2;
                
                pixels1.setRed(red);
                pixels1.setGreen(green);
                pixels1.setBlue(blue);
            }
        }
    }
    
    public static void recursion(Picture source, Picture target, int width, int height)
    {
        Pixel[] pixels = source.getPixels();
        if (width <= 100)
            return;
        else
        {
            for (int x = 0; x < width; x++)
            {
                for (int y = 0; y < height; y++)
                {
                    int sourceX = x * source.getWidth() / width;
                    int sourceY = y * source.getHeight() / height;
                    
                    Pixel sourcePixel = source.getPixel(sourceX, sourceY);
                    Pixel targetPixel = target.getPixel(x, y);
                    
                    targetPixel.setColor(sourcePixel.getColor());
                }
            }
            
            recursion(source, target, width / 2, height / 2);
        }
    }
    
    
    
    /**
     * Method to copy one picture to another
     * Add two ints to params
     */
    public static void copytoCanvas(Picture source, Picture target, int x, int y)
    {
        Pixel sourcePix = null;
        Pixel targetPix = null;
        
        //loop through all the columns; targetX is starting point on canvas
        for (int sourceX = 0, targetX = x; sourceX < source.getWidth(); sourceX++, targetX++)
        {
            //loop through the rows 
            //larger: sourceY += 0.5 (cast as int), copy every pixel twice 
            //smaller: sourceY += 2, copy every other pixel
            for (int sourceY = 0, targetY = y; sourceY < source.getHeight(); sourceY++, targetY++)
            {
                sourcePix = source.getPixel(sourceX, sourceY);
                targetPix = target.getPixel(targetX, targetY);
                targetPix.setColor(sourcePix.getColor());
            }
        }
    }
}