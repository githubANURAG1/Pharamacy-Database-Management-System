
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
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
public class Customer_details extends javax.swing.JFrame {

    /**
     * Creates new form Customer_details
     */
    public Customer_details() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        mobile = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        paytype = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        dr = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Curlz MT", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText(" CodeOn Pharmacy ");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 53, -1, 68));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.PNG"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Maiandra GD", 1, 36)); // NOI18N
        jLabel2.setText("Customer Details");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(541, 127, -1, -1));

        jLabel3.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jLabel3.setText("Name :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 371, -1, -1));

        name.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 374, 200, -1));

        search.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 263, -1, -1));

        jLabel4.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jLabel4.setText("Customer_Id :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 219, -1, -1));

        id.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(709, 216, 200, -1));

        jLabel5.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jLabel5.setText("Mobile_no :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 477, -1, -1));

        mobile.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        getContentPane().add(mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 200, -1));

        jLabel6.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jLabel6.setText("Total :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 583, -1, -1));

        total.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 586, 200, -1));

        jLabel7.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jLabel7.setText("PayType :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 480, -1, -1));

        paytype.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        getContentPane().add(paytype, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 477, 200, -1));

        jLabel8.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jLabel8.setText("Date :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 586, -1, -1));

        date.setFont(new java.awt.Font("Malgun Gothic", 1, 12)); // NOI18N
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 583, 200, 40));

        jLabel9.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jLabel9.setText("Ref_Dr :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 374, -1, -1));

        dr.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        getContentPane().add(dr, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 371, 200, -1));

        table.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(973, 371, 283, 286));

        jButton2.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jButton2.setText("Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 100, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jackie-matthews-photography-6079016_1920.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-260, 0, 1780, 1000));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String Id = id.getText();

        if ("".equals(Id)) {
            JOptionPane.showMessageDialog(null, "customer id require");
        } else {
            Connection con = null;
            java.sql.Statement st = null;
            try {

                con = ConnectionProvider.getCon();
                st = con.createStatement();
                ResultSet rs= null;
                ResultSet rs1 = null;

                rs = st.executeQuery("select * from customers where customer_id='" + Id + "';");

                while (rs.next()) {

                    String Name = rs.getString("customer_name");
                    String Mobile = rs.getString("mobile_no");
                    Float Total = rs.getFloat("total_amount");
                    String Ref = rs.getString("ref_dr");
                    String PayType = rs.getString("payment_type");
                    String Date = rs.getString("bill_date");

                    name.setText(Name);
                    mobile.setText(Mobile);
                    total.setText(String.valueOf(Total));
                    dr.setText(Ref);
                    paytype.setText(PayType);
                    date.setText(Date);
                    
                    rs = st.executeQuery("select * from bill where customer_id= '" + Id + "';");

                    while (rs.next()) {
                        
                        
                        String Medicine_name =rs.getString("medicine_name");
                        int Quantity = rs.getInt("quantity");
                        
                        
                        Object row[] = {Medicine_name,Quantity};
                        DefaultTableModel model = (DefaultTableModel) table.getModel();
                        model.addRow(row);
                        
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
    
    }//GEN-LAST:event_searchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       setVisible(false);
       new Home_page().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Customer_details.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_details.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_details.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_details.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer_details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField date;
    private javax.swing.JTextField dr;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mobile;
    private javax.swing.JTextField name;
    private javax.swing.JTextField paytype;
    private javax.swing.JButton search;
    private javax.swing.JTable table;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}