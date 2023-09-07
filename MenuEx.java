
package eventhandlingexample;
import javax.swing.*;
import java.awt.*;
public class MenuEx {
    JFrame f;
    JMenuBar mb;
    JMenu m1,m2,m3,m4;
     JMenuItem i1,i2,i3,i4,i5,i6;
     
    public MenuEx(){
        f = new JFrame("Menu Example");
        mb = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");
        m4 = new JMenu("Source");
        
         i1 = new JMenuItem("Open");
         i2 = new JMenuItem("Save");
         i3 = new JMenuItem("Save As");
         i4 = new JMenuItem("seelct");
         i5= new JMenuItem("Remove");
         i6 = new JMenuItem("Rename");
         
         f.setJMenuBar(mb);
         mb.add(m1);mb.add(m2);mb.add(m3);mb.add(m4);
         m1.add(i1);m2.add(i2);
         m2.add(i3);m4.add(i4);
         m3.add(i5);m3.add(i6);
         
         f.setSize(300,300);
         f.setVisible(true);
         f.setDefaultCloseOperation(3);
         f.setLayout(new FlowLayout());
         
         
         
    }
    public static void main (String[] args){
        new MenuEx();
    }
}
