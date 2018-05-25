/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package August24;

import java.text.DateFormat;
import java.util.Locale;

/**
 *
 * @author Sys
 */
public class Date {

    public static void main(String[] args) 
    {
        java.util.Date d = new java.util.Date();
        System.out.println(d);
        
        Locale lc = new Locale("hi", "IN");
        
        //formatting date
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, lc);
        String str = df.format(d);
        System.out.println(""+str);
        
        //formatting time
        DateFormat df1 = DateFormat.getTimeInstance(DateFormat.FULL, lc);
        String str1 = df1.format(d);
        System.out.println(""+str1);
    }
}
