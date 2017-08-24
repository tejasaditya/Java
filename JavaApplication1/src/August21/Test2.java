package August21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test2 
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
            ResultSet rs = st.executeQuery("select * from student");
            
            //process the result
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" : "+rs.getString("name")+" : "+rs.getFloat(3)+" : "+rs.getLong(4));
            }
            
            //close all connections
            rs.close();
            st.close();
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}