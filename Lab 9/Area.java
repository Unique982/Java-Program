//Write a java program using swing component to find Area and Perimeter of Rectangle Use text field for inputs and outputs. Your program should display the result when the user click a button
import javax.swing.*;
import java.awt.event.*;
public class Area implements ActionListener {
      JFrame f;
    JLabel l1,l2,l3,l4 ;
    JTextField t1,t2,t3,t4;
    
JButton b1;   
public Area() {
    f= new JFrame ("Area and Perimeter");
    l1= new JLabel ("Length");
    l2= new JLabel ("Bredth");
    l3 = new JLabel ("Area");
    l4 = new JLabel("Perimeter");
    t1= new JTextField (25);
    t2 = new JTextField(25);
    t3 = new JTextField (25);
    t4 = new JTextField(25);
     b1= new JButton("Calculate");
    f.add(l1); f.add(l2); f.add(l3);f.add(l4);
    f.add(t1); f.add(t2); f.add(t3);f.add(t4);
    f.add(b1);
     f.setSize(400,400);
    f.setVisible(true);
    f.setDefaultCloseOperation(3);
    f.setLayout(null);

    l1.setBounds(20,50,100,20);
    t1.setBounds(150,50,100,20);
    l2.setBounds(20,100,100,20);
    t2.setBounds(150,100,100,20);
    b1.setBounds(150,150,100,20);
    b1.addActionListener(this);
    l3.setBounds(20,200,100,20);
    t3.setBounds(150,200,100,20);
    l4.setBounds(20,250,100,20);
    t4.setBounds(150,250,100,20);
}

public void actionPerformed(ActionEvent e){
  int l = Integer.parseInt(t1.getText());
  int b = Integer.parseInt(t2.getText());
  int a=l*b;
  int p=2*(l+b);
  t3.setText(String.valueOf(a));
      t4.setText(String.valueOf(p));

  
 
}


public static void main(String[]args){
    new Area();
}}