
package employeemanagementsystem;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
//import java.lang.Integer;
import java.sql.SQLException;import mu.Sound;


public class AddFrame extends JFrame {
    
	private static final long serialVersionUID = 1L;
	JPanel jp1,jp2;
    JButton add,back;
    JLabel l1,l2;
    JTextField t1,t2;
    Container c;
    
    public AddFrame(){
    
       c = getContentPane();
       jp1 = new JPanel(new FlowLayout(FlowLayout.CENTER,10,25));
       
       t1 = new JTextField(10);
       t2 = new JTextField(10);
       l1 = new JLabel("ID");
       l2 = new JLabel("Name");
       
       jp1.add(l1);
       jp1.add(t1);
       jp1.add(l2);
       jp1.add(t2);
       
       c.add(jp1);
       
       jp2 = new JPanel(new FlowLayout(FlowLayout.CENTER,10,25));
       add = new JButton("Add");
       back  =new JButton("Back");
       
       jp2.add(add);
       jp2.add(back);
       
       
       c.add(jp2,BorderLayout.SOUTH);
       
       back.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
               //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
              
               dispose();
           }
           
       });
       
       add.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
               //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           
               String id = t1.getText();
               String name = t2.getText();
               
               
               
               if(id.length() == 0 | name.length() == 0) //either of the fields are empty
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
                       

                       
                       q.insert(Integer.parseInt(id),name);
                       t1.setText("");
                       t2.setText("");
                   } catch (SQLException ex) {
                       //Logger.getLogger(AddFrame.class.getName()).log(Level.SEVERE, null, ex);
                   }
               }
           }
           
       });
       
    }
    
}
