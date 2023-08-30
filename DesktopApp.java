
package com.mycompany.desktopapp;

import javax.swing . *;
public class DesktopApp {
    JFrame f;
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    
JButton b1;
public DesktopApp(){
    f= new JFrame ("Addition");
    l1= new JLabel ("Frist Num");
    l2= new JLabel ("Second Num");
    l3 = new JLabel ("Result");
    t1= new JTextField (25);
    t2 = new JTextField(25);
    t3 = new JTextField (25);
    b1= new JButton("ADD");
    f.add(l1); f.add(l2); f.add(l3);
    f.add(t1); f.add(t2); f.add(t3);
    f.add(b1);
    f.setSize(400,400);
    f.setVisible(true);
    f.setDefaultCloseOperation(3);
    f.setLayout(null);
    l1.setBounds(20,50,100,20);
    t1.setBounds(150,50,100,20);
    l2.setBounds(20,100,100,20);
  t2.setBounds(150,100,100,20);
b1.setBounds(150,150,80,20);
l3.setBounds(20,200,100,20);
t3.setBounds(150,200,100,20);
    
}
public static void main(String[]args){
    new DesktopApp();
}

}
