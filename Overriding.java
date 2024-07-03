class Base
{
    public void fun()
    {
        System.out.println("Base fun...");
    }

    public void gun()
    {
       System.out.println("Base gun...");
    }
    public void sun()
    {
       System.out.println("Base sun...");
    }

} 

class Derived extends Base
{
     public void fun()
     {
       System.out.println("Derived fun...");
     }

     public void gun()
     {
       System.out.println("Derived gun...");
     }

     public void run()
     {
       System.out.println("Derived run...");
     }

}
 
 class Overriding
 {
      public static void main(String Arg[])
      {
           Derived dobj = new Derived();
           dobj.fun();
           dobj.gun();
           dobj.sun();
           dobj.run(); 

           Base bobj = new Derived();     //upcasting
           bobj.fun();
           bobj.gun();
           bobj.sun();
           //bobj.run(); error
      }
 }