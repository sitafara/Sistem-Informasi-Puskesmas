
package view;

import view.awal;
import aksesdata.AksesDataRekamedik;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.OK_CANCEL_OPTION;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import java.util.Date;

public class rekamedikview extends javax.swing.JFrame {
    
    AksesDataRekamedik aksesDataRekamedik;
    
    public rekamedikview() throws SQLException{
        initComponents();
        this.aksesDataRekamedik = new AksesDataRekamedik();
        this.setTitle("Data Rekamedik");
        this.setLocationRelativeTo(null);
//        this.setTextNoRekamedik();
        this.setTabelModel();
        this.setVisible(true);
    }
    
//    public void setTextNoRekamedik() throws SQLException {
//        this.tfNoRekamedik.setEditable(false);
//        this.tfNoRekamedik.setEnabled(false);
//        int norekamedik = this.aksesDataRekamedik.getSequenceNoRekamedik();
//        this.tfNoRekamedik.setText(String.valueOf(norekamedik));
//    }

    public void setTabelModel() throws SQLException {
        this.TabelRekamedik.setModel(this.aksesDataRekamedik.viewTabel());
    }

    private boolean cekSemuaTextKosong() {
        boolean textKosong = false;
        if (this.tfNoRekamedik.getText().isEmpty()
                || this.tfIdPasien.getText().isEmpty()
                || this.tfIdPoli.getText().isEmpty()
                || this.tfKeluhan.getText().isEmpty()
                || this.tfBeratBadan.getText().isEmpty()
                || this.tfTinggiBadan.getText().isEmpty()
                || this.tfSuhuTubuh.getText().isEmpty()
                || this.tfTekananDarah.getText().isEmpty()
                || this.tfTanggalKedatangan.getText().isEmpty()) {
            textKosong = true;
        }
        return textKosong;
    }
    
    public void refreshField() {
        this.tfNoRekamedik.setText("");
        this.tfIdPasien.setText("");
        this.tfIdPoli.setText("");
        this.tfKeluhan.setText("");
        this.tfBeratBadan.setText("");
        this.tfTinggiBadan.setText("");
        this.tfSuhuTubuh.setText("");
        this.tfTekananDarah.setText("");
        this.tfTanggalKedatangan.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TabelRekamedik = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tfNoRekamedik = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfIdPasien = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfIdPoli = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfKeluhan = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfBeratBadan = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfTinggiBadan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfSuhuTubuh = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfTekananDarah = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfTanggalKedatangan = new javax.swing.JTextField();
        ButtonInsert = new javax.swing.JButton();
        ButtonUpdate = new javax.swing.JButton();
        ButtonDelete = new javax.swing.JButton();
        btnKembaliRekam = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TabelRekamedik.setModel(new javax.swing.table.DefaultTableModel(
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
        TabelRekamedik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelRekamedikMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelRekamedik);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 710, 160));

