
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import project.ConnectionProvider;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author anuradha
 */
public class Stock extends javax.swing.JFrame {

    /**
     * Creates new form Stock
     */
    public Stock() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        exp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        quantity = new javax.swing.JSpinner();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Curlz MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("CodeOn Pharmacy");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 45, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.PNG"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 0, -1, 40));

        jLabel2.setFont(new java.awt.Font("Malgun Gothic", 1, 36)); // NOI18N
        jLabel2.setText("Stock");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 125, -1, -1));

        jLabel3.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jLabel3.setText("Medicine_Id :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jLabel4.setText("Medicine_Name :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 320, -1, -1));

        jLabel5.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jLabel5.setText("Exp_date :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 405, -1, -1));

        id.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(767, 237, 300, -1));

        name.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(767, 317, 300, -1));

        exp.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        getContentPane().add(exp, new org.netbeans.lib.awtextra.AbsoluteConstraints(767, 402, 300, -1));

        jLabel6.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jLabel6.setText("Quantity :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 476, -1, -1));

        jButton2.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jButton2.setText("Change_Stock");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 568, -1, -1));

        jButton3.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 570, 130, -1));

        jButton4.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 570, 130, -1));

        quantity.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        getContentPane().add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(767, 476, 300, -1));

        jButton5.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jButton5.setText("Home");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 570, 130, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jackie-matthews-photography-6079016_1920.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-330, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        String Id = id.getText();
        String Name = name.getText();
        String Exp = null;
        int Quantity = 0;

        if ("".equals(Id) && "".equals(Name)) {
            JOptionPane.showMessageDialog(null, "medicine_id or name require");
        } else {
            Connection con = null;
            java.sql.Statement st = null;
            try {

                con = ConnectionProvider.getCon();
                st = con.createStatement();
                ResultSet rs = null;

                rs = st.executeQuery("select * from medicines where medicine_id='" + Id + "' or medicine_name='" + Name + "';");

                while (rs.next()) {
                    Id = rs.getString("medicine_id");
                    Name = rs.getString("medicine_name");
                    Exp = rs.getString("exp_date");

                    id.setText(Id);
                    name.setText(Name);
                    exp.setText(Exp);

                }

                rs = st.executeQuery("select * from medicine_stock where medicine_id= '" + Id + "';");
                while (rs.next()) {
                    Quantity = rs.getInt("quantity");
                    quantity.setValue(Quantity);

                }

            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {
                try {
                    con.close();
                    st.close();
                } catch (SQLException e) {

                }
            }

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        int Quantity = (int) quantity.getValue();
        String Name = name.getText();
        String Id = id.getText();

        if ("".equals(exp.getText())) {
            JOptionPane.showMessageDialog(null, "Search Medicine First");
        } else {
            Connection con = null;
            java.sql.Statement st = null;
            try {

                con = ConnectionProvider.getCon();
                st = con.createStatement();
                ResultSet rs = null;

                if ("".equals(Id) || "".equals(Name)) {
                    JOptionPane.showMessageDialog(null, "enter id or name and search first");

                } else {
                    rs = st.executeQuery("select * from medicine_stock where medicine_id= '" + Id + "';");
                if (rs.next()) {
                    st.executeUpdate("update  medicine_stock set quantity="+Quantity+" where medicine_id='"+Id+"'; ");
                    JOptionPane.showMessageDialog(null, "stock updated");
                } else {
                    st.executeUpdate("insert into medicine_stock values('" + Id + "','" + Quantity + "')");
                    JOptionPane.showMessageDialog(null, "stock inserted");
                }
                }
                
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {
                try {
                    con.close();
                    st.close();
                } catch (SQLException e) {

                }
            }

        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        quantity.setValue(0);
       name.setText("");
         id.setText("");
         exp.setText("");
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Home_page().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField exp;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField name;
    private javax.swing.JSpinner quantity;
    // End of variables declaration//GEN-END:variables
}
