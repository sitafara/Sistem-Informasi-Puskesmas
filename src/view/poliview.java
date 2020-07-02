
package view;

import aksesdata.AksesDataPoli;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.OK_CANCEL_OPTION;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE; 
import model.Poli;

public class poliview extends javax.swing.JFrame {
    
    AksesDataPoli aksesDataPoli;
    
    public poliview() throws SQLException {
        initComponents();
        this.aksesDataPoli = new AksesDataPoli();
        this.setTitle("Data Poli");
        this.setLocationRelativeTo(null);
//        this.setTextIdPoli();
        this.setTabelModel();
        this.setVisible(true);
        this.refreshField();
    }
    
//    public void setTextIdPoli() throws SQLException {
//        this.tfIdPoli.setEditable(false);
//        this.tfIdPoli.setEnabled(false);
//        int idpoli = this.aksesDataPoli.getSequenceIdPoli();
//        this.tfIdPoli.setText(String.valueOf(idpoli));
//    }
    
    public void setTabelModel() throws SQLException {
        this.TabelPoli.setModel(this.aksesDataPoli.viewTabel());
    }

    private boolean cekSemuaTextKosong() {
        boolean textKosong = false;
        if (this.tfIdPoli.getText().isEmpty()
                || this.tfIdDokter.getText().isEmpty()
                || this.tfNamaPoli.getText().isEmpty()
                || this.tfKeterangan.getText().isEmpty()) {
            textKosong = true;
        }
        return textKosong;
    }

    public void refreshField() {
        this.tfIdPoli.setText("");
        this.tfIdDokter.setText("");
        this.tfNamaPoli.setText("");
        this.tfKeterangan.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelPoli = new javax.swing.JTable();
        tfIdPoli = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfIdDokter = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfKeterangan = new javax.swing.JTextField();
        InsertPoli = new javax.swing.JButton();
        UpdatePoli = new javax.swing.JButton();
        DeletePoli = new javax.swing.JButton();
        btnKembaliPoli = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        tfNamaPoli = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ID Poli");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 100, 30));

        TabelPoli.setModel(new javax.swing.table.DefaultTableModel(
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
        TabelPoli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelPoliMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelPoli);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 62, 630, 290));
        getContentPane().add(tfIdPoli, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 200, 30));

        jLabel2.setText("ID Dokter");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 100, 30));
        getContentPane().add(tfIdDokter, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 200, 30));

        jLabel3.setText("Nama Poli");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 100, -1));

        jLabel4.setText("Keterangan Poli");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 100, 30));
        getContentPane().add(tfKeterangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 200, 30));

        InsertPoli.setText("INSERT");
        InsertPoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertPoliActionPerformed(evt);
            }
        });
        getContentPane().add(InsertPoli, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 80, 32));

        UpdatePoli.setText("UPDATE");
        UpdatePoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatePoliActionPerformed(evt);
            }
        });
        getContentPane().add(UpdatePoli, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 80, 32));

        DeletePoli.setText("DELETE");
        DeletePoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletePoliActionPerformed(evt);
            }
        });
        getContentPane().add(DeletePoli, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 80, 31));

        btnKembaliPoli.setText("BACK");
        btnKembaliPoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliPoliActionPerformed(evt);
            }
        });
        getContentPane().add(btnKembaliPoli, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 320, 290, 31));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setText("DATA POLI");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 103, 34));
        getContentPane().add(tfNamaPoli, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 200, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Pictures\\Saved Pictures\\h.jpg")); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 360));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Pictures\\Saved Pictures\\h.jpg")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKembaliPoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliPoliActionPerformed
        awal AW = new awal();
        AW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnKembaliPoliActionPerformed

    private void InsertPoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertPoliActionPerformed
        // TODO add your handling code here:
        if (cekSemuaTextKosong()) {
            JOptionPane.showMessageDialog(null, "Isi Kolom Terlebih Dahulu !!!",
                    "Insert Gagal", WARNING_MESSAGE);
        } else {
            try {
                int konfirmasi = JOptionPane.showConfirmDialog(null, "Apakah Yakin Input Data Poli ?"
                        , "Konfirmasi", OK_CANCEL_OPTION, QUESTION_MESSAGE);
                if (konfirmasi == 0) {
                    int idpoli = Integer.parseInt(tfIdPoli.getText());
                    int iddokter = Integer.parseInt(tfIdDokter.getText());
                    String namapoli = this.tfNamaPoli.getText();
                    String keterangan = this.tfKeterangan.getText();
                    this.aksesDataPoli.insert(idpoli, iddokter, namapoli, keterangan);
                }
                this.setTabelModel();
                JOptionPane.showMessageDialog(null, "Input Data Poli Berhasil");
//                this.setTextIdPoli();
                this.refreshField();
            } catch (SQLException ex) {
                Logger.getLogger(awal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_InsertPoliActionPerformed

    private void TabelPoliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelPoliMouseClicked
        // TODO add your handling code here:
        int klik = TabelPoli.getSelectedRow();
        this.tfIdPoli.setText(TabelPoli.getValueAt(klik, 0).toString());
        this.tfIdDokter.setText(TabelPoli.getValueAt(klik, 1).toString());
        this.tfNamaPoli.setText(TabelPoli.getValueAt(klik, 2).toString());
        this.tfKeterangan.setText(TabelPoli.getValueAt(klik, 3).toString());
    }//GEN-LAST:event_TabelPoliMouseClicked

    private void DeletePoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletePoliActionPerformed
        // TODO add your handling code here:
        if (cekSemuaTextKosong()) {
            JOptionPane.showMessageDialog(null, "Pilih Baris Data Terlebih Dahulu",
                    "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                int konfirmasi = JOptionPane.showConfirmDialog(null, "Yakin Ingin Menghapus Data ?",
                        "Konfirmasi", OK_CANCEL_OPTION, QUESTION_MESSAGE);
                if (konfirmasi == 0) {
                    int baris = TabelPoli.getSelectedRow();
                    int idpoli = Integer.parseInt(TabelPoli.getValueAt(baris, 0).toString());
                    this.aksesDataPoli.delete(idpoli);

                    this.setTabelModel();
                    this.refreshField();
                    JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");

                } else {
                    JOptionPane.showMessageDialog(this, "Data Gagal Dihapus");
                }

            } catch (SQLException ex) {
                Logger.getLogger(poliview.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_DeletePoliActionPerformed

    private void UpdatePoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatePoliActionPerformed
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
                    if ("".equals(tfIdPoli.getText()) || "".equals(tfIdDokter.getText()) || "".equals(tfNamaPoli.getText())
                            || "".equals(tfKeterangan.getText())) {
                        JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
                    }
                    int idpasien = Integer.parseInt(this.tfIdPoli.getText());
                    int iddokter = Integer.parseInt(this.tfIdDokter.getText());
                    String namapoli = this.tfNamaPoli.getText();
                    String keterangan = this.tfKeterangan.getText();
                    this.aksesDataPoli.update(idpasien, iddokter, namapoli, keterangan);

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
    }//GEN-LAST:event_UpdatePoliActionPerformed

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
            java.util.logging.Logger.getLogger(poliview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(poliview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(poliview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(poliview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeletePoli;
    private javax.swing.JButton InsertPoli;
    private javax.swing.JTable TabelPoli;
    private javax.swing.JButton UpdatePoli;
    private javax.swing.JButton btnKembaliPoli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfIdDokter;
    private javax.swing.JTextField tfIdPoli;
    private javax.swing.JTextField tfKeterangan;
    private javax.swing.JTextField tfNamaPoli;
    // End of variables declaration//GEN-END:variables
}
