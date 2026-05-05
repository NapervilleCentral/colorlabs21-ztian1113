
/**
 * Write a description of class fixTemple here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class fixTemple
{
    
    public static void main(String[] args)
    {
        Picture temple = new Picture("images/temple.jpg");
        mirrorVertical(temple);
        temple.explore();
    }
    
    /**
     * Method to mirror on a vertical line in the middle of the picture based on the width
     */
    public static void mirrorVertical(Picture source)
    {
        int width = 550;
        int mirrorPoint = width / 2;
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        
        //loop through all the rows
        for (int y = 0; y < 125; y++)
        {
            //loop from 0 to the middle
            for (int x = 10; x < mirrorPoint; x++)
            {
                leftPixel = source.getPixel(x, y);
                rightPixel = source.getPixel(width - 1 - x, y);
                rightPixel.setColor(leftPixel.getColor());
                
            }
        }
    }
}
