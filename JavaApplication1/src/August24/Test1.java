/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package August24;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author Sys
 */
public class Test1 {

    public static void main(String[] args)
    {
        ResourceBundle rb = ResourceBundle.getBundle("myfile", new Locale("en","US"));
        String str1 = rb.getString("name1");
        String str2 = rb.getString("name2");
        System.out.println(""+str1);
        System.out.println(""+str2);
        
        //hindi
        ResourceBundle rb2 = ResourceBundle.getBundle("myfile", new Locale("hi", "IN"));
        Enumeration e = rb2.getKeys();
        while(e.hasMoreElements())
        {
            String key = (String)e.nextElement();
            String val = rb2.getString(key);
            System.out.println(key+" "+val);
        }
        
    }
}
