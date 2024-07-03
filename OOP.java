class OOP
{
    public static void main(String Arg[])
    {
      System.out.println("Inside main Function...............");

      Arithematic obj1 = new Arithematic();
      Arithematic obj2 = new Arithematic(11,21);

      int iRet = 0;

      iRet = obj1.Addition();
      System.out.println("Add is..."+iRet);

      iRet = obj1.Substraction();
      System.out.println("Sub is..."+iRet);

      iRet = obj2.mul();
      System.out.println("Mul is..."+iRet);

      iRet = obj2.Div();
      System.out.println("Div is..."+iRet);

    }

}

class Arithematic
{
      public int No1;
      public int No2;

      public Arithematic()     // Default constructor
      {
         System.out.println("Inside a Default constructor........");
         this.No1 = 10;
         this.No2 = 20;
      }


      public Arithematic(int i, int j)      // Parametrised constructor
      {
         System.out.println("Inside Parametrised constructor.......");
         this.No1 = i;
         this.No2 = j;
      }

      public int Addition()
      {
         int Ans  = 0;
         Ans = this.No1 + this.No2;
         return Ans;
      }

      public int Substraction()
      {
         int Ans = 0;
         Ans = this.No1 - this.No2;
         return Ans;
      }

      public int mul()
      {
         int Ans = 0;
         Ans = this.No1 * this.No2;
         return Ans;
      }

      public int Div()
      {
         int Ans = 0;
         Ans = this.No1 / this.No2;
         return Ans;
      }

}

