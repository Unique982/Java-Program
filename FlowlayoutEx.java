
package com.mycompany.desktopapp;
    import javax.swing. *;
    import java.awt. *;
public class FlowlayoutEx{
    JFrame f;
    JButton  b1,b2,b3,b4;
public FlowlayoutEx(){
    
    f =new JFrame ("Flowlayout Example");
    b1= new JButton("B1");
    b2= new JButton("B2");
    b3= new JButton("B3");
    b4= new JButton("B4");
    f.setSize(300,300);
    f.setVisible(true);
    f.setDefaultCloseOperation(3);
    f.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));
    f.add(b1);f.add(b2);f.add(b3);f.add(b4);
}
    public static void main(String[] args){
        new FlowlayoutEx();
    
    
    }
}
