
package lab10;




import java.sql.*;
public class InsertData {

    public static void main(String[] args) throws Exception{
        //step1 load or register Driver
        Class.forName("com.mysql.jdbc.Driver");
        
        // setp2.Establish connection
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/company","root","");
                
                //step3.Prepare Statement
                Statement st=con.createStatement();
                String sql="insert into employees values(101,'Unique','KTM','BCA'),(102,'Khemraj Neupane','Dang','BBA'),(103,'Ram','PKR','BA')";
             
                //step4:Execute statement
                int row=st.executeUpdate(sql);
                //step5 handle result
                if(row>0)
                    System.out.println(row+" row is inserted");
                else{
                    System.out.println("Error in insert");
                }
                //Step6 close connection
                 con.close();
    }
    
}
