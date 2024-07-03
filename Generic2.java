 class Generic2
{

      public static <T> void Display(T Arr[])
      {
         for(T no : Arr)                 // foreach
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
          Float B[] = {1.1f,2.2f,3.3f,4.4f,5.5f};
          Double C[] = {10.10,20.20,30.30};

          Display(A);
          Display(B);
          Display(C);
      }

}