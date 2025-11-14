
/**
 * Write a description of class SheparFaireyLab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

public class SheparFaireyLab
{
    public static void main(String[] args)
    {
         Picture pic = new Picture("images/ShepardFairey.jpg");

         //pic.explore();
         
         int red, green, blue, grey;
         Pixel[] pixels = pic.getPixels();
         
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
         pic.explore();
         pic.write("images/megrey.jpg");
         
         
         
         //method 1
         for (Pixel spot: pixels)
         {
             red = spot.getRed();
             green = spot.getGreen();
             blue = spot.getBlue();
             grey = (red + green + blue)/3;
             if (grey < 64)
             {
                 spot.setRed(0);
                 spot.setGreen(0);
                 spot.setBlue(100);
             }
             else if (grey < 128)
             {
                 spot.setRed(200);
                 spot.setGreen(10);
                 spot.setBlue(10);
             }
             else if (grey < 192)
             {
                 spot.setRed(175);
                 spot.setGreen(215);
                 spot.setBlue(250);
             }
             else
             {
                 spot.setRed(235);
                 spot.setGreen(230);
                 spot.setBlue(220);
             }
         }
         pic.explore();
         
         
         /**/
         Picture me2 = new Picture("images/megrey.jpg");
         Pixel[] pixels2 = me2.getPixels();
         //method 2
         for (Pixel spot: pixels2)
         {
             red = spot.getRed();
             green = spot.getGreen();
             blue = spot.getBlue();
             grey = (red + green + blue)/3;
             if (grey < 75)
             {
                 spot.setRed(0);
                 spot.setGreen(0);
                 spot.setBlue(100);
             }
             else if (grey < 135)
             {
                 spot.setRed(200);
                 spot.setGreen(10);
                 spot.setBlue(10);
             }
             else if (grey < 195)
             {
                 spot.setRed(175);
                 spot.setGreen(215);
                 spot.setBlue(250);
             }
             else
             {
                 spot.setRed(235);
                 spot.setGreen(230);
                 spot.setBlue(220);
             }
         }
         me2.explore();
         /**/
         
         /**/
         Picture me3 = new Picture("images/megrey.jpg");
         Pixel[] pixels3 = me3.getPixels();
         //trial 1
         for (Pixel spot: pixels3)
         {
             red = spot.getRed();
             green = spot.getGreen();
             blue = spot.getBlue();
             grey = (red + green + blue)/3;
             if (grey < 51)
             {
                 spot.setRed(50);
                 spot.setGreen(19);
                 spot.setBlue(37);
             }
             else if (grey < 102)
             {
                 spot.setRed(88);
                 spot.setGreen(15);
                 spot.setBlue(60);
             }
             else if (grey < 153)
             {
                 spot.setRed(174);
                 spot.setGreen(29);
                 spot.setBlue(55);
             }
             else if (grey < 204)
             {
                 spot.setRed(211);
                 spot.setGreen(142);
                 spot.setBlue(89);
             }
             else
             {
                 spot.setRed(255);
                 spot.setGreen(246);
                 spot.setBlue(208);
             }
         }
         me3.explore();
         /**/
         
         
         Picture me4= new Picture("images/megrey.jpg");
         Pixel[] pixels4 = me4.getPixels();
         //trial 2
         for (Pixel spot: pixels4)
         {
             red = spot.getRed();
             green = spot.getGreen();
             blue = spot.getBlue();
             grey = (red + green + blue)/3;
             if (grey < 60)
             {
                 spot.setRed(50);
                 spot.setGreen(19);
                 spot.setBlue(37);
             }
             else if (grey < 120)
             {
                 spot.setRed(88);
                 spot.setGreen(15);
                 spot.setBlue(60);
             }
             else if (grey < 185)
             {
                 spot.setRed(174);
                 spot.setGreen(29);
                 spot.setBlue(55);
             }
             else if (grey < 220)
             {
                 spot.setRed(211);
                 spot.setGreen(142);
                 spot.setBlue(89);
             }
             else
             {
                 spot.setRed(255);
                 spot.setGreen(246);
                 spot.setBlue(208);
             }
         }
         me4.explore();
         
         
         Picture me5= new Picture("images/megrey.jpg");
         Pixel[] pixels5 = me5.getPixels();
         //trial 3 FINAL
         for (Pixel spot: pixels5)
         {
             red = spot.getRed();
             green = spot.getGreen();
             blue = spot.getBlue();
             grey = (red + green + blue)/3;
             if (grey < 57)
             {
                 spot.setRed(50);
                 spot.setGreen(19);
                 spot.setBlue(37);
             }
             else if (grey < 115)
             {
                 spot.setRed(88);
                 spot.setGreen(15);
                 spot.setBlue(60);
             }
             else if (grey < 168)
             {
                 spot.setRed(174);
                 spot.setGreen(29);
                 spot.setBlue(55);
             }
             else if (grey < 209)
             {
                 spot.setRed(211);
                 spot.setGreen(142);
                 spot.setBlue(89);
             }
             else
             {
                 spot.setRed(255);
                 spot.setGreen(246);
                 spot.setBlue(208);
             }
         }
         me5.explore();
         
         
         Picture me6= new Picture("images/megrey.jpg");
         Pixel[] pixels6 = me6.getPixels();
         //trial 4
         for (Pixel spot: pixels6)
         {
             red = spot.getRed();
             green = spot.getGreen();
             blue = spot.getBlue();
             grey = (red + green + blue)/3;
             if (grey < 57)
             {
                 spot.setRed(50);
                 spot.setGreen(19);
                 spot.setBlue(37);
             }
             else if (grey < 112)
             {
                 spot.setRed(88);
                 spot.setGreen(15);
                 spot.setBlue(60);
             }
             else if (grey < 165)
             {
                 spot.setRed(174);
                 spot.setGreen(29);
                 spot.setBlue(55);
             }
             else if (grey < 208)
             {
                 spot.setRed(211);
                 spot.setGreen(142);
                 spot.setBlue(89);
             }
             else
             {
                 spot.setRed(255);
                 spot.setGreen(246);
                 spot.setBlue(208);
             }
         }
         me6.explore();
         
    }     
}
