/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library.management.system;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abhis
 */
public class StudentRegistration extends javax.swing.JFrame {

    /**
     * Creates new form StudentRegistration
     */
    public StudentRegistration() {
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

        btnclose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtcourse = new javax.swing.JTextField();
        txtbranch = new javax.swing.JTextField();
        txtsemester = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/close icon.png"))); // NOI18N
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1103, 0, 37, 36));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Student ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 140, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Student Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 130, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Course");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 130, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Branch");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 130, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Semester");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 130, 30));

        txtid.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 170, 30));

        txtname.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 170, 30));

        txtcourse.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(txtcourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 170, 30));

        txtbranch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtbranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbranchActionPerformed(evt);
            }
        });
        getContentPane().add(txtbranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 170, 30));

        txtsemester.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtsemester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsemesterActionPerformed(evt);
            }
        });
        getContentPane().add(txtsemester, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 170, 30));

        btnsave.setBackground(new java.awt.Color(255, 0, 0));
        btnsave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnsave.setForeground(new java.awt.Color(242, 242, 242));
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 370, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/All Page Backgraound.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -4, 1140, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txtbranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbranchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbranchActionPerformed

    private void txtsemesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsemesterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsemesterActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btncloseActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        if(txtid.getText().equals("")){
            JOptionPane.showMessageDialog(this,"All fields are required");
            txtid.requestFocus();
        }else if(txtname.getText().equals("")){
            JOptionPane.showMessageDialog(this,"All fields are required");
            txtname.requestFocus();
        }else if(txtcourse.getText().equals("")){
            JOptionPane.showMessageDialog(this,"All fields are required");
            txtcourse.requestFocus();
        }else if(txtbranch.getText().equals("")){
            JOptionPane.showMessageDialog(this,"All fields are required");
            txtbranch.requestFocus();
        }else if(txtsemester.getText().equals("")){
            JOptionPane.showMessageDialog(this,"All fields are required");
            txtsemester.requestFocus();
        }
        else{
            Connection con =Connect.Connection();
            try {
                PreparedStatement pst = con.prepareStatement("INSERT INTO STUDENT(id,name,course,branch,semester)values(?,?,?,?,?)");
                pst.setString(1, txtid.getText());
                pst.setString(2, txtname.getText());
                pst.setString(3, txtcourse.getText());
                pst.setString(4, txtbranch.getText());
                pst.setString(5, txtsemester.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Saved Successfully");
                txtid.setText("");
                txtname.setText("");
                txtcourse.setText("");
                txtbranch.setText("");
                txtsemester.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(StudentRegistration.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_btnsaveActionPerformed

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
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnsave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtbranch;
    private javax.swing.JTextField txtcourse;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtsemester;
    // End of variables declaration//GEN-END:variables
}
