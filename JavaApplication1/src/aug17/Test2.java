package aug17;

import java.util.ArrayList;

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
        System.out.println(roll+" : "+name);
    }
}
public class Test2 
{
    public static void main(String[] args) 
    {
        ArrayList al = new ArrayList();
        //insertion in array list
        al.add("ABC");
        al.add(101);
        al.add(new String("XYZ"));
        al.add(10.5);
        al.add("ABC");
        al.add(new Integer(102));
        al.add(new Student(111, "JKL"));
        al.add(3, new Student(112, "PQR"));
        
        //display array list
        for(int i=0;i<al.size();i++)
        {
            Object ob = al.get(i);
            if(ob instanceof Student)
            {
                Student st = (Student)ob;
                st.show();
            }
            else
            {
                System.out.println(ob);
            }
        }
    }
}