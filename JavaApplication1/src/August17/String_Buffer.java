
package August17;

public class String_Buffer 
{
    public static void main(String[] args) 
    {
        StringBuffer str = new StringBuffer("Welcome");
        
        System.out.println(str.append(" Tejas"));
        System.out.println(str.deleteCharAt(5));
        System.out.println(str.delete(4, 9));
        System.out.println(str.insert(4, "OME"));
        System.out.println(str.replace(4, 7, "ABCXYZ"));
        System.out.println(str.reverse());
        
        StringBuffer st  = new StringBuffer("Hello");
        System.out.println(st.capacity());      //16 by default + 5
        //st.ensureCapacity(20);
        st.ensureCapacity(30);  //(current capacity * 2 )+2
        st.ensureCapacity(50);      //50, if using formula once doesn't satisfy then it gives the specified capacity
        System.out.println("New Ca");
    }
    
}
