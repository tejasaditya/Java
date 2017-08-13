package aug11;

class Table1
{
   static synchronized void printTable(int x)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(x+" * "+i+" = "+(x*i));
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
class MyThread2 extends Thread
{
    Table1 tab;
    MyThread2(Table1 tab) 
    {
        this.tab = tab;
    }
    public void run()
    {
        Thread t = Thread.currentThread();
        String nm = t.getName();
        if(nm.equals("A"))
        {
            tab.printTable(5);
        }
        else if(nm.equals("B"))
        {
            tab.printTable(7);
        }
        else if(nm.equals("C"))
        {
            tab.printTable(9);
        }
        else if(nm.equals("D"))
        {
            tab.printTable(11);
        }
        else
        {
            System.out.println("Fail");
        }
    }
}
public class Test2 
{
    public static void main(String[] args) 
    {
        Table1 tab = new Table1();
        Table1 tab1 = new Table1();
        MyThread2 t1 = new MyThread2(tab);
        MyThread2 t2 = new MyThread2(tab);
        MyThread2 t3 = new MyThread2(tab1);
        MyThread2 t4 = new MyThread2(tab1);
        t1.setName("A");
        t2.setName("B");
        t3.setName("C");
        t4.setName("D");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
    }
}