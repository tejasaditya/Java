
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tejas
 */
public class Student 
{
    int roll;
    String name;
    void input()
    {
        System.out.println("Student roll input :");
        Scanner sc = new Scanner(System.in);
        roll = sc.nextInt();
        System.out.println("Student name: ");
        name = sc.nextLine();       
                
    } 
    
    void show()
    {
        System.out.println("Name = "+name+"\tRoll = "+roll);
    }
    
    public static void  main(String s[])
    {
        Student st1 = new Student();
        Student st2 = new Student();
        
        st1.input();
        st2.show();
        
    }
}
