import java.applet.*;  
import java.awt.*;  

/*
<applet code="Param" height=800 width=300>  
<param name="author" value="Herb and Dale">  
<param name="purpose" value="Demonstrate parameter's">  
<param name="version" value="2">  
</applet>  
*/

public class Param extends Applet {  
    String author;  
    String purpose;  
    int ver;  

    public void init() {  Typo in source, should be init() for applet parameters
        String temp;  
        author = getParameter("author");  
        if (author == null)  
            author = "author not found";  

        purpose = getParameter("purpose");  
        if (purpose == null)  
            purpose = "purpose not found";  

        temp = getParameter("version");  
        try {  
            if (temp != null) {  
                ver = Integer.parseInt(temp);  
            }  
        } catch (NumberFormatException e) {  Added specific catch for parseInt
            ver = 0;  Default or error value
        }
    }  

     Assuming paint method to display parameters based on typical applet structure
    public void paint(Graphics g) {
        g.drawString("Author: " + author, 10, 20);
        g.drawString("Purpose: " + purpose, 10, 40);
        g.drawString("Version: " + ver, 10, 60);
    }
}