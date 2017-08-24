package aug18;

import java.util.Iterator;
import java.util.LinkedList;

public class Test2 
{
    public static void main(String[] args) 
    {
        LinkedList al = new LinkedList();
        
        al.add(101);
        al.add("ABC");
        al.add(50.5);
        al.add(new String("ABC"));
        al.add(new Integer(102));
        al.add("ABC");
        al.add(5, "JKL");
        al.add(new Student(111, "Ram"));
        al.add(3, new Student(222, "Neha"));
        al.add(new Employee(211, "Emp 1"));
        al.add(7, new Employee(311, "Emp 2"));
        
        //traversing using iterator
        System.out.println("\nIterator");
        //Iterator itr = al.iterator();        //traverse in asc order
        Iterator itr = al.descendingIterator();//traverse in desc order
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