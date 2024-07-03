import Shivraj.Arithmatic;
import Shivraj.Mathamatic;
import Shivraj.Batches.PPA;

class Package
{
      public static void main(String Arg[])
      {
          Arithmatic aobj = new Arithmatic();
          Mathamatic mobj = new Mathamatic();
          PPA pobj = new PPA();

          int iRet = 0;

          iRet = aobj.Add(11,21);
          System.out.println("Add is :"+iRet);

          iRet = aobj.Sub(10,20);
          System.out.println("Sub is :"+iRet);

          iRet = mobj.Square(10);
          System.out.println("Square is :"+iRet);

          iRet = mobj.Cube(10);
          System.out.println("Cube is :"+iRet);

         pobj.Display();

      }
}