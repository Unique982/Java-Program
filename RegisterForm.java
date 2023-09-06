
package eventhandlingexample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class RegisterForm implements ActionListener {
     JFrame f;
     JLabel l1,l2,l3,l4,l5,l6,l7;
     JTextField t1,t2,t3;
      JTextArea t4;
       JRadioButton rb1,rb2;
    JCheckBox cb1,cb2,cb3;
    JComboBox jcb;
    JButton b1;
    public RegisterForm(){
        f= new JFrame("Student Information");
        l1= new JLabel("Student Information");
        l2= new JLabel("Roll");
        l3= new JLabel("Name");
        l4 = new JLabel("College");
        l5= new JLabel("Gender");
        rb1= new JRadioButton("Male");
        rb2= new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        l6 = new JLabel("Hobbies");
        cb1 = new JCheckBox("Playing");
        cb2 = new JCheckBox("Reading");
        cb3= new JCheckBox("Swimming");
        
        l7 = new JLabel("Program");
        String[] name= {"BCA","BSCCSIT","BIM","BICT"};
        jcb= new JComboBox(name);
  
        t1=new JTextField(25);
        t2= new JTextField(25);
        t3= new JTextField(25);
        t4=new JTextArea();
        b1= new JButton("Save");
        b1.addActionListener(this);
        
     f.setSize(800,800);
     f.setVisible(true);
     f.setDefaultCloseOperation(3);
f.setLayout(null);
     l1. setBounds(70,50,200,20);
 
     l2.setBounds(20,100,100,20);
        t4.setBounds(400,50,200,200);
     t1.setBounds(150,100,100,20);
     
         l3.setBounds(20,150,100,20);
     t2.setBounds(150,150,100,20);
     
     l4.setBounds(20,200,100,20);
     t3.setBounds(150,200,100,20);
     
     l5.setBounds(20,250,100,20);
      rb1.setBounds(150,250,60,20);
  rb2.setBounds(210,250,100,20);
  
    l6.setBounds(20,300,100,20);
     cb1.setBounds(150,300,80,20);
     cb2.setBounds(230,300,80,20);
     cb3.setBounds(320,300,100,20);
     
    l7.setBounds(20,350,100,20);
    jcb.setBounds(150,350,150,20);
    
b1.setBounds(150,450,100,20);
      f.add(l1);
      f.add(l2); f.add(t1);
      f.add(l3); f.add(t2);f.add(t4);
      f.add(l4); f.add(t3);
      f.add(l5);f.add(rb1);f.add(rb2);
      f.add(l6);f.add( cb1);f.add(cb2);f.add(cb3);
      f.add(l7);f.add(jcb);
      f.add(b1);
     
    }
   public void actionPerformed(ActionEvent e){
       int roll = Integer.parseInt(t1.getText());
       String name = t2.getText();
       String college = t3.getText();
       String gender=rb1.isSelected() ? "Male":"Female";
       StringBuilder hobbies = new StringBuilder();
       if(cb1.isSelected()){
           hobbies.append("Playing "+", ");
       }
       if(cb2.isSelected()){
           hobbies.append("Reading "+", ");
       }
        if(cb3.isSelected()){
           hobbies.append("Swimming "+", ");
       }
        String program = jcb.getSelectedItem().toString();
        t4.setText("Roll: "+roll+ "\n" +"Name:"+name+"\n"+"College:"+college+"\n"+"Gender:"+gender+"\n"+"Hobbies:"+hobbies+"\n "+"Program:"+program);
        
        
       
   }
     
    public static void main(String[]args){
        new RegisterForm ();
    }
}
