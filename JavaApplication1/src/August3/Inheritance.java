/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package August3;

class G
{
    void m1()
    {
        System.out.println("Class G method");
    }
}
class H extends G
{
    void m2()
    {
        System.out.println("Class H method");
    }
}
public class Inheritance 
{
    public static void main (String[] args)
    {
        H h = new H();
        h.m1();
        h.m2();
    }    
}
