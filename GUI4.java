import java.awt.*;
import java.awt.event.*;


class ShivrajFrame
{
        public Frame fobj;  // it is referance
        public ShivrajFrame(String T)
        {
             fobj = new Frame(T);
             fobj.setSize(400,400);
             fobj.setVisible(true);
             fobj.addWindowListener(new ShivrajListener());
        }
}

class ShivrajListener implements WindowListener
{
        public void windowActivated(WindowEvent obj){}
        public void windowDeactivated(WindowEvent obj){}
        public void windowIconified(WindowEvent obj){}
        public void windowDeiconified(WindowEvent obj){}
        public void windowOpened(WindowEvent obj){}
        public void windowClosed(WindowEvent obj){}
        public void windowClosing(WindowEvent obj)
        {
             System.exit(0);
        }
}

class GUI4
{
    public static void main(String a[])
    {
          ShivrajFrame sobj = new ShivrajFrame("PPA");
    }
}