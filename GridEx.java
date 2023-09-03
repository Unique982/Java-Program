
package com.mycompany.desktopapp;
import javax.swing.*;
import java.awt.*;
public class GridEx {
    JFrame f;
    JButton b1,b2,b3,b4;
    public GridEx(){
        f= new JFrame("GridExampel");
        b1= new JButton("one");
        b2 = new JButton("Two");
        b3 = new JButton("Three");
        b4 = new JButton("Four");
        f.setSize(300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setLayout(new GridLayout(2,3,20,20));
         f.add(b1);f.add(b2);f.add(b3);f.add(b4);
         
    }
    public static void main(String[]args){
        new GridEx();
    }
    
}
