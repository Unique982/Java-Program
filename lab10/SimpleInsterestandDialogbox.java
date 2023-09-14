
package lab10;
import javax.swing.*;
public class SimpleInsterestandDialogbox {
    public static void main(String[] args){
        float Principal = Float.parseFloat(JOptionPane.showInputDialog(" Enter Principal Amont"));
         float Rate = Float.parseFloat(JOptionPane.showInputDialog("Enter Rate"));
          float Time = Float.parseFloat(JOptionPane.showInputDialog("Enter Time"));
           float SI=(Principal*Rate*Time)/100;
           JOptionPane.showMessageDialog(null,"Simple Interest ="+SI);
       
        
        
        
    }
    
}
