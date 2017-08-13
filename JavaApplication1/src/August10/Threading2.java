
package august10;

class MyThread3 extends Thread
{
    public void run()
    {
       Thread t = Thread.currentThread(); // ref of currently running thread
       String nm = t.getName();
       if(nm.equals("Tejas"))
       {
           for(int i = 1;i<=10;i++)
           {
               System.out.println(nm+" : "+i);
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
public class Threading2 
{
    public static void main(String[] args) 
    {
       
        MyThread3 t1 = new MyThread3();
        MyThread3 t2 = new MyThread3();
        t1.setName("Tejas");
        t1.start();
        t2.start();
    }
}
