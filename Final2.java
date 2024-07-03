class Base
{
     public void fun()
     {
        System.out.println("Inside Base fun...");
     }

     final public void gun()
     {
       System.out.println("Inside Base gun...");
     }
}

class Derived extends Base
{
    public void fun()
    {
       System.out.println("Inside Derived fun...");
    }

    /*public void gun()
    {
       System.out.println("Inside Derived gun...");
    }*/ // Not Allowed because its final cant override...
}

class Final2
{
    public static void main(String Arg[])
    {
          Base obj = new Derived();
          obj.fun();
          obj.gun();
    }   
}