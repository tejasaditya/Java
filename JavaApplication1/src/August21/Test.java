package August21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test 
{
    public static void main(String[] args)
    {
        try
        {
            //load driver
            Class.forName("com.mysql.jdbc.Driver");
            
            //establish connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tejas","root","123456");
            
            //create/prepare statement
            Statement st = con.createStatement();
            
            //execute statement
            int x = st.executeUpdate("insert into student values(102, 'Ritu', 89, 9876543210)");
            
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