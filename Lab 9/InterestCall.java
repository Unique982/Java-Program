//Write a java program to develop swing application for computing Simple interest using appropriates swing components.
package eventhandlingexample;
import javax.swing.*;
import java.awt.event.*;

public class InterestCall implements ActionListener {
      JFrame f;
    JLabel l1,l2,l3,l4 ;
    JTextField t1,t2,t3,t4;
    
JButton b1;   
public InterestCall(){
    f= new JFrame ("Interest Calculator");
    l1= new JLabel ("Principal");
    l2= new JLabel ("Rate");
    l3 = new JLabel ("Time");
    l4 = new JLabel("Simple Interest");
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
  l3.setBounds(20,150,100,20);
  t3.setBounds(150,150,100,20);
b1.setBounds(150,200,100,20);
l4.setBounds(20,250,100,20);
t4.setBounds(150,250,100,20);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent e){
    float Principal = Float.parseFloat(t1.getText());
    float Rate = Float.parseFloat(t2.getText());
    float Time = Float.parseFloat(t3.getText());
    float SI=(Principal*Rate*Time)/100;
    t4.setText("" + SI);
    
}
public static void main(String[]args){
    new InterestCall();
}
}






