package August8;

interface X
{
    void m1();
}
interface Y
{
    void m2();
}
interface Z extends X,Y
{
    void m3();
}


class XYZ implements Z
{

    public void m3() 
    {
        System.out.println("Method m3");
    }

    public void m1() 
    {
                System.out.println("Method m1");

    }

    public void m2() 
    {
                System.out.println("Method m1");

    }
    
}

public class MultipleInterfaces {

    public static void main(String[] args) 
    {
        XYZ ob = new XYZ();
        ob.m1();
        ob.m2();
        ob.m3();
        
    }
}
