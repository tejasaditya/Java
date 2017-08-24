package August21;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test1 
{
    public static void main(String[] args)
    {
        try
        {
            int roll;
            String name;
            float marks;
            long contact;
            
            InputStreamReader r = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(r);
            
            System.out.println("Enter roll no : ");
            roll = Integer.parseInt(br.readLine());
            
            System.out.println("Enter name : ");
            name = br.readLine();
            
            System.out.println("Enter marks : ");
            marks = Float.parseFloat(br.readLine());
            
            System.out.println("Enter contact no : ");
            contact = Long.parseLong(br.readLine());
            //load driver
            Class.forName("com.mysql.jdbc.Driver");
            
            //establish connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tejas","root","123456");
            
            //create/prepare statement
            PreparedStatement st = con.prepareStatement("insert into student values(?,?,?,?)");
            
            //set values for parameters
            st.setInt(1, roll);
            st.setString(2, name);
            st.setFloat(3, marks);
            st.setLong(4, contact);
            
            //execute statement
            int x = st.executeUpdate();
            
            if(x>0)
                System.out.println("Data Inserted");
            
            //close all connections
            st.close();
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}