package August8;

interface G
{
    void m1();
    int x = 10;
}

class H
{
    void m2()
    {
        System.out.println("Class H, method m2");
    }
}


class I extends H implements G
{
    public void m1() 
    {
        System.out.println("Method m1");
    }
    void m3()
    {
        System.out.println("Method m3");
    }
}

public class Multiple {

    public static void main(String[] args) 
    {
        I ob = new I();
        ob.m1();
        ob.m2();
        ob.m3();
    }
}
