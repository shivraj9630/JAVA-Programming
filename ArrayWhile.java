// while loop


import java.util.*;

class ArrayWhile
{
    public static void main(String Arg[])
    {
       Scanner sobj = new Scanner(System.in);

       System.out.println("Enter the size of Array...");
       int iSize = sobj.nextInt();

       int Arr[] = new int[iSize];

       System.out.println("Enter the Elements...");

       int iCnt = 0;

       while(iCnt < iSize)
       {
          Arr[iCnt] = sobj.nextInt();
          iCnt++;

       }

       System.out.println("Element of Array...");
       while(iCnt < iSize)
       {
          System.out.println(Arr[iCnt]);              //System.out.println(Arr[0])
          iCnt++;                                     //System.out.println(Arr[1]);
       }


       
       

       
       

    }
}