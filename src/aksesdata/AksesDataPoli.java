/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aksesdata;

import database.Koneksi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Poli;
import java.util.Date;

public class AksesDataPoli implements InterfaceViewTabel {
    
    private final Koneksi koneksiDatabase;

    public AksesDataPoli() {
        this.koneksiDatabase = new Koneksi();
    }
    
//    public int getSequenceIdPoli() throws SQLException {
//        String kodeSql = "SELECT last_number FROM user_sequences WHERE sequence_name LIKE 'ID_POLI'";
//        ResultSet hasilKodeSql = this.koneksiDatabase.getData(kodeSql);
//        hasilKodeSql.next();
//        return hasilKodeSql.getInt("last_number");
//    }
    
    public void insert(int idpoli, int iddokter, String namapoli, String keterangan) {
        String kodeSql = "INSERT INTO data_poli (ID_POLI, ID_DOKTER, NAMAPOLI_07083, KETERANGAN_POLI) VALUES ('"
                +idpoli+"', '" + iddokter + "', '" + namapoli + "', '" + keterangan + "')";
        this.koneksiDatabase.manipulasiData(kodeSql);
    }
    
    public void delete(int idpoli) {
        String kodeSql = "DELETE FROM data_poli WHERE ID_POLI = " + idpoli;
        
        System.out.println("DELETE FROM POLI_07083 WHERE ID_POLI = " + idpoli);
        this.koneksiDatabase.manipulasiData(kodeSql);
    }
    
    public void update(int idpoli, int iddokter, String namapoli, String keterangan) {
        String kodeSql = "UPDATE data_poli SET " + "NAMAPOLI_07083 = '" + namapoli + "', " + "ID_DOKTER = '" + iddokter + "', "
                + "KETERANGAN_POLI = '" + keterangan + "' " + "WHERE ID_POLI = " + idpoli ;
        this.koneksiDatabase.manipulasiData(kodeSql);
    }
            
    public DefaultTableModel viewTabel() throws SQLException {
        DefaultTableModel tabelModelPoli = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tabelModelPoli.addColumn("ID Poli");
        tabelModelPoli.addColumn("ID Dokter");
        tabelModelPoli.addColumn("Nama Poli");
        tabelModelPoli.addColumn("Keterangan");

        String kodeSql = "SELECT * FROM data_poli ORDER BY ID_POLI ASC";
        ResultSet hasilKodeSql = this.koneksiDatabase.getData(kodeSql);
        while (hasilKodeSql.next()) {
            int idpoli = hasilKodeSql.getInt("ID_POLI");
            int iddokter = hasilKodeSql.getInt("ID_DOKTER");
            String namapoli = hasilKodeSql.getString("NAMAPOLI_07083");
            String keterangan = hasilKodeSql.getString("KETERANGAN_POLI");

            Poli poli = new Poli();
            poli.setId_Poli(idpoli);
            poli.setId_Dokter(iddokter);
            poli.setNama_Poli(namapoli);
            poli.setKeterangan_Poli(keterangan);

            Object[] temp = new Object[4];
            temp[0] = poli.getId_Poli();
            temp[1] = poli.getId_Dokter();
            temp[2] = poli.getNama_Poli();
            temp[3] = poli.getKeterangan_Poli();

            tabelModelPoli.addRow(temp);
        }
        return tabelModelPoli;
    }
    
//    public DefaultTableModel viewTabelPoli() throws SQLException {
//        DefaultTableModel tabelModelPoli = new DefaultTableModel() {
//            public boolean isCellEditable(int row, int column) {
//                return false;
//            }
//        };
//        tabelModelPoli.addColumn("ID Poli");
//        tabelModelPoli.addColumn("ID Dokter");
//        tabelModelPoli.addColumn("Nama Poli");
//        tabelModelPoli.addColumn("Keterangan");
//
//        String kodeSql = ("SELECT POLI_07083.*, DOKTER_07083.*  "
//                    + "FROM POLI_07083 JOIN DOKTER_07083 ON POLI_07083.ID_DOKTER = DOKTER_07083.ID_DOKTER");
//        ResultSet hasilKodeSql = this.koneksiDatabase.getData(kodeSql);
//        while (hasilKodeSql.next()) {
//            int idpoli = hasilKodeSql.getInt("ID_POLI");
//            int iddokter = hasilKodeSql.getInt("ID_DOKTER");
//            String namapoli = hasilKodeSql.getString("NAMAPOLI_07083");
//            String keterangan = hasilKodeSql.getString("KETERANGAN_POLI");
//
//            Poli poli = new Poli();
//            poli.setId_Poli(idpoli);
//            poli.setId_Dokter(iddokter);
//            poli.setNama_Poli(namapoli);
//            poli.setKeterangan_Poli(keterangan);
//
//            Object[] temp = new Object[4];
//            temp[0] = poli.getId_Poli();
//            temp[1] = poli.getId_Dokter();
//            temp[2] = poli.getNama_Poli();
//            temp[3] = poli.getKeterangan_Poli();
//
//            tabelModelPoli.addRow(temp);
//        }
//        return tabelModelPoli;
//    }
    
    public String cariNamaDokter(int iddokter) throws SQLException {
        String kodeSql = "SELECT iddokter FROM DOKTER_07083 WHERE ID_DOKTER = " + iddokter;
        ResultSet hasilKodeSql = this.koneksiDatabase.getData(kodeSql);
        hasilKodeSql.next();
        String kodeSql2 = "SELECT a.ID_POLI, b.ID_DOKTER, b.NAMA_DOKTER"
                + "FROM POLI_07083 a "
                + "JOIN DOKTER_07083 b ON a.ID_POLI = b.ID_DOKTER"
                + "WHERE b.ID_DOKTER = " + hasilKodeSql.getInt("ID_DOKTER");
        ResultSet hasilKodeSql2 = this.koneksiDatabase.getData(kodeSql2);
        hasilKodeSql2.next();
        return hasilKodeSql2.getString("NAMA_DOKTER");
    }
}