        jLabel1.setText("No Rekamedik");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 100, 30));
        getContentPane().add(tfNoRekamedik, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 162, 30));

        jLabel2.setText("ID Pasien");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 100, 30));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 63, 61, 30));

        tfIdPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdPasienActionPerformed(evt);
            }
        });
        getContentPane().add(tfIdPasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 162, 30));

        jLabel5.setText("ID Poli");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 100, 30));
        getContentPane().add(tfIdPoli, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 162, 30));

        jLabel6.setText("Berat Badan");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 100, 30));

        tfKeluhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfKeluhanActionPerformed(evt);
            }
        });
        getContentPane().add(tfKeluhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 162, 30));

        jLabel7.setText("Suhu Tubuh");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 63, 100, 29));
        getContentPane().add(tfBeratBadan, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 162, 29));

        jLabel8.setText("Keluhan");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 100, 30));
        getContentPane().add(tfTinggiBadan, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 162, 30));

        jLabel9.setText("Tinggi Badan");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 100, 29));
        getContentPane().add(tfSuhuTubuh, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 63, 162, 29));

        jLabel10.setText("Tanggal Kedatangan");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 125, 30));
        getContentPane().add(tfTekananDarah, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 111, 162, 30));

        jLabel11.setText("Tekanan Darah");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 111, 100, 30));
        getContentPane().add(tfTanggalKedatangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, 160, 30));

        ButtonInsert.setText("INSERT");
        ButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonInsertActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 233, 80, 35));

        ButtonUpdate.setText("UPDATE");
        ButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 233, 80, 35));

        ButtonDelete.setText("DELETE");
        ButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 233, 80, 35));

        btnKembaliRekam.setText("BACK");
        btnKembaliRekam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliRekamActionPerformed(evt);
            }
        });
        getContentPane().add(btnKembaliRekam, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 286, 248, 33));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("DATA REKAMEDIK");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 11, 170, 34));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Pictures\\Saved Pictures\\ihu.jpg")); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 380));

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Pictures\\Saved Pictures\\ihu.jpg")); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 680, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfIdPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdPasienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdPasienActionPerformed

    private void tfKeluhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfKeluhanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfKeluhanActionPerformed

    private void btnKembaliRekamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliRekamActionPerformed
        awal AW = new awal();
        AW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnKembaliRekamActionPerformed

    private void ButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonInsertActionPerformed
        // TODO add your handling code here:
        if (cekSemuaTextKosong()) {
            JOptionPane.showMessageDialog(null, "Isi Kolom Terlebih Dahulu !!!",
                    "Insert Gagal", WARNING_MESSAGE);
        } else {
            try {
                int konfirmasi = JOptionPane.showConfirmDialog(null, "Apakah Yakin Input Data Rekamedik ?"
                        ,"Konfirmasi", OK_CANCEL_OPTION, QUESTION_MESSAGE);
                if (konfirmasi == 0) {
                    int norekamedik = Integer.parseInt(tfNoRekamedik.getText());
                    int idpasien = Integer.parseInt(tfIdPasien.getText());
                    int idpoli = Integer.parseInt(tfIdPoli.getText());
                    String keluhan = this.tfKeluhan.getText();
                    String beratbadan = this.tfBeratBadan.getText();
                    String tinggibadan = this.tfTinggiBadan.getText();
                    String suhutubuh = this.tfSuhuTubuh.getText();
                    String tekanandarah = this.tfTekananDarah.getText();
                    String tanggalkedatangan = this.tfTanggalKedatangan.getText();
                    this.aksesDataRekamedik.insert(norekamedik, idpasien, idpoli, keluhan, beratbadan, tinggibadan, suhutubuh, tekanandarah, tanggalkedatangan);
                }
                this.setTabelModel();
                JOptionPane.showMessageDialog(null, "Input Data Rekamedik Berhasil");
//                this.setTextNoRekamedik();
                this.refreshField();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_ButtonInsertActionPerformed

    private void TabelRekamedikMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelRekamedikMouseClicked
        // TODO add your handling code here:
        int klik = TabelRekamedik.getSelectedRow();
        this.tfNoRekamedik.setText(TabelRekamedik.getValueAt(klik, 0).toString());
        this.tfIdPasien.setText(TabelRekamedik.getValueAt(klik, 1).toString());
        this.tfIdPoli.setText(TabelRekamedik.getValueAt(klik, 2).toString());
        this.tfKeluhan.setText(TabelRekamedik.getValueAt(klik, 3).toString());
        this.tfBeratBadan.setText(TabelRekamedik.getValueAt(klik, 4).toString());
        this.tfTinggiBadan.setText(TabelRekamedik.getValueAt(klik, 5).toString());
        this.tfSuhuTubuh.setText(TabelRekamedik.getValueAt(klik, 6).toString());
        this.tfTekananDarah.setText(TabelRekamedik.getValueAt(klik, 7).toString());
        this.tfTanggalKedatangan.setText(TabelRekamedik.getValueAt(klik, 8).toString());
    }//GEN-LAST:event_TabelRekamedikMouseClicked

    private void ButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDeleteActionPerformed
        // TODO add your handling code here:
        if (cekSemuaTextKosong()) {
            JOptionPane.showMessageDialog(null, "Pilih Baris Data Terlebih Dahulu",
                    "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                int konfirmasi = JOptionPane.showConfirmDialog(null, "Yakin Ingin Menghapus Data ?",
                        "Konfirmasi", OK_CANCEL_OPTION, QUESTION_MESSAGE);
                if (konfirmasi == 0) {
                    int baris = TabelRekamedik.getSelectedRow();
                    int norekamedik = Integer.parseInt(TabelRekamedik.getValueAt(baris, 0).toString());
                    this.aksesDataRekamedik.delete(norekamedik);

                    this.setTabelModel();
                    this.refreshField();
                    JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");

                } else {
                    JOptionPane.showMessageDialog(this, "Data Gagal Dihapus");
                }

            } catch (SQLException ex) {
                Logger.getLogger(rekamedikview.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_ButtonDeleteActionPerformed

    private void ButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonUpdateActionPerformed
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
                    if ("".equals(tfNoRekamedik.getText()) || "".equals(tfIdPasien.getText()) || "".equals(tfIdPoli.getText())
                            || "".equals(tfKeluhan.getText()) || "".equals(tfBeratBadan.getText()) || "".equals(tfTinggiBadan.getText())
                            || "".equals(tfSuhuTubuh.getText()) || "".equals(tfTekananDarah.getText()) || "".equals(tfTanggalKedatangan.getText())) {
                        JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
                    }
                    int norekamedik = Integer.parseInt(tfNoRekamedik.getText());
                    int idpasien = Integer.parseInt(tfIdPasien.getText());
                    int idpoli = Integer.parseInt(tfIdPoli.getText());
                    String keluhan = this.tfKeluhan.getText();
                    String beratbadan = this.tfBeratBadan.getText();
                    String tinggibadan = this.tfTinggiBadan.getText();
                    String suhutubuh = this.tfSuhuTubuh.getText();
                    String tekanandarah = this.tfTekananDarah.getText();
                    String tanggalkedatangan = this.tfTanggalKedatangan.getText();
                    this.aksesDataRekamedik.update(norekamedik, idpoli, idpasien, keluhan, beratbadan, tinggibadan, suhutubuh, tekanandarah, tanggalkedatangan);
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
    }//GEN-LAST:event_ButtonUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(rekamedikview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rekamedikview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rekamedikview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rekamedikview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonDelete;
    private javax.swing.JButton ButtonInsert;
    private javax.swing.JButton ButtonUpdate;
    private javax.swing.JTable TabelRekamedik;
    private javax.swing.JButton btnKembaliRekam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfBeratBadan;
    private javax.swing.JTextField tfIdPasien;
    private javax.swing.JTextField tfIdPoli;
    private javax.swing.JTextField tfKeluhan;
    private javax.swing.JTextField tfNoRekamedik;
    private javax.swing.JTextField tfSuhuTubuh;
    private javax.swing.JTextField tfTanggalKedatangan;
    private javax.swing.JTextField tfTekananDarah;
    private javax.swing.JTextField tfTinggiBadan;
    // End of variables declaration//GEN-END:variables
}
