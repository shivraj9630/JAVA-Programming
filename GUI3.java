import java.awt.*;

class ShivrajFrame
{
        public Frame fobj;  // it is referance
        public ShivrajFrame(String T)
        {
             fobj = new Frame(T);
             fobj.setSize(400,400);
             fobj.setVisible(true);
        }
}

class GUI3
{
    public static void main(String a[])
    {
          ShivrajFrame sobj = new ShivrajFrame("PPA");
    }
}