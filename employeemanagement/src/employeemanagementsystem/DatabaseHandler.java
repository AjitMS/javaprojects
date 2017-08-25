package employeemanagementsystem;

import java.sql.*;
import javax.swing.JOptionPane;
import mu.Sound;

class DatabaseHandler {
    
    static Connection con = null;
     
    public void insert(int id,String name) throws SQLException
    {    
        try
        {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","ajit123");
        }
        catch(Exception e ){
            JOptionPane.showMessageDialog(null, "Connection not established");
        }

                
        try
        {
         
         Statement stmt = con.createStatement();
             String sql = "CREATE TABLE employees " + "(id INTEGER not NULL, " +
                   " name VARCHAR(255)) ";
            stmt.executeUpdate(sql);

        }


        catch(Exception e){
            JOptionPane.showMessageDialog(null,"1 Record will be added in existing Table. OK?");

        }

            try{
         String q = "insert into employees values(?,?)";
         PreparedStatement pst = con.prepareStatement(q);
         pst.setInt(1, id);
         pst.setString(2, name);
         pst.executeUpdate();
         Sound.success();
         JOptionPane.showMessageDialog(null, "1 Record Added Succesfully");

        }
        catch(Exception e)
        {
            Sound.failure();
            JOptionPane.showMessageDialog(null, "Record Already Exists");
        }
        
    }
    
    public void delete(int id) throws SQLException
    {
        try
        {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","ajit123");
        }
        catch(Exception e )
        {
            JOptionPane.showMessageDialog(null, "Connection not established");
        }
        
        
            String q = "delete employees where id = ?";
            PreparedStatement pst = con.prepareStatement(q);
            pst.setInt(1, id);
            int i = pst.executeUpdate();
            if(i == 0) // it checks whether your id is there or not in database 
            {
              Sound.failure();
              JOptionPane.showMessageDialog(null, "Please enter proper ID");
              return;
            }
            else
            {
                Sound.success();
                JOptionPane.showMessageDialog(null, "1 Record Deleted Successfully");
            }
    }
    
    public void update(int id,String name) throws SQLException
    {
        try
        {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","ajit123");
        }
        catch(Exception e )
        {
            JOptionPane.showMessageDialog(null, "Connection not established");
        }
        
        String q = "update employees set name = ? where id = ?";
        PreparedStatement pst = con.prepareStatement(q);
        pst.setString(1, name);
        pst.setInt(2, id);
        int i = pst.executeUpdate();
        if(i == 0)
        {
            Sound.failure();
            JOptionPane.showMessageDialog(null, "Please enter proper ID");
            return;
        }
        else
        {
            Sound.success();
            JOptionPane.showMessageDialog(null, "1 Record Updated Successfully");
        }
    }

    public String query() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      
        StringBuffer sb = new StringBuffer();
        
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","ajit123");
            
           
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Connection not established");
        }
        
        try
        {
            String q = "select * from employees order by 1 ";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(q);
            sb.append("ID: " + "\t" + "Name: " + "\n");
            while(rs.next())
            {
                sb.append(rs.getInt(1) + "\t" + rs.getString(2) + "\n");
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
            return sb.toString();
            
    }
    
}