package August8;


import java.util.Scanner;

class Vote
{
    
    void validate(int age)
    {
        if(age<18)
        {
            ArithmeticException e = new ArithmeticException("Must be above 18");
             throw e;
        }
        else
        {
            System.out.println("Welcome to the Illusion");
        }
      
    }
}
public class Exception {


    public static void main(String[] args) 
    {
        System.out.println(" Hello");
        Scanner sc = new Scanner(System.in);   
        int a = sc.nextInt();
        Vote v = new Vote();
        try
        {
            v.validate(a);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
   
        
        
        }
}
