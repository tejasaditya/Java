/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package August17;
//string object is immutable
public class String_Class 
{

    public static void main(String[] args) 
    {
        //using new Keyword
        String str = new String("Welcome to String Handling in Java");
        
        //by using literal
        String str1 = "Welcome";
        String str2 = "welcome";

        System.out.println(str.charAt(11)); //S
        System.out.println(str1.compareTo(str2));       //-32
        System.out.println(str1.compareToIgnoreCase(str2));     //0
        System.out.println(str1.equals(str2));  //false
        System.out.println(str1.equalsIgnoreCase(str2));    //true
        
        System.out.println(str1.concat("Tejas"));   //WelcomeTejas
        // str1  = str1.concat("Tejas");
        System.out.println(str1);   //Welcome
        
        System.out.println(str.endsWith("java"));       //false
        System.out.println(str.startsWith("Wel"));      //true\
        System.out.println();
    }
    
}
