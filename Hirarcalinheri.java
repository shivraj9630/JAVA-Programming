class Base
{ 
    public int A;
    public int B;

    public Base()
    {
      System.out.println("Inside a Base constructor...");
      this.A = 11;
      this.B = 21;
    }

    public void Fun()
    {
      System.out.println("Inside Base Fun...");
    }

}

class Derived extends Base
{
     public int X;
     public int Y;

     public Derived()
     {
        System.out.println("Inside a Derived Constructor...");
        this.X = 10;
        this.Y = 20;
     }

     public void gun()
     {
        System.out.println("Inside a Derived gun...");
     }

}

class PPA extends Base
{
      public int Z;

      public PPA()
      {
         System.out.println("Inside a PPA constructor...");
         this.Z = 50;
      }

      public void sun()
      {
         System.out.println("Inside PPA sun...");
      }
}


class P 
{
     public static void main(String Arg[])
     {
        /* Derived dobj = new Derived();
         dobj.Fun();
         dobj.gun();

         System.out.println(dobj.A);
         System.out.println(dobj.B);
         System.out.println(dobj.X);
         System.out.println(dobj.Y);*/

         /*PPA pobj = new PPA();
         pobj.Fun();
         pobj.gun();
         pobj.sun();

         System.out.println(pobj.A);
         System.out.println(pobj.B);
         System.out.println(pobj.X);
         System.out.println(pobj.Y);
         System.out.println(pobj.Z);*/

         Derived dobj = new Derived();
         dobj.Fun();
         dobj.gun();
         System.out.println(dobj.A);
         System.out.println(dobj.X);

         PPA pobj = new PPA();
         pobj.Fun();
         pobj.sun();
         System.out.println(pobj.A);
         System.out.println(pobj.Z);
          


     }
}