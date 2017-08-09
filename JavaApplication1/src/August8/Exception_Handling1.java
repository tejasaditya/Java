package August8;


import java.util.InputMismatchException;
import java.util.Scanner;


public class Exception_Handling1 {

    public static void main(String[] args) 
    {
        System.out.println("Welcome");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        try
        {
            try //nested try - always comes before any other further code otherwise it will go to catch block and the rest wont happen
            {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = a/b;           //Arithmetic Exception
            //ArithmeticException e = new ArithmeticException("/ by zero")
            //throw e;
            }
            catch(ArithmeticException ex)   // always before finally
             {
           // System.out.println(ex.getMessage());
            System.out.println(ex);     //more useful
             }
        catch(InputMismatchException ex)
            {
            System.out.println(ex);
             }
            int []z = new int[5];
            z[5] = 10;
        }
        catch(java.lang.Exception ef)
        {
            System.out.println(ef);
        }
        finally
        {
            System.out.println("Finally Block");
        }
        System.out.println("Bye");
    }
}
