import java.awt.*;

class ShivrajFrame
{
        public ShivrajFrame(String title)
        {
             Frame fobj = new Frame(title);
             fobj.setSize(400,400);
             fobj.setVisible(true);
        }
}

class GUI2
{
    public static void main(String a[])
    {
          ShivrajFrame sobj = new ShivrajFrame("PPA");
    }
}