class Array1 
{
    public static void main(String Arg[])
    {
       int Arr1[] = {10,20,30,40,50};   //Static

       int Arr2[] = new int[5];

       Arr2[0] = 11;
       Arr2[1] = 21;
       Arr2[2] = 31;
       Arr2[3] = 41;
       Arr2[4] = 51;

       System.out.println("Length of Arr1..."+Arr1.length);
       System.out.println("Length of Arr2..."+Arr2.length);
       System.out.println(Arr2[2]);
    }
}