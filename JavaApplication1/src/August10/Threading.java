
package august10;

class MyThread extends Thread
{
    public void run()
    {
        for(int i =1;i<=10;i++)
        {
            System.out.println(i);
        }
    }
}
public class Threading {

    public static void main(String[] args) {
       
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();
    }
}
