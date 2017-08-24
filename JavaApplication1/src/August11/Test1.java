package August11;

class Table
{
    /*synchronized*/void printTable(int x)
    {
        synchronized(this)
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
        //non synchronized block of same method
    }
}
class MyThread1 extends Thread
{
    Table tab;
    MyThread1(Table tab) 
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
        else
        {
            tab.printTable(7);
        }
    }
}
public class Test1 
{
    public static void main(String[] args) 
    {
        Table tab = new Table();
        MyThread1 t1 = new MyThread1(tab);
        MyThread1 t2 = new MyThread1(tab);
        t1.setName("A");
        t2.setName("B");
        t1.start();
        t2.start();
    }
}