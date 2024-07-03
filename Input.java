import java.util.*;

class Input
{
     public static void main(String Arg[])
     {
       Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter First Number...");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter Second Number...");
        int iNo2 = sobj.nextInt();

        int iAns = 0;
        iAns = iNo1 + iNo2;
        System.out.println("Add is..."+iAns);

        sobj.close();

     }

}