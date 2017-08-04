package August4;

abstract class G    //abstract class - needs to be even if one abstract method- cannot create object of this class
{
   abstract void m1();  //Abstract Method
    void m2()
    {
        System.out.println("Non-Abstract Method");
    }
}
class H extends G
{
    void m1()
    {
        System.out.println("Implemented Abstract method");
    }
}
public class Abstraction {

    public static void main(String[] args) {
        G ob = new H();
        ob.m1();
        ob.m2();
            }
}
