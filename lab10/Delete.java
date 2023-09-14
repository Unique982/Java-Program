
package lab10;
import java.sql.*;
public class Delete {
    public static void main(String[] args)throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/company","root","");
        Statement st=con.createStatement();
        String sql="Delete from employees where Eid=103";
        
        int row=st.executeUpdate(sql);
        if(row>0){
            System.out.println("Row is Delete.");
        }
        else{
            System.out.println("Error in Delete.");
        }
        con.close();
    }
}

