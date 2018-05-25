/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package August24;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Sys
 */
public class Test {

    public static void main(String[] args) 
    {
        
        Locale lc = new Locale("fr", "FR");
        
        //formatting number
        NumberFormat nf = NumberFormat.getNumberInstance(lc);
        String str = nf.format(456);
        System.out.println(""+str);
        
        //formatting time
        NumberFormat nf1 = NumberFormat.getCurrencyInstance(lc);
        String str1 = nf1.format(456);
        System.out.println(""+str1);
    }
}
