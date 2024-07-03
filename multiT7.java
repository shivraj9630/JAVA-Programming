class Shiv extends Thread
{
        public void run()
        {
             Display();
        }
        synchronized public void Display()
        {
            for(int i = 1; i < 10; i++)
            {
                System.out.println(i);
            }
        }
}

class multiT7
{
      public static void main(String Arg[]) throws Exception
      {
          Shiv obj1 = new Shiv();
          Shiv obj2 = new Shiv();

          Thread t1 = new Thread(obj1);
          Thread t2 = new Thread(obj2);

          t1.start();
          t2.start();
          
      }
}