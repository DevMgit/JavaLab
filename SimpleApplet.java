import java.applet.*;  
import java.awt.*;  

/*
<applet Code="SimpleApplet" height=300 width=300>  
</applet>  
*/

public class SimpleApplet extends Applet {
    public void paint(Graphics g) { 
        g.drawString("Simple Applet", 100, 100); 
    } 
} 