class Student implements Cloneable
{
         public String Name;
         public int Age;
         public int Marks;

         public Student(String str, int A, int B)
         {
                this.Name = str;
                this.Age = A;
                this.Marks = B;
         }

         public Object clone()throws CloneNotSupportedException
         {
                   return super.clone();
         }


}


class CloneDemo
{
      public static void main(String Arg[])
      {
            try
            {
             Student obj1 = new Student("Shiv",21,85);

             Student obj2 = (Student)obj1.clone();      //copy

             System.out.println("Name :"+obj1.Name);
             System.out.println("Age :"+obj1.Age);
             System.out.println("Marks :"+obj1.Marks);

             System.out.println("Name :"+obj2.Name);
             System.out.println("Age :"+obj2.Age);
             System.out.println("Marks :" +obj2.Marks);

            }

            catch(Exception obj)
            {

            }

      }
}