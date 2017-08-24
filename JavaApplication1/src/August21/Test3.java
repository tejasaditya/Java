package August21;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Test3 
{
    public static void main(String[] args)
    {
        try
        {
            //load driver
            Class.forName("com.mysql.jdbc.Driver");
            
            //establish connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tejas","root","123456");

            //Database Info
            DatabaseMetaData dbmd = con.getMetaData();
            
            System.out.println("Driver Name : "+dbmd.getDriverName());
            System.out.println("Connection URL : "+dbmd.getURL());
            System.out.println("User Name : "+dbmd.getUserName());
            
            //create/prepare statement
            Statement st = con.createStatement();
            
            //execute statement
            ResultSet rs = st.executeQuery("select * from student");
            
            //ResultSet Info
            ResultSetMetaData rsmd = rs.getMetaData();
            
            System.out.println("Table Name : "+rsmd.getTableName(1));
            System.out.println("No of Columns : "+rsmd.getColumnCount());
            for(int i=1;i<=rsmd.getColumnCount();i++)
            {
                System.out.println("Column Name : "+rsmd.getColumnName(i)+
                        " \t\t Column Data Type :  "+rsmd.getColumnTypeName(i));
            }
            
            //process the result
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" : "+rs.getString("name")+
                        " : "+rs.getFloat(3)+" : "+rs.getLong(4));
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