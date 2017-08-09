package August9;

class Outer
{
    private int x = 10;
    int y = 20;
    static int z = 30;
    class Innner
    {
        void m1()
        {
            System.out.println("X : "+x);
            System.out.println("Y: "+y);
            System.out.println("Z : "+z);

        }
        /*static void m2()
        {
            
        }*/
    }
   
}
public class Inner_Class {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Innner in = o.new Innner();
        in.m1();
    }
    
}
