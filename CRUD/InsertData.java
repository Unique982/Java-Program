/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CRUD;

/**
 *
 * @author Acer
 */
import java.sql.*;
public class InsertData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        //step1 load or register Driver
        Class.forName("com.mysql.jdbc.Driver");
        
        // setp2.Establish connection
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/BCAThird","root","");
                
                //step3.Prepare Statement
                Statement st=con.createStatement();
                String sql="insert into student values('Ramesh',102,'KTM'),('Harish',103,'Chitwan')";
             
                //step4:Execute statement
                int row=st.executeUpdate(sql);
                //step5 handle result
                if(row>0)
                    System.out.println(row+" row is inserted");
                 else
                    System.out.println("Error in insert");
                //Step6 close connection
    }
    
}
