
package august10;

class MyThread2 extends Thread
{
    public void run()
    {
        for(int i =1;i<=10;i++)
        {
            System.out.println(i);
            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}
public class Threading1
{

    public static void main(String[] args) throws InterruptedException
    {
       
        MyThread2 t1 = new MyThread2();
        MyThread2 t2 = new MyThread2();
        MyThread2 t3 = new MyThread2();
        t1.start();
          t1.join();// t1 is not interrupted and runs alone
//        t1.join(5000) //Not interrupted for 5 seconds
       t2.start();
       t3.start();        
        
    }
}
