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
        Picture heartHands = new Picture("images/heartHands.jpg");
        Picture canvas = new Picture("images/canvas.jpg");
        copytoCanvas(cats1, canvas, 0, 0);
        mirrorVertical(cats2);
        copytoCanvas(cats2, canvas, cats2.getWidth(), 0);
        blackAndWhite(cats5);
        copytoCanvas(cats5, canvas, 0, cats5.getHeight());
        canvas.explore();
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
        int red1, green1, blue1, red2, green2, blue2;
        Pixel[] pixels1 = source1.getPixels();
        Pixel[] pixels2 = source2.getPixels();
        
        for (Pixel spot: pixels1)
        {
            red1 = spot.getRed();
            green1 = spot.getGreen();
            blue1 = spot.getBlue();
        }
        for (Pixel spot: pixels2)
        {
            red2 = spot.getRed();
            green2 = spot.getGreen();
            blue2 = spot.getBlue();
            //spot.setRed((red1 + red2) / 2);
            //spot.setGreen((green1 + green2) /2);
            //spot.setBlue((blue1 + blue2) / 2);
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