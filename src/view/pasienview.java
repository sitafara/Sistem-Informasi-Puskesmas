
package view;

import aksesdata.AksesDataPasien;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.OK_CANCEL_OPTION;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import java.util.Date;

public class pasienview extends javax.swing.JFrame {
    
    AksesDataPasien aksesDataPasien;
    
    public pasienview() throws SQLException {
        initComponents();
        this.aksesDataPasien = new AksesDataPasien();
        this.setTitle("DATA PASIEN");
        this.setLocationRelativeTo(null);
        this.setTabelModel();
//        this.setTextIdPasien();
        this.setVisible(true);
    }
    
//    public void setTextIdPasien() throws SQLException {
//        this.tfIdPasien.setEditable(false);
//        this.tfIdPasien.setEnabled(false);
//        int idpasien = this.aksesDataPasien.getSequenceIdPasien();
//        this.tfIdPasien.setText(String.valueOf(idpasien));
//    }
    
    public void setTabelModel() throws SQLException {
        this.TabelPasien.setModel(this.aksesDataPasien.viewTabel());
    }
    
    private boolean cekSemuaTextKosong() {
        boolean textKosong = false;
        if (this.tfIdPasien.getText().isEmpty()
                || this.tfNamaPasien.getText().isEmpty()
                || this.tfAlamatPasien.getText().isEmpty()
                || this.tfUmurPasien.getText().isEmpty()
                || this.tfNoTlpnPasien.getText().isEmpty() 
                || this.tfGenderPasien.getText().isEmpty()
                || this.tfTtlPasien.getText().isEmpty()){
            textKosong = true;
        }
        return textKosong;
    }
    
