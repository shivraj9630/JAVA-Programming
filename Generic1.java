class Generic1
{
      public static void Display(Integer Arr[])
      {
         for(int no : Arr)                 // foreach
         {
            System.out.println(no);
         }
         
         /*for(int i = 0; i < Arr.length; i++)
         {
            System.out.println(Arr[i]);
         }*/

      }

      public static void main(String Arg[])
      {
          Integer A[] = {10,20,30,40,50};
          Integer B[] = {1,2,3,4,5};

          Display(A);
          Display(B);
      }
}