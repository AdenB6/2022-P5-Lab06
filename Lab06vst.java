// Lab06vst.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*;


public class Lab06vst extends Applet
{

    public void paint(Graphics g)
    {
        // Draw Grid
        g.drawRect(10,10,780,580);
        g.drawLine(400,10,400,590);
        g.drawLine(10,300,790,300);



        // Draw Random Lines
        Random rndInt = new Random(12345);
        for (int k= 1; k <= 100; k++)

        {

            int x1 = rndInt.nextInt(391)+10;
            int y1 = rndInt.nextInt(291)+10;
            int x2 = rndInt.nextInt(391)+10;
            int y2 = rndInt.nextInt(291)+10;
            int red = rndInt.nextInt(256);
            int green =  rndInt.nextInt(256);
            int blue =  rndInt.nextInt(256);
            g.setColor(new Color(red,green,blue));
            g.drawLine(x1,y1,x2,y2);




        }





        // Draw Random Squares
         for (int k= 1; k<= 100; k++)

        {

            int x1 = rndInt.nextInt(341)+400;
            int y1 = rndInt.nextInt(241)+10;
            int width = 50;
            int red = rndInt.nextInt(256);
            int green =  rndInt.nextInt(256);
            int blue =  rndInt.nextInt(256);
            g.setColor(new Color(red,green,blue));
            g.fillRect(x1,y1,width,width);




        }





        // Draw Random Circles













        // Draw 3-D Box





    }

}



    
 