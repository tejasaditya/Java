package aug11;

class Customer
{
    int amt = 10000;
    synchronized void withdraw(int amt)
    {
        System.out.println("Going to Withdraw");
        if(this.amt < amt)
        {
            System.out.println("Insufficient Balance...");
            System.out.println("Going to wait...");
            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
        this.amt = this.amt - amt;
        System.out.println("Withdraw Completed");
        System.out.println("New Balance after Withdraw : "+this.amt);
    }
    synchronized void deposit(int amt)
    {
        System.out.println("Going to deposit");
        this.amt = this.amt + amt;
        System.out.println("Deposit Completed");
        System.out.println("New Balance after Deposit : "+this.amt);
        notify();
    }
}
class MyThread3 extends Thread
{
    Customer c;
    MyThread3(Customer c) 
    {
        this.c = c;
    }
    public void run()
    {
        Thread t = Thread.currentThread();
        String nm = t.getName();
        if(nm.equals("A"))
        {
            c.deposit(5000);
        }
        else
        {
            c.withdraw(12000);
        }
    }
}
public class Test3 
{
    public static void main(String[] args) 
    {
        Customer c = new Customer();
        MyThread3 t1 = new MyThread3(c);
        MyThread3 t2 = new MyThread3(c);
        t1.setName("A");
        t2.setName("B");
        t1.start();
        t2.start();
    }
}