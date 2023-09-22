
package lab10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SquareNumber implements ActionListener {
    JFrame f;
    JLabel l1,l2;
    JTextField t1,t2;
    JButton b1;
    public SquareNumber(){
        f=new JFrame("SquareNumber");
        l1= new JLabel("Enter any number:");
        l2= new JLabel("SquareNumber:");
        t1= new JTextField(25);
        t2= new JTextField(25);
        b1= new JButton("CalculateSqaure");
        b1.addActionListener(this);
        f.add(l1);f.add(l2);f.add(t1);f.add(t2);f.add(b1);
        f.setSize(300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setLayout(null);
        l1.setBounds(20,50,150,20);
        t1.setBounds(150,50,100,20);
        b1.setBounds(100,100,100,20);
        l2.setBounds(20,150,100,20);
        t2.setBounds(150,150,100,20);
    }
    public void actionPerformed(ActionEvent e){
        int number= Integer.parseInt(t1.getText());
        int square = number*number;
       t2.setText("" + square);
    }
    public static void main (String[] args){
        new SquareNumber();
    }
    
}
