package August9;

import java.util.Scanner;

class InvalidAgeException extends Exception
{

    public InvalidAgeException(String message) 
    {
        super(message);
    }
    
}
class Vote
{
    
    void validate(int age) throws InvalidAgeException
    {
        if(age<18)
        {
            InvalidAgeException e = new InvalidAgeException("Must be above 18");
             throw e;
        }
        else
        {
            System.out.println("Welcome to the Illusion");
        }
      
    }
}
public class Custom_Exception {


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
        catch(InvalidAgeException e)
        {
            System.out.println(e);
        }
   
        
        
        }
}
