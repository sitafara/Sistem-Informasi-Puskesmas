package view;

import aksesdata.AksesDataDokter;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.OK_CANCEL_OPTION;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import java.util.Date;

public class dokterview extends javax.swing.JFrame {
    
    AksesDataDokter aksesDataDokter;
    
    public dokterview()throws SQLException {
        initComponents();
        this.aksesDataDokter = new AksesDataDokter();
        this.setTitle("DATA DOKTER");
        this.setLocationRelativeTo(null);
        this.setTabelModel();
//        this.setTextIdDokter();
        this.setVisible(true);
    }
    
//    public void setTextIdDokter() throws SQLException {
//        this.tfIdDokter.setEditable(false);
//        this.tfIdDokter.setEnabled(false);
//        int iddokter = this.aksesDataDokter.getSequenceIdDokter();
//        this.tfIdDokter.setText(String.valueOf(iddokter));
//    }
    
    public void setTabelModel() throws SQLException {
        this.TabelDokter.setModel(this.aksesDataDokter.viewTabel());
    }
    
    private boolean cekSemuaTextKosong() {
        boolean textKosong = false;
        if (this.tfIdDokter.getText().isEmpty()
                || this.tfNamaDokter.getText().isEmpty()
                || this.tfSpesialis.getText().isEmpty()
                || this.tfTtl.getText().isEmpty()
                || this.tfGender.getText().isEmpty()) {
            textKosong = true;
        }
        return textKosong;
    }
    
