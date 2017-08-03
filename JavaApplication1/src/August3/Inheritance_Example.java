/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package August3;

class Person
{
    int id;
    String name;

  Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void show()
    {
        System.out.println("Person id : "+id);
        System.out.println("Person name "+name);
        
    }
}
class Student extends Person
{
    String course;
    String college;

    Student(String course, String college, int id, String name) {
        super(id, name);
        this.course = course;
        this.college = college;
    }
    void display()
    {
        super.show();
        System.out.println("Student Course "+course);
        System.out.println("Student College : "+college);
    }
    
}
public class Inheritance_Example {
    public static void main(String[] args)
    {
        Student st = new Student("XYX","YZ",30,"ABC");
        Person p = new Person(102, "Neha");
        st.display();
        p.show();
    }
}
