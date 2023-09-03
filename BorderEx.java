
package com.mycompany.desktopapp;
import javax.swing. *; 
import java.awt. *;
public class BorderEx {
    JFrame f;
    JButton b1,b2,b3,b4,b5;
 public BorderEx(){
     f= new JFrame ("BorderLayout Ex");
     b1= new JButton("Button-1");
     b2 = new JButton("Button-2");
     b3= new JButton("Button-3");
     b4 = new JButton("Button-4");
     b5 = new JButton("Button-5");
      f.setSize(300,300);
     f.setVisible(true);
     f.setDefaultCloseOperation(3);
     f.setLayout(new BorderLayout(20,20));
     f.add(b1,BorderLayout.EAST); 
     f.add(b2, BorderLayout.WEST);
     f.add(b3,BorderLayout.NORTH);
     f.add(b4, BorderLayout.SOUTH);
     f.add(b5,BorderLayout.CENTER);
 }   
 
    public static void main(String [] args){
        new BorderEx();
    }
}

