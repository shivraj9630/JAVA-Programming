import java.util.Scanner;

class exception1
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

         Ans = No1 / No2;

         System.out.println("Div is :"+Ans);
     }
}
