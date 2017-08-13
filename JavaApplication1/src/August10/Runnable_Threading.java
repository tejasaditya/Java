package august10;

class MyThread1 implements Runnable
{
  public void run()
    {
        for(int i =1;i<=10;i++)
        {
            System.out.println(i);
        }
    }
}
public class Runnable_Threading 
{
    public static void main(String[] args) 
    {
      MyThread1 t1 = new MyThread1();
      MyThread1 t2 = new MyThread1();
        Thread t3 = new Thread(t2);
        Thread t4 = new Thread(t1);
        t3.start();
        t4.start();
    }
}
