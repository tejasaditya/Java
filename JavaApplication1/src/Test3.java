
import java.util.Scanner;

class Employee 
{
 int id;
 String name;
 String designation;

    Employee() 
    {
      System.out.println("Enter Id, name and Designation in order!");
        Scanner sc = new Scanner(System.in);
        id = sc.nextInt();
        name = sc.next();
        designation = sc.next();
    }

    Employee(int i, String nm, String t) {
        id = i;
       name = nm;
        designation = t ;
    }
    void show()
    {
        System.out.println("Employee details:\n id = "+id+"\t Name: "+name+"\t Designation :"+designation);
    }
}
public class Test3 {

    public static void main(String[] args) {
       Employee a = new Employee();
       Employee b = new Employee(10484,"ABC","XYZ");
       a.show();
       b.show();
    }   
}
