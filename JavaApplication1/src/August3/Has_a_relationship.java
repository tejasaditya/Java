/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package August3;

import java.util.Scanner;

class Address 
{
    String city;
    String state;
    int pin;
    String country;
    Address(String country,String state, String city, int pin)
    {
       /** Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your country: ");
        country = sc.next();
        System.out.println("Please Enter your state: ");
        state = sc.next();
        System.out.println("Please Enter your city: ");
        city = sc.next();
        System.out.println("Please Enter your pin: ");
        pin = sc.nextInt();**/
        this.city = city;
        this.state = state;
        this.country = country;
        this.pin = pin;
    }
    void show()
    {
        System.out.println(""+country+state+city+pin);
    }
}
class Employee
{
    int id;
    String name;
    Address addr; // has a relationship

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    Employee(int id, String name, Address add) {
        this.id = id;
        this.name = name;
        this.addr = add;
    }
    void display()
    {
        System.out.println("Id : "+id);
        System.out.println("Name: "+name);
        if(addr!=null)
            addr.show();
    }
    
}
public class Has_a_relationship
{
    
    public static void main(String[] args)
    {
       Address ad = new Address("India", "Delhi","Delhi" ,110085);
       Employee e1 = new Employee(201,"Ram",ad);
       Employee e2 = new Employee(202,"Neha", ad);
       Employee e3 = new Employee(203,"Deepak");
       e1.display();
       e2.display();
       e3.display();
    }
}
