
package eventhandlingexample;

 import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class BinaryToDecimalCon implements ActionListener {
    JFrame f;
    JLabel l1,l2;
    JTextField t1,t2;
    JButton b1;
    public BinaryToDecimalCon(){
        f=new JFrame("Binary to Decimal");
        l1= new JLabel("Enter Binary:");
        l2= new JLabel("Decimal:");
        t1= new JTextField(25);
        t2= new JTextField(25);
        b1= new JButton("Convert");
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
           String binaryInteger = t1.getText();
           int decimal = Integer.parseInt(binaryInteger,2);
           t2.setText("" + decimal);
           
           
         
    
    }
    public static void main (String[]args){
        new BinaryToDecimalCon();
    }

}
