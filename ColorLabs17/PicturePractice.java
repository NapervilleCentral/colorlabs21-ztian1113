
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
            spot1.setRed(grey);
            spot1.setBlue(grey);
            spot1.setGreen(grey);
        }
        kitten4.explore();
        
        //lighten
        int red5, blue5, green5;
        Pixel[] pixels5 = kitten5.getPixels();
        for (Pixel spot1: pixels5)
        {
            red5 = spot1.getRed();
            red5 = (int)(red5 + 50);
            spot1.setRed(red5);
            blue5 = spot1.getBlue();
            blue5 = (int)(blue5 + 50);
            spot1.setBlue(blue5);
            green5 = spot1.getGreen();
            green5 = (int)(green5 + 50);
            spot1.setGreen(green5);
        }
        kitten5.explore();
        
        //change pixel
        int red6, blue6, green6;
        Pixel[] pixels6 = kitten6.getPixels();
        for (Pixel spot1: pixels6)
        {
            red6 = spot1.getRed();
            red6 = (int)(red6 + 50);
            spot1.setRed(red6);
            blue6 = spot1.getBlue();
            blue6 = (int)(blue6 + 100);
            spot1.setBlue(blue6);
            green6 = spot1.getGreen();
            green6 = (int)(green6 - 100);
            spot1.setGreen(green6);
        }
        kitten6.explore();
        
        //colorify
        int red7, blue7, green7;
        Pixel[] pixels7 = kitten7.getPixels();
        for (Pixel spot1: pixels7)
        {
            red7 = spot1.getRed();
            blue7 = spot1.getBlue();
            green7 = spot1.getGreen();
            if ((50 < red7 && red7 < 125) && (115 < green7 && green7 < 175) && (160 < blue7 && blue7 < 255))
            {
                red7 = (int)(red7 + 50);
                spot1.setRed(red7);
                blue7 = (int)(blue7 + 5);
                spot1.setBlue(blue7);
                green7 = (int)(green7 + 5);
                spot1.setGreen(green7); 
            }
        }
        kitten7.explore();
    }
}
