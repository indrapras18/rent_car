/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rent_car;

import java.awt.Image;
import java.io.File;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author KRISNA
 */
public class sanksi extends javax.swing.JFrame {

    String filename;
    Connection conn;
    ResultSet rs = null;
    PreparedStatement pst = null;
    int no_transaksi;

    /**
     * Creates new form sanksi
     */
    public sanksi() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        dashboard = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        logout = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        LabelImage = new javax.swing.JLabel();
        LabelImage1 = new javax.swing.JLabel();
        txtFotoAwal = new javax.swing.JTextField();
        btnupload = new javax.swing.JButton();
        txtFotoAwal2 = new javax.swing.JTextField();
        btnupload1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        btnbayar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_transaksi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(221, 255, 188));

        jPanel2.setBackground(new java.awt.Color(82, 115, 77));

        jPanel3.setBackground(new java.awt.Color(254, 255, 222));

        dashboard.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-home-page-30.png"))); // NOI18N
        dashboard.setText("Dashboard");
        dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(dashboard)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dashboard)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(254, 255, 222));

        logout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-logout-30.png"))); // NOI18N
        logout.setText("Logout");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logout)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(145, 199, 136));
        jPanel6.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Sanksi");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(339, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(298, 298, 298))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        LabelImage.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LabelImage1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnupload.setText("UPLOAD");
        btnupload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuploadActionPerformed(evt);
            }
        });

        txtFotoAwal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFotoAwal2ActionPerformed(evt);
            }
        });

        btnupload1.setText("UPLOAD");
        btnupload1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupload1ActionPerformed(evt);
            }
        });

        jLabel5.setText("HARGA");

        txtHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaActionPerformed(evt);
            }
        });

        jLabel6.setText("ID SANKSI");

        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        btnbayar.setText("BAYAR");
        btnbayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbayarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("FOTO AWAL");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("FOTO AKHIR");

        jLabel1.setText("NO TRANSAKSI");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel3)
                        .addGap(325, 325, 325)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LabelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(LabelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtFotoAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(btnupload, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(txtFotoAwal2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(btnupload1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_transaksi)
                                .addComponent(jLabel5)
                                .addComponent(txtHarga, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(320, 320, 320)
                                .addComponent(jLabel6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(290, 290, 290)
                                .addComponent(btnbayar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFotoAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnupload)
                    .addComponent(txtFotoAwal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnupload1))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtHarga)
                    .addComponent(txt_id))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbayar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        try {
            new dashboard().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(mobil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dashboardMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        new login().setVisible(true);
    }//GEN-LAST:event_logoutMouseClicked

    private void btnuploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuploadActionPerformed
        // TODO add your handling code here:
        try {
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            File f = chooser.getSelectedFile();
            ImageIcon icon = new ImageIcon(f.toString());
            Image image = icon.getImage().getScaledInstance(LabelImage.getWidth(),
                    LabelImage.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon ic = new ImageIcon(image);
            LabelImage.setIcon(ic);

            filename = f.getAbsolutePath();
            txtFotoAwal.setText(filename);

            String newpath = "src/Upload/profile/";
            File directory = new File(newpath);
            if (!directory.exists()) {
                directory.mkdirs();
            }
            File sourceFile = null;
            File destinationFile = null;
            String extension = filename.substring(filename.lastIndexOf('.') + 1);
            sourceFile = new File(filename);
            Date tanggal_update = new Date();
            String tampilan = "yyyyMMddhhmmss";
            SimpleDateFormat fm = new SimpleDateFormat(tampilan);
            String tanggal = String.valueOf(fm.format(tanggal_update));
            destinationFile = new File(newpath + "/newImage" + tanggal.toString() + "." + extension);

            Files.copy(sourceFile.toPath(), destinationFile.toPath());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error Upload" + e);
        }
    }//GEN-LAST:event_btnuploadActionPerformed

    private void txtFotoAwal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFotoAwal2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFotoAwal2ActionPerformed

    private void btnupload1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupload1ActionPerformed
        // TODO add your handling code here:
        try {
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);
            File f = chooser.getSelectedFile();
            ImageIcon icon = new ImageIcon(f.toString());
            Image image = icon.getImage().getScaledInstance(LabelImage1.getWidth(),
                    LabelImage1.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon ic = new ImageIcon(image);
            LabelImage1.setIcon(ic);

            filename = f.getAbsolutePath();
            txtFotoAwal2.setText(filename);

            String newpath = "src/Upload/profile/";
            File directory = new File(newpath);
            if (!directory.exists()) {
                directory.mkdirs();
            }
            File sourceFile = null;
            File destinationFile = null;
            String extension = filename.substring(filename.lastIndexOf('.') + 1);
            sourceFile = new File(filename);
            Date tanggal_update = new Date();
            String tampilan = "yyyyMMddhhmmss";
            SimpleDateFormat fm = new SimpleDateFormat(tampilan);
            String tanggal = String.valueOf(fm.format(tanggal_update));
            destinationFile = new File(newpath + "/newImage" + tanggal.toString() + "." + extension);

            Files.copy(sourceFile.toPath(), destinationFile.toPath());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error Upload" + e);
        }
    }//GEN-LAST:event_btnupload1ActionPerformed

    private void txtHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaActionPerformed

    private void btnbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbayarActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "INSERT INTO sanksi (foto_awal,foto_akhir,harga,no_transaksi,id_sanksi) VALUES ('" + txtFotoAwal.getText() + "', '" + txtFotoAwal2.getText()
                    + "','" + txtHarga.getText() + "','" + txt_transaksi.getText() + "','" + txt_id.getText() + "')";
            System.out.println(sql);
            java.sql.Connection conn = (Connection) koneksi.configDB();
            java.sql.PreparedStatement pst1 = conn.prepareStatement(sql);
            pst1.execute();
            JOptionPane.showMessageDialog(null, "penyimpanan data berhasil!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        txtFotoAwal.setText(" ");
        txtFotoAwal2.setText(" ");
        txtHarga.setText(" ");
        txt_id.setText(" ");
    }//GEN-LAST:event_btnbayarActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

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
            java.util.logging.Logger.getLogger(sanksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sanksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sanksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sanksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sanksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelImage;
    private javax.swing.JLabel LabelImage1;
    private javax.swing.JButton btnbayar;
    private javax.swing.JButton btnupload;
    private javax.swing.JButton btnupload1;
    private javax.swing.JLabel dashboard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel logout;
    private javax.swing.JTextField txtFotoAwal;
    private javax.swing.JTextField txtFotoAwal2;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_transaksi;
    // End of variables declaration//GEN-END:variables

}