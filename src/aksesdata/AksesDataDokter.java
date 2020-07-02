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
import model.Dokter;
import java.util.Date;

public class AksesDataDokter implements InterfaceViewTabel {
    
    private final Koneksi koneksiDatabase;

    public AksesDataDokter() {
        this.koneksiDatabase = new Koneksi();
    }

//    public int getSequenceIdDokter() throws SQLException {
//        String kodeSql = "SELECT last_number FROM user_sequences WHERE sequence_name LIKE 'ID_DOKTER'";
//        ResultSet hasilKodeSql = this.koneksiDatabase.getData(kodeSql);
//        hasilKodeSql.next();
//        return hasilKodeSql.getInt("last_number");
//    }
    
    public void insert(int iddokter, String namadokter, String spesialis, String ttl, String jeniskelamin) {
        String kodeSql = "INSERT INTO DOKTER_07083 (ID_DOKTER, NAMA_DOKTER, SPESIALIS, TTL, JENIS_KELAMIN) VALUES ('"
                +iddokter+"', '"+namadokter+"', '"+spesialis+"', TO_DATE('"+ttl+"', 'dd/MM/yyyy'), '"+jeniskelamin+"')";
        this.koneksiDatabase.manipulasiData(kodeSql);
    }
    
    public void delete(int iddokter) {
        String kodeSql = "DELETE FROM DOKTER_07083 WHERE ID_DOKTER = " + iddokter;
        this.koneksiDatabase.manipulasiData(kodeSql);
    }
    
    public void update(int iddokter, String namadokter, String spesialis, String ttl, String jeniskelamin) {
        String kodeSql = "UPDATE DOKTER_07083 SET " + "NAMA_DOKTER = '" + namadokter + "', " + "SPESIALIS = '" + spesialis + "', "
                + "JENIS_KELAMIN = '" + jeniskelamin + "', " + "TTL = TO_DATE('"+ ttl + "', 'yyyy-MM-dd') " + "WHERE ID_DOKTER = " + iddokter;
        this.koneksiDatabase.manipulasiData(kodeSql);
    }
    
    public DefaultTableModel viewTabel() throws SQLException {
        DefaultTableModel tabelModelDokter = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return true;
            }
        };
        tabelModelDokter.addColumn("ID Dokter");
        tabelModelDokter.addColumn("Nama Dokter");
        tabelModelDokter.addColumn("Spesialis");
        tabelModelDokter.addColumn("TTL");
        tabelModelDokter.addColumn("Jenis Kelamin");

        String kodeSql = "SELECT * FROM DOKTER_07083 ORDER BY ID_DOKTER ASC";
        ResultSet hasilKodeSql = this.koneksiDatabase.getData(kodeSql);
        while (hasilKodeSql.next()) {
            int iddokter = hasilKodeSql.getInt("ID_DOKTER");
            String namadokter = hasilKodeSql.getString("NAMA_DOKTER");
            String spesialis = hasilKodeSql.getString("SPESIALIS");
            Date ttl = hasilKodeSql.getDate("TTL");
            String jeniskelamin = hasilKodeSql.getString("JENIS_KELAMIN");
            
            Dokter dokter = new Dokter();
            dokter.setId_Dokter(iddokter);
            dokter.setNama_Dokter(namadokter);
            dokter.setSpesialis(spesialis);
            dokter.setTtl(ttl);
            dokter.setJenis_Kelamin(jeniskelamin);
            
            Object[] temp = new Object[5];
            temp[0] = dokter.getId_Dokter();
            temp[1] = dokter.getNama_Dokter();
            temp[2] = dokter.getSpesialis();
            temp[3] = dokter.getTtl();
            temp[4] = dokter.getJenis_Kelamin();
            tabelModelDokter.addRow(temp);
        }
        return tabelModelDokter;
    }
    
     public boolean cekDataDokterMasihKosong() throws SQLException {
        String kodeSql = "SELECT * FROM DOKTER_07083";
        ResultSet hasilKodeSql = this.koneksiDatabase.getData(kodeSql);
        return !hasilKodeSql.next();
    }
    
//    public ArrayList<Dokter> getSemuaDataDokter() throws SQLException {
//        ArrayList<Dokter> daftarDataDokter = new ArrayList<>();
//
//        String kodeSql = "SELECT * FROM DOKTER_07083";
//        ResultSet hasilKodeSql = this.koneksiDatabase.getData(kodeSql);
//        while (hasilKodeSql.next()) {
//            int iddokter = hasilKodeSql.getInt("ID_DOKTER");
//            String namadokter = hasilKodeSql.getString("NAMA_DOKTER");
//            String spesialis = hasilKodeSql.getString("SPESIALIS");
//            String ttl = hasilKodeSql.getString("TTL");
//            String jeniskelamin = hasilKodeSql.getString("JENIS_KELAMIN");
//            
//            Dokter dokter = new Dokter();
//            dokter.setId_Dokter(iddokter);
//            dokter.setNama_Dokter(namadokter);
//            dokter.setSpesialis(spesialis);
//            dokter.setTtl(ttl);
//            dokter.setJenis_Kelamin(jeniskelamin);
//            daftarDataDokter.add(dokter);
//        }
//        return daftarDataDokter;
//    }
//    
   
//    
//    public int cariIdDokter(String namadokter) throws SQLException {
//        String kodeSql = "SELECT ID_DOKTER FROM DOKTER_07083 WHERE NAMA_DOKTER LIKE '" + namadokter + "'";
//        ResultSet hasilKodeSql = this.koneksiDatabase.getData(kodeSql);
//        hasilKodeSql.next();
//        return hasilKodeSql.getInt("ID_DOKTER");
//    }
//    
//    public Dokter cariDataDokter(int iddokter) throws SQLException {
//        Dokter dokter = null;
//        String kodeSql = "SELECT * FROM DOKTER_07083 WHERE ID_DOKTER = " + iddokter;
//        ResultSet hasilKodeSql = this.koneksiDatabase.getData(kodeSql);
//        if (hasilKodeSql.next()) {
//            String namadokter = hasilKodeSql.getString("NAMA_DOKTER");
//            String spesialis = hasilKodeSql.getString("SPESIALIS");
//            Date ttl = hasilKodeSql.getDate("TTL");
//            String jeniskelamin = hasilKodeSql.getString("JENIS_KELAMIN");
//            
//            dokter = new Dokter();
//            dokter.setId_Dokter(iddokter);
//            dokter.setNama_Dokter(namadokter);
//            dokter.setSpesialis(spesialis);
//            dokter.setTtl(ttl);
//            dokter.setJenis_Kelamin(jeniskelamin);
//        }
//        return dokter;
//    }
   
}
