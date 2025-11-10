
/**
 * Write a description of class PicturePractice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PicturePractice
{
    public static void main (String [] args)
    {
        Picture kitten1 = new Picture("images/kitten2.jpg");
        Picture kitten2 = new Picture("images/kitten2.jpg");
        Picture kitten3 = new Picture("images/kitten2.jpg");
        Picture kitten4 = new Picture("images/kitten2.jpg");
        Picture kitten5 = new Picture("images/kitten2.jpg");
        Picture kitten6 = new Picture("images/kitten2.jpg");
        Picture kitten7 = new Picture("images/kitten2.jpg");
        
        kitten1.explore();
        
        //change color by a factor
        int red2;
        Pixel[] pixels2 = kitten2.getPixels();
        for (Pixel spot1: pixels2)
        {
            red2 = spot1.getRed();
            red2 = (int)(0.5 * red2);
            spot1.setRed(red2);
        }
        kitten2.explore();
        
        //negate
        int red3, blue3, green3;
        Pixel[] pixels3 = kitten3.getPixels();
        for (Pixel spot1: pixels3)
        {
            red3 = spot1.getRed();
            red3 = 255 - red3;
            spot1.setRed(red3);
            blue3 = spot1.getBlue();
            blue3 = 255 - blue3;
            spot1.setBlue(blue3);
            green3 = spot1.getGreen();
            green3 = 255 - green3;
            spot1.setGreen(green3);
        }
        kitten3.explore();
        
        //greyscale
        int red4, blue4, green4, grey;
        Pixel[] pixels4 = kitten4.getPixels();
        for (Pixel spot1: pixels4)
        {
            red4 = spot1.getRed();
            blue4 = spot1.getBlue();
            green4 = spot1.getGreen();
            grey = (red4 + blue4 + green4)/3;
        }
        kitten4.explore();
    }
}
