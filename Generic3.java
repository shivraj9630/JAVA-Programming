class Demo <T>
{
     public T Value;

     public void Accept(T no)
     {
         Value = no;
     }

     public void Display()
     {
       System.out.println(Value);
     }

}


class Generic3
{
    public static void main(String Arg[])
    {
       Demo <Integer> dobj1 = new Demo<Integer>();

       dobj1.Accept(11);
       dobj1.Display();

       Demo <Double> dobj2 = new Demo<Double>();
       dobj2.Accept(11.11);
       dobj2.Display();

    }
}