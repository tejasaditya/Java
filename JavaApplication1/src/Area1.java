//method overloading

public class Area1 
{
    void calArea1(int x) 
    {
        System.out.println("Square Area : "+x*x);
    }
    void calArea1(int x, int y)
    {
        System.out.println("Rect Area : "+x*y);
    }
    void calArea1(double x)
    {
        System.out.println("Circle Area : "+3.14*x*x);
    }
    public static void main(String[] args) 
    {
        Area1 a1 = new Area1();
        a1.calArea1(5.0);
        a1.calArea1(5);
        a1.calArea1(4, 5);
    }
}