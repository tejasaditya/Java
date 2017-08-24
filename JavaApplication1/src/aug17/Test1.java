package aug17;

public class Test1 
{
    public static void main(String[] args) 
    {
        StringBuffer str = new StringBuffer("Welcome");
        
        System.out.println(str.append(" Tejas"));   //Welcome Tejas
        System.out.println(str.deleteCharAt(5));    //Welcoe Tejas
        System.out.println(str.delete(4, 9));       //Welcjas
        System.out.println(str.insert(4, "OME"));   //WelcOMEjas
        System.out.println(str.replace(4, 7, "ABCXY")); //WelcABCXYjas
        System.out.println(str.reverse());          //sajYXCBAcleW
        
        StringBuffer st = new StringBuffer("Hello");
        System.out.println("Original capacity : "+st.capacity());
        //16(default)+5=21
        
        //st.ensureCapacity(20);
        //st.ensureCapacity(30);      //(current cap * 2) + 2 = 44
        st.ensureCapacity(50);      //50
        
        System.out.println("New Capacity : "+st.capacity());
    }
}