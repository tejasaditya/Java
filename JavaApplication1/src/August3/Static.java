/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package August3;


public class Static 
{
    int roll;
    String name;
    static String college;
    static
    {
        System.out.println("Static Block Execute");
        college = "ABC college";
    }
    Static(int r, String nm)
    {
        roll = r;
        name = nm;
    }
    void show()
    {
        System.out.println("Roll no. :"+roll);
        System.out.println("Name: "+name);
        System.out.println("College name"+college);
    }
    static void display()
    {
        System.out.println("Static college name : "+college);
    }
    public static void main(String[] args)
    {
        System.out.println("Main method execute");
        Static st1 = new Static(101, "Ram");
        Static st2 = new Static(102, "Neha");
        st1.show();
        st2.show();
        Static.display();
    }
}
