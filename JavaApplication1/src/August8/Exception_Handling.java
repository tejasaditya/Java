package August8;


public class Exception_Handling {

    public static void main(String[] args) 
    {
        System.out.println("Welcome");
        try
        {
            int x = 10/0;           //Arithmetic Exception
            //ArithmeticException e = new ArithmeticException("/ by zero")
            //throw e;
        }
        catch(ArithmeticException ex)   // always before finally
        {
           // System.out.println(ex.getMessage());
            System.out.println(ex);     //more useful
        }
        finally
        {
            System.out.println("Finally Block");
        }
        System.out.println("Bye");
    }
}
