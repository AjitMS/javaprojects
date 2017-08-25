
package employeemanagementsystem;


import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HomeFrame extends JFrame{
    
	private static final long serialVersionUID = 1L;
	JPanel jp;
    JButton add,modify,delete,view;
    Container c;
    
    public  HomeFrame(){
        c = getContentPane();
        jp = new JPanel(new FlowLayout(FlowLayout.CENTER,10,25));//hgap = 10 and vgap = 25 in our layout
        
        add = new JButton("Add");
        modify = new JButton("Modify");
        delete = new JButton("Delete");
        view = new JButton("View");
        
        jp.add(add);
        jp.add(modify);
        jp.add(delete);
        jp.add(view);
        
        c.add(jp);
        
        this.addWindowListener(new L1());
        
        add.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
                AddFrame a = new AddFrame();
                a.setTitle("Add Employee");
                a.setVisible(true);
                a.setSize(500,200);
                a.setResizable(false);
                a.setLocationRelativeTo(null);
               
            }
            
        });
        
        modify.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
                ModifyFrame m = new ModifyFrame();
                m.setTitle("Modify Employee");
                m.setVisible(true);
                m.setSize(500,200);
                m.setResizable(false);
                m.setLocationRelativeTo(null);
            }
            
        });
        
        delete.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
                DeleteFrame d = new DeleteFrame();
                d.setTitle("Delete Employee");
                d.setSize(500,200);
                d.setVisible(true);
                d.setResizable(false);
                d.setLocationRelativeTo(null);
            }
            
        });
        
        view.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
                ViewFrame v = new ViewFrame();
                v.setTitle("View Employee");
                v.setSize(500,200);
                v.setVisible(true);
                v.setResizable(false);
                v.setLocationRelativeTo(null);
            }
            
        });
    }
       
        
        class L1 implements WindowListener
        {
        @Override
        public void windowOpened(WindowEvent e) {
           // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowClosing(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           int output = JOptionPane.showConfirmDialog(c, "Do you want to Exit");
           if(output == JOptionPane.YES_OPTION){
               System.exit(1);
           }
        }          
        

        @Override
        public void windowClosed(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowIconified(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowActivated(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       }
    }
        
    
    public static void main(String[] args) {
        HomeFrame h = new HomeFrame();
        h.setSize(500,200);
        h.setResizable(false);
        h.setTitle("Employee Records Management");
        h.setVisible(true);
        h.setLocationRelativeTo(null);//Frame always appears at the centre
        h.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
    
}
