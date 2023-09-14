
package lab10;

import javax.swing.*;
import java.awt.*;
public class TableExample {
    JFrame f;
    JScrollPane sp;
    JTable tb;
    public TableExample(){
        f=new JFrame("Table Example");
        String colname[] ={"Roll","Name","Address","Phone","College"};
        String data [][] ={{"101","Unique","Dang","98767676","RRC"},
            {"102","Ram","KTM","987676768","RRC"},
                {"103","Hari","PKR","98767679","RRC"},
                {"104","Gita","KTM","98767671","RRC"},
           
        {"105","KhemRaj","Dang","98989898","RRc"}};
        tb = new JTable(data,colname);
        sp= new JScrollPane(tb);
        f.setSize(400,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setLayout(new FlowLayout());
        f.add(sp);
        }
    public static void main(String[]args){
        new TableExample();
    }
    }
    

