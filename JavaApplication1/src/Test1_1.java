
import java.util.Scanner;

public class Test1_1 
{    Scanner sc = new Scanner(System.in);
 int [][] a = new int[2][2];
    void input()
    {
        System.out.println("Please input 4 : ");
       
        for(int i = 0; i<2;++i)
        { 
            for(int j = 0; j<2;++j)
            a[i][j] = sc.nextInt();
        }
    }
    void max()
    {
       int max = a[0][0];
       for(int i = 0; i<2;++i)
       {
           for(int j = 0; j<2;++j)
           {
               if (a[i][j] > max)
                   max = a[i][j];
           }
       }
       System.out.println("Max = "+max);
    }
    public static void main(String[] args) 
    {
        Test1_1 t = new Test1_1();
        t.input();
        t.max();
    }
}
