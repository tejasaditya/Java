//constructor overloading

public class Area 
{
    Area(int x) 
    {
        System.out.println("Square Area : "+x*x);
    }
    Area(int x, int y)
    {
        System.out.println("Rect Area : "+x*y);
    }
    Area(double x)
    {
        System.out.println("Circle Area : "+3.14*x*x);
    }
    public static void main(String[] args) 
    {
        Area a1 = new Area(5);      //square
        Area a2 = new Area(5.0);    //circle
        Area a3 = new Area(5, 4);    //rect
    }
}