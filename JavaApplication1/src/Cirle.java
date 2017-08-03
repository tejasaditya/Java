import java.util.Scanner;

public class Cirle 
{
    double radius;
    double area;
    double cir;
    void input()
    {
        System.out.println("Cirle radius = ");
        Scanner sc = new Scanner(System.in);
        radius = sc.nextDouble();
    }
   
    void show()
    {
        area = 3.14*(radius*radius);
        cir = 2*3.14*radius;
        System.out.println("Cirle Area = "+area+" \t Circle Circumference "+cir);
    }
    public static void main(String[] args) 
    {
      Cirle c1 = new Cirle();
      c1.input();
      c1.show();
    }
}
