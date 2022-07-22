
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import project.ConnectionProvider;
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author anuradha
 */
public class Add_medicine extends javax.swing.JFrame {

    /**
     * Creates new form Add_medicine
     */
    public Add_medicine() {
        initComponents();

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            con = ConnectionProvider.getCon();
            st = con.createStatement();
            rs = st.executeQuery("select supplier_name from suppliers ;");

            while (rs.next()) {
                String name = rs.getString("supplier_name");
                supplier.addItem(name);

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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        medicine_id = new javax.swing.JTextField();
        medicine_price = new javax.swing.JTextField();
        medicine_name = new javax.swing.JTextField();
        description = new javax.swing.JTextField();
        exp_date = new javax.swing.JFormattedTextField();
        supplier = new javax.swing.JComboBox<>();
        mfg_date = new javax.swing.JFormattedTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1958, 1280));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.PNG"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Curlz MT", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText(" CodeOn Pharmacy ");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 50, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setText("Medicine Id :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 187, -1));

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel3.setText("Medicine Name :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 370, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel4.setText("Price :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 550, 187, -1));

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel5.setText("Exp-Date :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 187, -1));

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel6.setText("Mfg-Date :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 440, 187, -1));

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel7.setText("Description :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 570, 187, -1));

        jLabel8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel8.setText("Supplier :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 500, 187, -1));

        jLabel9.setFont(new java.awt.Font("Maiandra GD", 1, 36)); // NOI18N
        jLabel9.setText(" Add Medicine");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, -1, -1));

        medicine_id.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        getContentPane().add(medicine_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 306, -1));

        medicine_price.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        getContentPane().add(medicine_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, 306, -1));

        medicine_name.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        getContentPane().add(medicine_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 370, 306, -1));

        description.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        getContentPane().add(description, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 560, 306, -1));

        exp_date.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        exp_date.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        exp_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exp_dateActionPerformed(evt);
            }
        });
        getContentPane().add(exp_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 306, -1));

        supplier.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        supplier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Not known" }));
        supplier.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                supplierItemStateChanged(evt);
            }
        });
        supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierActionPerformed(evt);
            }
        });
        getContentPane().add(supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 500, 306, -1));

        mfg_date.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        mfg_date.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        mfg_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mfg_dateActionPerformed(evt);
            }
        });
        getContentPane().add(mfg_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 440, 306, -1));

        jButton2.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jButton2.setText("Add ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 660, -1, -1));

        jButton3.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 660, -1, -1));

        jButton4.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jButton4.setText("Home");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 660, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jackie-matthews-photography-6079016_1920.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-330, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void supplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierActionPerformed
        // TODO add your handling code h

    }//GEN-LAST:event_supplierActionPerformed

    private void exp_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exp_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exp_dateActionPerformed

    private void mfg_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mfg_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mfg_dateActionPerformed

    private void supplierItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_supplierItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String Md_id = medicine_id.getText();
        String Md_name = medicine_name.getText();
        String Md_price = medicine_price.getText();
        String Mfg = mfg_date.getText();
        String Exp = exp_date.getText();
        Object Supplier = supplier.getSelectedItem();
        String Description = description.getText();

        if ("".equals(Md_id) || "".equals(Md_name) || "".equals(Md_price) || "".equals(Mfg)|| "".equals(Exp)|| "".equals(Supplier)|| "".equals(Description)) {
            JOptionPane.showMessageDialog(null, "each field require");
        } else {
            Connection con = null;
            java.sql.Statement st = null;
            try {
                con = ConnectionProvider.getCon();
                st = con.createStatement();
                ResultSet rs = null;

                rs = st.executeQuery("select * from users where username='" +Md_id+ "';");
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Medicine already exist update its stock form stock menu");
                } else {
                    st.executeUpdate("insert into medicines values('" + Md_id + "','" + Md_name + "','" + Md_price + "','" + Exp + "','" + Mfg +"','" + Supplier +"','" + Description +"');");
                    JOptionPane.showMessageDialog(null, "Medicine added successfully");
                     
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
        setVisible(false);
        new Home_page().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        medicine_id.setText("");
        medicine_name.setText("");
        medicine_price.setText("");
        mfg_date.setText("");
        exp_date.setText("");
        supplier.setSelectedItem("");
        description.setText("");
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
            java.util.logging.Logger.getLogger(Add_medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_medicine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_medicine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField description;
    private javax.swing.JFormattedTextField exp_date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField medicine_id;
    private javax.swing.JTextField medicine_name;
    private javax.swing.JTextField medicine_price;
    private javax.swing.JFormattedTextField mfg_date;
    private javax.swing.JComboBox<String> supplier;
    // End of variables declaration//GEN-END:variables
}