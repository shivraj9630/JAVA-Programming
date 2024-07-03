import java.awt.*;
import java.awt.event.*;

class ShivrajFrame
{
      public Frame fobj;
      public ShivrajFrame(String T)
      {
            fobj = new Frame(T);
            fobj.setSize(500,500);
            fobj.setVisible(true);

            fobj.addWindowListener(new Listener());
      }
}

class Listener extends WindowAdapter
{
      public void windowClosing(WindowEvent obj)
      {
            System.exit(0);
      }
}

class GUI5
{
      public static void main(String Arg[])
      {
          ShivrajFrame sobj = new ShivrajFrame("SHIV");
      }
}