    public void refreshField() {
        this.tfIdDokter.setText("");
        this.tfNamaDokter.setText("");
        this.tfSpesialis.setText("");
        this.tfTtl.setText("");
        this.tfGender.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        tfSpesialis = new javax.swing.JTextField();
        tfTtl = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnKembaliDokter = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tfGender = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfNamaDokter = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfIdDokter = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelDokter = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Jenis Kelamin");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 256, 100, 30));
        getContentPane().add(tfSpesialis, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 160, 250, 30));
        getContentPane().add(tfTtl, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 208, 250, 30));

        btnInsert.setText("INSERT");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 90, 40));

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 90, 40));

        jLabel1.setText("Nama Dokter");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 112, 100, 30));

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 90, 40));

        jLabel2.setText("Spesialis");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 160, 100, 30));

        btnKembaliDokter.setText("BACK");
        btnKembaliDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliDokterActionPerformed(evt);
            }
        });
        getContentPane().add(btnKembaliDokter, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 294, 31));

        jLabel3.setText("TTL");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 208, 100, 30));

        tfGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfGenderActionPerformed(evt);
            }
        });
        getContentPane().add(tfGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 256, 250, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("DATA  DOKTER");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 144, 34));
        getContentPane().add(tfNamaDokter, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 112, 250, 30));

        jLabel5.setText("ID Dokter");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 64, 100, 30));
        getContentPane().add(tfIdDokter, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 64, 250, 30));

        TabelDokter.setModel(new javax.swing.table.DefaultTableModel(
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
        TabelDokter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelDokterMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelDokter);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 518, 340));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Pictures\\Saved Pictures\\iuyu.jpg")); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 410));

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Pictures\\Saved Pictures\\iuyu.jpg")); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 690, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed

        if (cekSemuaTextKosong()) {
            JOptionPane.showMessageDialog(null, "Isi Kolom Terlebih Dahulu !!!",
                    "Insert Gagal", WARNING_MESSAGE);
        } else {
            try {
                int konfirmasi = JOptionPane.showConfirmDialog(null, "Apakah Yakin Input Data Dokter ? ",
                        "Konfirmasi", OK_CANCEL_OPTION, QUESTION_MESSAGE);
                if (konfirmasi == 0) {
                    int iddokter = Integer.parseInt(this.tfIdDokter.getText());
                    String namadokter = this.tfNamaDokter.getText();
                    String spesialis = this.tfSpesialis.getText();
                    String ttl = this.tfTtl.getText();
                    String jeniskelamin = this.tfGender.getText();
                    this.aksesDataDokter.insert(iddokter, namadokter, spesialis, ttl, jeniskelamin);
                }
                this.setTabelModel();
                JOptionPane.showMessageDialog(null, "Input Data Dokter Berhasil");
//                this.setTextIdDokter();
                this.refreshField();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (cekSemuaTextKosong()) {
            JOptionPane.showMessageDialog(null, "Pilih Baris Data Terlebih Dahulu",
                    "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                int konfirmasi = JOptionPane.showConfirmDialog(null, "Yakin Ingin Update Data ?",
                        "Konfirmasi", OK_CANCEL_OPTION, QUESTION_MESSAGE);
                if (konfirmasi == 0) {
                    if ("".equals(tfIdDokter.getText()) || "".equals(tfNamaDokter.getText()) || "".equals(tfSpesialis.getText())
                            || "".equals(tfTtl.getText()) || "".equals(tfGender.getText())) {
                        JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
                    }
                    int iddokter = Integer.parseInt(this.tfIdDokter.getText());
                    String namadokter = this.tfNamaDokter.getText();
                    String spesialis = this.tfSpesialis.getText();
                    String ttl = this.tfTtl.getText();
                    String jeniskelamin = this.tfGender.getText();
                    this.aksesDataDokter.update(iddokter, namadokter, spesialis, ttl, jeniskelamin);

                    this.setTabelModel();
                    this.refreshField();
                    JOptionPane.showMessageDialog(this, "Data Berhasil Diupdate");
                } else {
                    JOptionPane.showMessageDialog(this, "Data Gagal Diupdate");
                }
            } catch (SQLException ex) {
                Logger.getLogger(dokterview.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (cekSemuaTextKosong()) {
            JOptionPane.showMessageDialog(null, "Pilih Baris Data Terlebih Dahulu",
                    "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                int konfirmasi = JOptionPane.showConfirmDialog(null, "Yakin Ingin Menghapus Data ?",
                        "Konfirmasi", OK_CANCEL_OPTION, QUESTION_MESSAGE);
                if (konfirmasi == 0) {
                    int baris = TabelDokter.getSelectedRow();
                    int iddokter = Integer.parseInt(TabelDokter.getValueAt(baris, 0).toString());
                    this.aksesDataDokter.delete(iddokter);

                    this.setTabelModel();
                    this.refreshField();
                    JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");

                } else {
                    JOptionPane.showMessageDialog(this, "Data Gagal Dihapus");
                }

            } catch (SQLException ex) {
                Logger.getLogger(dokterview.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tfGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfGenderActionPerformed

    private void btnKembaliDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliDokterActionPerformed
        awal AW = new awal();
        AW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnKembaliDokterActionPerformed

    private void TabelDokterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelDokterMouseClicked
        // TODO add your handling code here:
        int klik = TabelDokter.getSelectedRow();
        this.tfIdDokter.setText(TabelDokter.getValueAt(klik, 0).toString());
        this.tfNamaDokter.setText(TabelDokter.getValueAt(klik, 1).toString());
        this.tfSpesialis.setText(TabelDokter.getValueAt(klik, 2).toString());
        this.tfTtl.setText(TabelDokter.getValueAt(klik, 3).toString());
        this.tfGender.setText(TabelDokter.getValueAt(klik, 4).toString());
    }//GEN-LAST:event_TabelDokterMouseClicked

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
            java.util.logging.Logger.getLogger(dokterview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dokterview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dokterview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dokterview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelDokter;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnKembaliDokter;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfGender;
    private javax.swing.JTextField tfIdDokter;
    private javax.swing.JTextField tfNamaDokter;
    private javax.swing.JTextField tfSpesialis;
    private javax.swing.JTextField tfTtl;
    // End of variables declaration//GEN-END:variables
}
