/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package August3;

/**
 *
 * @author tejas
 */
public class Main_method_overloading
{
    void main(String s)  //non static method
    {
        System.out.println("Welcome"+s);
    }
    static void main(int x, int y)  //static method
    {
        System.out.println("Sum: "+(x+y));
    }
    public static void main(String[] args)
    {
       Main_method_overloading.main(10,20);     //calling static main method
       Main_method_overloading t = new Main_method_overloading();
       t.main("ABC");       //calling non static nmain method through object
    }
}
