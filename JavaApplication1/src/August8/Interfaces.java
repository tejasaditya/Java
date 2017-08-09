package August8;

interface A
{
   int x = 10; //by default public,static and final
   void m1();   //by defalt public and abstract
   void m2();   //""
}

class B implements A
{
    public void m1() 
    {
        System.out.println("Method m1");
        System.out.println("X: "+x);
    }

    public void m2()
    {
        System.out.println("Method m2");
    }
    
}
public class Interfaces {

   
    public static void main(String[] args) 
    {
        B ob = new B();
        ob.m1();
        ob.m2();
    }
}
