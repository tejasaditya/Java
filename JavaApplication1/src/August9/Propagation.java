package August9;

import java.io.IOException;

class A
{
    void m1()
    {
        throw new ArithmeticException("Error");
        //throw new IOException("Error");
    }
    void m2()
    {
        m1();
    }
    void m3()
    {
        m2();
    }
}      
public class Propagation 
{
    public static void main(String[] args) {
       
        
    }
    
}
