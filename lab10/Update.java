
package lab10;

import java.sql.*;

public class Update {
    public static void main(String[] args)throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/company","root","");
        Statement st=con.createStatement();
        String sql="update employees set address='KTM' where Eid=101";
        
        int row=st.executeUpdate(sql);
        if(row>0){
            System.out.println("Row is updated");
        }
        else{
            System.out.println("Error in update");
        }
        con.close();
    }
}

