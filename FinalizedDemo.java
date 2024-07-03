class Shiv
{
      public int No1;
      public int No2;

      public Shiv()
      {
          System.out.println("Inside Default Const...");
          No1 = 0;
          No2 = 0;
      }

      public Shiv(int A, int B)
      {
          System.out.println("Inside Parameterised Const...");
          No1 = A;
          No2 = B;
      }
      
      protected void finalize()
      {
          System.out.println("Inside Finalize method...");
      }
}



class FinalizedDemo
{
      public static void main(String Arg[])
      {
           Shiv sobj1 = new Shiv();
           Shiv sobj2 = new Shiv(11,21);

           System.gc();

           sobj1 = null;
           sobj2 = null;


      }
}