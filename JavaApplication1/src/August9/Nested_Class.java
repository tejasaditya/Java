package August9;

class Outer1
{
    private int x = 10;
    int y = 20;
    static int z = 30;
    static class Inner
    {
        void m1()
        {
            //System.out.println("X : "+x);
           // System.out.println("Y: "+y);
            System.out.println("Z : "+z);

        }
        static void m2()
        {
            System.out.println("Z "+z);
        }
    }
   
}
public class Nested_Class {
    public static void main(String[] args) {
        //Outer1 o = new Outer1();
       Outer1.Inner in = new Outer1.Inner();
        in.m1();
        Outer1.Inner.m2();
        
    }
    
}
