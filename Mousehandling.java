import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="Mousehandling.class" width=300 height=500>
</applet>
*/

public class Mousehandling extends Applet implements MouseListener, MouseMotionListener {
    String msg = "";
    int mousex = 0, mousey = 0;

    public void init() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void mouseClicked(MouseEvent me) {
        mousex = 0;
        mousey = 10;
        msg = "mouse clicked";
        repaint();
    }

    public void mouseEntered(MouseEvent me) {
        mousex = 0;
        mousey = 10;
        msg = "mouse entered";
        repaint();
    }

    public void mouseExited(MouseEvent me) {
        mousex = 0;
        mousey = 10;
        msg = "mouse exited";
        repaint();
    }

    public void mousePressed(MouseEvent me) {
        mousex = me.getX();
        mousey = me.getY();
        msg = "down";
        repaint();
    }

    public void mouseReleased(MouseEvent me) {
        mousex = me.getX();
        mousey = me.getY();
        msg = "up";
        repaint();
    }

    public void mouseDragged(MouseEvent me) {
        mousex = me.getX();
        mousey = me.getY();
        msg = "*";
        showStatus("Dragging mouse at " + mousex + "," + mousey);
        repaint();
    }

    public void mouseMoved(MouseEvent me) {
        showStatus("Moving mouse at " + me.getX() + "," + me.getY());
    }

    public void paint(Graphics g) {
        g.drawString(msg, mousex, mousey);
    }
}