    public void refreshField() {
        this.tfIdPasien.setText("");
        this.tfNamaPasien.setText("");
        this.tfAlamatPasien.setText("");
        this.tfUmurPasien.setText("");
        this.tfNoTlpnPasien.setText("");
        this.tfGenderPasien.setText("");
        this.tfTtlPasien.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TabelPasien = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfUmurPasien = new javax.swing.JTextField();
        tfNoTlpnPasien = new javax.swing.JTextField();
        tfAlamatPasien = new javax.swing.JTextField();
        btnInsertPasien = new javax.swing.JButton();
        btnUpdatePasien = new javax.swing.JButton();
        btnDeletePasien = new javax.swing.JButton();
        btnKembaliPasien = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfIdPasien = new javax.swing.JTextField();
        tfGenderPasien = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tfNamaPasien = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfTtlPasien = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TabelPasien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TabelPasien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelPasienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelPasien);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 620, 150));

        jLabel6.setText("Nama Pasien");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 100, 30));

        jLabel7.setText("Umur Pasien");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 166, 100, 30));

        jLabel8.setText("No Telpn");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 100, 29));

        jLabel10.setText("Jenis Kelamin");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 166, 100, 30));

        jLabel11.setText("Alamat Pasien");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 214, 100, 31));
        getContentPane().add(tfUmurPasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 167, 230, 29));
        getContentPane().add(tfNoTlpnPasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 70, 230, 30));
        getContentPane().add(tfAlamatPasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 214, 230, 31));

        btnInsertPasien.setText("INSERT");
        btnInsertPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertPasienActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsertPasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 90, 35));

        btnUpdatePasien.setText("UPDATE");
        btnUpdatePasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePasienActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdatePasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 90, 35));

        btnDeletePasien.setText("DELETE");
        btnDeletePasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePasienActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeletePasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 90, 35));

        btnKembaliPasien.setText("BACK");
        btnKembaliPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliPasienActionPerformed(evt);
            }
        });
        getContentPane().add(btnKembaliPasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 230, 30));

        jLabel1.setText("ID Pasien");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 100, 29));
        getContentPane().add(tfIdPasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 71, 230, 29));

        tfGenderPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfGenderPasienActionPerformed(evt);
            }
        });
        getContentPane().add(tfGenderPasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 166, 230, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("DATA PASIEN");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 125, 34));
        getContentPane().add(tfNamaPasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 118, 230, 30));

        jLabel2.setText("TTL");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 126, 100, -1));
        getContentPane().add(tfTtlPasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 118, 230, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Pictures\\Saved Pictures\\images (5).jpg")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 740, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Pictures\\Saved Pictures\\images (5).jpg")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("DATA PASIEN");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 125, 34));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setText("DATA PASIEN");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 125, 34));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfGenderPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfGenderPasienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfGenderPasienActionPerformed

    private void btnKembaliPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliPasienActionPerformed
        awal AW = new awal();
        AW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnKembaliPasienActionPerformed

    private void btnInsertPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertPasienActionPerformed

        if (cekSemuaTextKosong()) {
            JOptionPane.showMessageDialog(null, "Isi Kolom Terlebih Dahulu !!!",
                    "Insert Gagal", WARNING_MESSAGE);
        } else {
            try {
                int konfirmasi = JOptionPane.showConfirmDialog(null, "Apakah Yakin Input Data Pasien ?",
                        "Konfirmasi", OK_CANCEL_OPTION, QUESTION_MESSAGE);
                if (konfirmasi == 0) {
                    String idpasien = this.tfIdPasien.getText();
                    String namapasien = this.tfNamaPasien.getText();
                    String alamatpasien = this.tfAlamatPasien.getText();
                    String umurpasien = this.tfUmurPasien.getText();
                    String notlpnpasien = this.tfNoTlpnPasien.getText();
                    String genderpasien = this.tfGenderPasien.getText();
                    String ttlpasien = this.tfTtlPasien.getText();
                    this.aksesDataPasien.insert(idpasien, namapasien, alamatpasien, umurpasien, notlpnpasien, genderpasien, ttlpasien);
                }
                this.setTabelModel();
                JOptionPane.showMessageDialog(null, "Input Data Pasien Berhasil");
//                this.setTextIdPasien();
                this.refreshField();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_btnInsertPasienActionPerformed

    private void TabelPasienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelPasienMouseClicked
        // TODO add your handling code here:
        int klik = TabelPasien.getSelectedRow();
        this.tfIdPasien.setText(TabelPasien.getValueAt(klik, 0).toString());
        this.tfNamaPasien.setText(TabelPasien.getValueAt(klik, 1).toString());
        this.tfAlamatPasien.setText(TabelPasien.getValueAt(klik, 2).toString());
        this.tfUmurPasien.setText(TabelPasien.getValueAt(klik, 3).toString());
        this.tfNoTlpnPasien.setText(TabelPasien.getValueAt(klik, 4).toString());
        this.tfGenderPasien.setText(TabelPasien.getValueAt(klik, 5).toString());
        this.tfTtlPasien.setText(TabelPasien.getValueAt(klik, 6).toString());
    }//GEN-LAST:event_TabelPasienMouseClicked

    private void btnDeletePasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePasienActionPerformed
        // TODO add your handling code here:
        if (cekSemuaTextKosong()) {
            JOptionPane.showMessageDialog(null, "Pilih Baris Data Terlebih Dahulu",
                    "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                int konfirmasi = JOptionPane.showConfirmDialog(null, "Yakin Ingin Menghapus Data ?",
                        "Konfirmasi", OK_CANCEL_OPTION, QUESTION_MESSAGE);
                if (konfirmasi == 0) {
                    int baris = TabelPasien.getSelectedRow();
                    int idpasien = Integer.parseInt(TabelPasien.getValueAt(baris, 0).toString());
                    this.aksesDataPasien.delete(idpasien);

                    this.setTabelModel();
                    this.refreshField();
                    JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");

                } else {
                    JOptionPane.showMessageDialog(this, "Data Gagal Dihapus");
                }

            } catch (SQLException ex) {
                Logger.getLogger(pasienview.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnDeletePasienActionPerformed

    private void btnUpdatePasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePasienActionPerformed
        // TODO add your handling code here:
        if (cekSemuaTextKosong()) {
            JOptionPane.showMessageDialog(null, "Pilih Baris Data Terlebih Dahulu",
                    "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                int konfirmasi = JOptionPane.showConfirmDialog(null, "Yakin Ingin Update Data ?",
                        "Konfirmasi", OK_CANCEL_OPTION, QUESTION_MESSAGE);
                if (konfirmasi == 0) {
                    //int baris = tblBuku.getSelectedRow();
                    if ("".equals(tfIdPasien.getText()) || "".equals(tfNamaPasien.getText()) || "".equals(tfAlamatPasien.getText())
                            || "".equals(tfUmurPasien.getText()) || "".equals(tfNoTlpnPasien.getText()) || "".equals(tfGenderPasien.getText())
                            || "".equals(tfTtlPasien.getText())) {
                        JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
                    }
                    int idpasien = Integer.parseInt(this.tfIdPasien.getText());
                    String namapasien = this.tfNamaPasien.getText();
                    String alamatpasien = this.tfAlamatPasien.getText();
                    String umurpasien = this.tfUmurPasien.getText();
                    String notlpnpasien = this.tfNoTlpnPasien.getText();
                    String genderpasien = this.tfGenderPasien.getText();
                    String ttlpasien = this.tfTtlPasien.getText();
                    this.aksesDataPasien.update(idpasien, namapasien, alamatpasien, umurpasien, notlpnpasien, genderpasien, ttlpasien);

                    this.setTabelModel();
                    this.refreshField();
                    JOptionPane.showMessageDialog(this, "Data Berhasil Diupdate");
                } else {
                    JOptionPane.showMessageDialog(this, "Data Gagal Diupdate");
                }
            } catch (SQLException ex) {
                Logger.getLogger(pasienview.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnUpdatePasienActionPerformed

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
            java.util.logging.Logger.getLogger(pasienview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pasienview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pasienview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pasienview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelPasien;
    private javax.swing.JButton btnDeletePasien;
    private javax.swing.JButton btnInsertPasien;
    private javax.swing.JButton btnKembaliPasien;
    private javax.swing.JButton btnUpdatePasien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfAlamatPasien;
    private javax.swing.JTextField tfGenderPasien;
    private javax.swing.JTextField tfIdPasien;
    private javax.swing.JTextField tfNamaPasien;
    private javax.swing.JTextField tfNoTlpnPasien;
    private javax.swing.JTextField tfTtlPasien;
    private javax.swing.JTextField tfUmurPasien;
    // End of variables declaration//GEN-END:variables
}
