package aug18;

import java.util.ArrayList;
import java.util.Iterator;

class Student
{
    int roll;
    String name;
    Student(int roll, String name) 
    {
        this.roll = roll;
        this.name = name;
    }
    void show()
    {
        System.out.println("Student : "+roll+" : "+name);
    }
}
class Employee
{
    int id;
    String name;
    Employee(int id, String name) 
    {
        this.id = id;
        this.name = name;
    }
    void display()
    {
        System.out.println("Employee : "+id+" : "+name);
    }
}
public class Test 
{
    public static void main(String[] args) 
    {
        ArrayList al = new ArrayList();
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
        
        //display
        for(int i=0;i<al.size();i++)
        {
            Object ob = al.get(i);
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
        
        //for each loop
        System.out.println("\nFor Each Loop");
        for(Object ob : al)
        {
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
        
        //Iterator
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