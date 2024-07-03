import java.util.*;

class Collection4
{
           public static void main(String Arg[])
           {
                Hashtable <String, Integer> hobj = new Hashtable<String, Integer>();

                hobj.put("C Programming", 900);
                
                hobj.put("C++ Programming",1200);

                hobj.put("java Programming",1500);

                hobj.put("phythn Programming",1600);

                System.out.println("Book price of java "+hobj.get("java Programming"));
                //hobj.remove("C++ Programming");

                Enumeration eobj = hobj.keys();
                System.out.println(hobj);
                
           }
}