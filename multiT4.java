
class multiT4
{
     public static void main(String Arg[])
     {
          Shiv sobj1 = new Shiv();
          Shiv sobj2 = new Shiv();

          Thread t1 = new Thread(sobj1);
          Thread t2 = new Thread(sobj2);

          t1.start();
          t2.start();

     }
}

class Shiv extends Thread
{
        public void run()
        {
           try
           {
            for(int i = 1; i<10; i++)
            {
                 System.out.println(i);
                   Thread.sleep(5000);
            }
           }

           catch(Exception obj)
           {
                         
           }
        }
}
