import java.util.*;

class Collection1
{
     public static void main(String Arg[])
     {
            LinkedList<Integer> lobj = new LinkedList<Integer>();

            lobj.add(10);
            lobj.add(20);
            lobj.add(30);
            lobj.add(40);
            lobj.add(50);

            System.out.println("Element are :"+lobj);

           /* Iterator iobj = lobj.iterator();

            while(iobj.hasNext())
            {
               System.out.println(iobj.next());
            }*/
     }
}