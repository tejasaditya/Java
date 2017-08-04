package August4;
class A
{
    void m1()
    {
        System.out.println("Class A");
    }
}
class B extends A
{
    void m1()
    {
        System.out.println("Class B");
    }
}
public class Method_Overriding 
{
    public static void main()
    {
    A obj = new A();
    B ob = new B();
    obj.m1();
    ob.m1();
    }
}
