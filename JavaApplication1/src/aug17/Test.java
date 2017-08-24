package aug17;

public class Test 
{
    public static void main(String[] args) 
    {
        //using new keyword
        String str = new String("Welcome to String Handling in Java");
        
        //by using literal
        String str1 = "Welcome";
        String str2 = "welcome";
        
        System.out.println(str.charAt(11));        //S
        
        System.out.println(str1.compareTo(str2));  //-32
        System.out.println(str1.compareToIgnoreCase(str2)); //0
        System.out.println(str1.equals(str2));      //false
        System.out.println(str1.equalsIgnoreCase(str2));    //true
        
        System.out.println(str1.concat("Tejas"));   //WelcomeTejas
        //str1 = str1.concat("Tejas");
        System.out.println(str1);                   //Welcome
        
        System.out.println(str.endsWith("java"));    //false
        System.out.println(str.startsWith("Wel"));   //true
        
        //Welcome to String Handling in Java
        System.out.println(str.indexOf("in"));      //14
        System.out.println(str.lastIndexOf("in"));  //27
        System.out.println(str.indexOf("in", 15));  //23
        System.out.println(str.length());           //34
        System.out.println(str.replace("in", "IN"));
        System.out.println(str.replaceFirst("in", "IN"));
        System.out.println(str.substring(15));
        System.out.println(str.substring(15, 20));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        //Welcome to String Handling in Java
        char ch[] = str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            System.out.print(ch[i]+"  ");
        }
        System.out.println();
        
        String st[] = str.split("in", 3);//split on 'in' basis into 3 parts
        String st1[] = str.split("in");       //split on 'in' basis
        String st2[] = str.split(" ");       //split on space basis
        for(int j=0;j<st.length;j++)
        {
            System.out.println(st[j]);
        }
    }
}