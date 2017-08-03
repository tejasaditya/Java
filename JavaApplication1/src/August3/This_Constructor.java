/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package August3;

class X
{
    X()
    {
        System.out.println("First Constructor");
    }
    X(int a)
    {
        this(); //calls first
        System.out.println("Second");
        
    }
    X(int a, int b)
    {
        this(a);    //calls second
        System.out.println("Third");
    }
}
public class This_Constructor {
    public static void main(String[] args)
    {
        X x = new X(10,20);
    }
    
}
