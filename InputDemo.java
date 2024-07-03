import java.io.*;

class InputDemo
{
    public static void main(String Arg[])throws IOException
    {
       BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
       int No1 = 0;
       int No2 = 0;
       
       try
       {
       System.out.println("Enter First Number...");
       No1 = Integer.parseInt(obj.readLine());
       
       System.out.println("Enter Second Number...");
       No2 = Integer.parseInt(obj.readLine());
       }

       catch(IOException aobj)
       {

       }
       
       finally
       {
       int Ans = 0;
       Ans = No1 + No2;
       System.out.println("Add is :"+Ans);
       }

    }

}