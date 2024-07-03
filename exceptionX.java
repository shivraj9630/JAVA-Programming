import java.util.Scanner;

class exceptionX
{
      public static void main(String Arg[])
      {
         Scanner sobj = new Scanner(System.in);

         int No1 = 0;
         int No2 = 0;
         float Ans = 0;

         System.out.println("Enter First Number...");
         No1 = sobj.nextInt();

         System.out.println("Enter First Number...");
         No2 = sobj.nextInt();
          
          try
          {
            System.out.println("Inside Try Block...");
            Ans = No1 / No2;
          }

          catch(ArithmeticException obj)
          {
            System.out.println("Exception occourd and the code is inside catch block"+obj);
          }

          finally
          {
             System.out.println("Code is Inside finally Block...");
             System.out.println("Div is :"+Ans);
          }

      }
}