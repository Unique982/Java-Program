
package eventhandlingexample;
import javax.swing.*;
import java.awt .*;
public class ListExample {
    JFrame f;
    JLabel l1;
    JList list;
    public ListExample(){
        f= new JFrame("List Example");
        l1 = new JLabel("Select One Program");
        String [] name={"BCA","BSS","BIM","BBA"};
        list= new JList(name);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        f.setSize(300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
        f.setLayout(new FlowLayout());
        f.add(l1);f.add(list);
 
    }
    public static void main(String [] args){
        new ListExample();
    }
    
}
