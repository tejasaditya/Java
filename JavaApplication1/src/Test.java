class Student11
{
    int roll;
    String name;
    Student11()       //default constructor 
    {
        System.out.println("Default Constructor Called");
        roll = 101;
        name = "ABC";
    }
    void input(int r, String nm)
    {
        roll = r;
        name = nm;
    }
    void show()
    {
        System.out.println("Roll No : "+roll);
        System.out.println("Name : "+name);
    }
}
public class Test 
{
    public static void main(String[] args) 
    {
        Student11 st = new Student11();    //default constructor called
        Student11 st1 = new Student11();
        st1.input(102, "XYZ");
        st.show();
        st1.show();
    }
}