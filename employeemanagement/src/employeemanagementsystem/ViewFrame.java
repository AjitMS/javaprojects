
package employeemanagementsystem;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class ViewFrame extends JFrame {
    
    
	private static final long serialVersionUID = 1L;
	JTextArea ta;
    JScrollPane sp1;
    Container c;
    
    public ViewFrame(){
        
        c = getContentPane();
        
        ta = new JTextArea(10,10);
        ta.setEditable(false);
        
        sp1 = new JScrollPane(ta);
        sp1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        sp1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        c.add(sp1);
        
        DatabaseHandler q = new DatabaseHandler();
        String s = q.query();
        ta.setText(s);
        
    }
    
}
