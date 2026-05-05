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
        Picture cats = new Picture("images/cats.jpg");
        Picture canvas = new Picture("images/canvas.jpg");
        copytoCanvas(cats, canvas, 0, 0);
        mirrorVertical(cats);
        copytoCanvas(cats, canvas, cats.getWidth(), 0);
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