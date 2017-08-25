
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


public class ModifyFrame extends JFrame {
    
   
	private static final long serialVersionUID = 1L;
	JPanel jp1,jp2;
    JLabel l1,l2;
    JTextField t1,t2;
    JButton update,back;
    Container c;

public ModifyFrame(){
    
    c = getContentPane();
    
    jp1 = new JPanel(new FlowLayout(FlowLayout.CENTER,10,25));
    
    l1 = new JLabel("ID");
    l2 = new JLabel("Name");
    t1 = new JTextField(10);
    t2 = new JTextField(10);
    
    jp1.add(l1);
    jp1.add(t1);
    jp1.add(l2);
    jp1.add(t2);
    
    c.add(jp1);
    
    jp2 = new JPanel(new FlowLayout(FlowLayout.CENTER,10,25));
    
    update = new JButton("Update");
    back = new JButton("Back");
    
    jp2.add(update);
    jp2.add(back);
    
    c.add(jp2,BorderLayout.SOUTH);
    
    back.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
            dispose();
        }
        
    });
    
    update.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
            String id = t1.getText();
            String name = t2.getText();
            
            if(id.length() == 0 | name.length() == 0)
            {
                Sound.failure();
                JOptionPane.showMessageDialog(c, "All fields are mandatory");
                return;
            }
            
            if(!(id.matches("^[0-9]+$")))
               {
                   Sound.failure();
                   JOptionPane.showMessageDialog(c, "Please enter proper id");
                   t1.setText("");
                   t1.requestFocus();
                   t2.setText("");
               }
            else if(!(name.matches("^[\\p{L} .'-]+$"))) //reg exp which matches name in any language 
               {
                   Sound.failure();
                   JOptionPane.showMessageDialog(c, "Please enter proper name");
                   t2.setText("");
                   t2.requestFocus();
                   t1.setText("");
               }
            else
            {
                try {
                    DatabaseHandler q = new DatabaseHandler();
                    q.update(Integer.parseInt(id),name);
                    t1.setText("");
                    t2.setText("");
                } catch (SQLException ex) {
                    //Logger.getLogger(ModifyFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    });
}    
}
