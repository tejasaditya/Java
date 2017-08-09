class Student1
{
    int roll;
    String name;
    Student1()       //default constructor 
    {
        System.out.println("Default Constructor Called");
        roll = 101;
        name = "ABC";
    }
    Student1(int r, String nm)  //parameterized constructor
    {
        System.out.println("Pareameterized Constructor Called");
        roll = r;
        name = nm;
    }
    void show()
    {
        System.out.println("Roll No : "+roll);
        System.out.println("Name : "+name);
    }
}
public class Test2 
{
    public static void main(String[] args) 
    {
        Student1 st = new Student1();    //default constructor called
        Student1 st1 = new Student1(111, "XYZ"); //call parameterized
        st.show();
        st1.show();
    }
}