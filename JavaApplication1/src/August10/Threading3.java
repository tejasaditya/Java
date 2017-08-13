
package august10;

class MyThread4 extends Thread
{
    public void run()
    {
       Thread t = Thread.currentThread(); // ref of currently running thread
       // int p = Thread.currentThread().getPriority();
       String nm = t.getName();
       int p = t.getPriority();
       if(p == Thread.MAX_PRIORITY)
       {
           for(int i = 1;i<=10;i++)
           {
               System.out.println(nm+" : "+i+" "+p);
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
       else
       {
           for(char ch = 'A';ch<='J';ch++)
           {
               System.out.println(nm+" : "+ch);
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
    }
}
public class Threading3 
{
    public static void main(String[] args) 
    {
       
        MyThread4 t1 = new MyThread4();
        MyThread4 t2 = new MyThread4();
        t1.setName("Tejas");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(7);
        t1.start();
        t2.start();
    }
}
