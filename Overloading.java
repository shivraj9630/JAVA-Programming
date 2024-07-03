class Demo
{
   public int Add (int A , int B)
   {
          return A+B;
   }
   public int Add (int A , int B , int C)
   {
          return A+B+C;
   }

   
   public double Add (Double A , double B)
   {
       
          return A+B;
   }

   public double Add (Double A , double B , doubleC)
   {
          return A+B+C;
   }


}

class Overloading
{
          public static void  main(String Arg[])
          {
          Demo obj = new Demo();
          int A = 10 , int B = 20 , int C = 30 , iRet = 0;
          double A = 10.10 ,double B = 11.11, double C = 30.30 , dRet = 0.0;

            iRet = obj.Add(A, B);
            System.out.println(iRet);
            iRet = obj.Add(A, B , C);
            System.out.println(iRet);
            iRet = obj.Add(A, B);
            System.out.println(iRet);
            iRet = obj.Add(X, Y);
            System.out.println(iRet);
            iRet = obj.Add(X,Y,Z);
            System.out.println(dRet);
}

} 
