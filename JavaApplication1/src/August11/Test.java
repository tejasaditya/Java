package aug11;

class MyThread extends Thread
{
    public void run()
    {
        Thread t = Thread.currentThread();
        boolean b = t.isDaemon();
        if(b==true)
        {
            //daemon thread
            for(int i=1;i<=10;i++)
            {
                System.out.println("Daemon Thread : "+i);
                try
                {
                    Thread.sleep(2000);
                }
                catch(InterruptedException e)
                {
                    System.out.println(e);
                }
            }
        }
        else
        {
            //user thread
            for(int i=65;i<=74;i++)
            {
                System.out.println("User Thread : "+(char)i);
                try
                {
                    Thread.sleep(1500);
                }
                catch(InterruptedException e)
                {
                    System.out.println(e);
                }
            }
        }
    }
}
public class Test 
{
    public static void main(String[] args) 
    {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.setDaemon(true);
        t1.start();
        t2.start();
    }
}