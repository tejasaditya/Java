package August4;

class X
{
    int a = 10;
    void m1()
    {
        System.out.println("Class X");
    }
}
class Y extends X
{
    int a = 20; //same name property
    void m1() //overrided method
    {
        System.out.println("Class Y");
        System.out.println(" A :"+a);
        System.out.println("Parent A : "+super.a);
    }
}
public class Super_Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Y ob = new Y();
        ob.m1(); //class Y
        
        X obj = new Y();    //upcasting 
        obj.m1();   //dynamic method dispatching(class Y)
        System.out.println("A: "+obj.a); //variable a of parent class cannot be overrided
        
    }
    
}
