package aug18;

import java.util.ArrayList;

public class Test1 
{
    public static void main(String[] args) 
    {
        ArrayList<String> al = new ArrayList<String>();
        //array list can contain string class objects only
       
        al.add("ABC");
        al.add(new String("XYZ"));
        al.add("ABC");
        al.add(2, "JKL");
        for(Object ob : al)
        {
            System.out.println(ob);
        }
    }
}