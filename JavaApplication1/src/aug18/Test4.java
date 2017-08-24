package aug18;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test4 
{
    public static void main(String[] args) 
    {
        LinkedHashSet al = new LinkedHashSet();     //insertion order
        
        al.add(101);
        al.add("ABC");
        al.add(50.5);
        al.add(new String("ABC"));
        al.add(new Integer(102));
        al.add("ABC");
        al.add(new Student(111, "Ram"));
        al.add(new Employee(211, "Emp 1"));
        
        //traversing using Iterator
        System.out.println("\nIterator");
        Iterator itr = al.iterator();
        while(itr.hasNext())
        {
            Object ob = itr.next();
            if(ob instanceof Student)
            {
                Student st = (Student)ob;       //downcasting
                st.show();
            }
            else if(ob instanceof Employee)
            {
                Employee e = (Employee)ob;
                e.display();
            }
            else
                System.out.println(ob);
        }
    }
}