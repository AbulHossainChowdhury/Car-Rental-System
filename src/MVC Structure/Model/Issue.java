
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 */
public class Issue extends javax.swing.JFrame {
     Connection conn;
    ResultSet rs;
    PreparedStatement pst;

    /**
     * Creates new form Issue
     */
    public Issue() {
        super("Issue Car");
        initComponents();
        conn=javaconnect.ConnecrDb();
    }
    
    public void Delete()
    {
        String sql="delete from Car where Car_ID=?";
        try
        {
            pst=conn.prepareStatement(sql);
            pst.setString(1, jTextField1.getText());
            pst.execute();
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            
        }
    }

   

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        
        setVisible(false);
        Home ob = new Home();
        ob.setVisible(true);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
       
        String sql="select * from Car where Car_ID=?";
        try{
            pst=conn.prepareStatement(sql);
            pst.setString(1,jTextField1.getText());
            rs=pst.executeQuery();
            if(rs.next())
            {
                String add1=rs.getString("Car_Body");
                jTextField2.setText(add1);
                String add2=rs.getString("Model");
                jTextField3.setText(add2);
                String add3=rs.getString("Year");
                jTextField4.setText(add3);
                String add4=rs.getString("Brand");
                jTextField5.setText(add4);
                String add5=rs.getString("Price");
                jTextField6.setText(add5);
                rs.close();
                pst.close();
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Car Id Not Found");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally
        {
            
            
        
            try{
                rs.close();
            pst.close();
            }
        catch(Exception e){
        
        }
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        String sql="Select * from Customer where Customer_ID=?";
        try{
            pst=conn.prepareStatement(sql);
            pst.setString(1, jTextField7.getText());
            rs=pst.executeQuery();
            if(rs.next())
            {
                String add1=rs.getString("Name");
                jTextField8.setText(add1);
                String add2=rs.getString("NID");
                jTextField9.setText(add2);
                String add3=rs.getString("Address");
                jTextField10.setText(add3);
                String add4=rs.getString("Zip_Code");
                jTextField11.setText(add4);
                String add5=rs.getString("Phone_No");
                jTextField12.setText(add5);
                String add6=rs.getString("Email");
                jTextField13.setText(add6);
                rs.close();
                pst.close();
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Customer ID not found");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
        finally
        {
            
            
        
            try{
                rs.close();
            pst.close();
            }
        catch(Exception e){
        
        }
        }
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        Delete();
        String sql="insert into Issue(Car_ID,Car_Body,Model,Year,Brand,Price,Customer_ID,Name,NID,Address,Zip_Code,Phone,Email,Date_Issue) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try
        {
            pst=conn.prepareStatement(sql);
            
            pst.setString(1, jTextField1.getText());
            pst.setString(2, jTextField2.getText());
            pst.setString(3, jTextField3.getText());
            pst.setString(4, jTextField4.getText());
            pst.setString(5, jTextField5.getText());
            pst.setString(6, jTextField6.getText());
            pst.setString(7, jTextField7.getText());
            pst.setString(8, jTextField8.getText());
            pst.setString(9, jTextField9.getText());
            pst.setString(10, jTextField10.getText());
            pst.setString(11, jTextField11.getText());
            pst.setString(12, jTextField12.getText());
            pst.setString(13, jTextField13.getText());
            pst.setString(14, jTextField14.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Car Issued");
            
            
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Issue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
