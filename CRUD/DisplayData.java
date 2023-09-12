package CRUD;
import java.sql.*;
public class DisplayData {
public static void main(String[] args) throws Exception{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/BCAThird","root","");
    Statement st=con.createStatement();
    String sql="select * from student";
    ResultSet rs=st.executeQuery(sql);
    System.out.println("Roll\tName\tAddress");
    while(rs.next())
    {
      System.out.println(rs.getString(1)+"\t"+rs.getInt(2)+"\t"+rs.getString(3));
    }
    con.close();
}    
}
