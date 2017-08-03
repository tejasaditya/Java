/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package August3;

class A
{
    int x = 10;// instance variable
    void m1()
    {
        int x = 20;
        x = this.x +x;
        System.out.println("Local X :"+x);
        System.out.println("Instance x :"+this.x);
    }
}
public class This 
{
    public static void main(String[] args)
    {
        A a = new A();
        a.m1();
    }
}
