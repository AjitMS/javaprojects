
package employeemanagementsystem;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import mu.Sound;


public class DeleteFrame extends JFrame {
    
	private static final long serialVersionUID = 1L;
	JPanel jp1,jp2;
    JLabel l1;
    JTextField t1;
    JButton delete,back;
    Container c;
    
    public DeleteFrame(){
        
        c = getContentPane();
        
        jp1 = new JPanel(new FlowLayout(FlowLayout.CENTER,10,25));
        
        l1 = new JLabel("ID");
        t1 = new JTextField(10);
        
        jp1.add(l1);
        jp1.add(t1);
        
        c.add(jp1);
        
        jp2 = new JPanel(new FlowLayout(FlowLayout.CENTER,10,25));
        
        delete = new JButton("Delete");
        back = new JButton("Back");
        
        jp2.add(delete);
        jp2.add(back);
        
        c.add(jp2,BorderLayout.SOUTH);
        
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
                dispose();
            }
            
        });
        
        delete.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
                String id = t1.getText();
                
                if(id.length() == 0)
                {
                    Sound.failure();
                    JOptionPane.showMessageDialog(c, "Please enter a proper ID");
                    return;
                }
                else
                {
                    try {
                        DatabaseHandler q = new DatabaseHandler();
                        q.delete(Integer.parseInt(id));
                        t1.setText("");
                    } catch (SQLException ex) {
                       // Logger.getLogger(DeleteFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
            }
            
        });
        
    }
}
