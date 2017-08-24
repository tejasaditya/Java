package aug18;

import java.util.Iterator;
import java.util.TreeSet;

public class Test5 
{
    public static void main(String[] args) 
    {
        TreeSet al = new TreeSet();     //ascending order
        
        al.add("ABC");
        al.add(new String("XYZ"));
        al.add("JKL");
        
        //traversing using Iterator
        System.out.println("\nIterator");
        Iterator itr = al.iterator();
        while(itr.hasNext())
        {
            Object ob = itr.next();
            System.out.println(ob);
        }
    }
}