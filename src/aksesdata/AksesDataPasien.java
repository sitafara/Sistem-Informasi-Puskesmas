/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aksesdata;

import database.Koneksi;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import model.Pasien;
import java.util.Date;

public class AksesDataPasien implements InterfaceViewTabel {
    
    private final Koneksi koneksiDatabase;

    public AksesDataPasien() {
        this.koneksiDatabase = new Koneksi();
    }
    
//    public int getSequenceIdPasien() throws SQLException {
//        String kodeSql = "SELECT last_number FROM user_sequences WHERE sequence_name LIKE 'ID_PASIEN'";
//        ResultSet hasilKodeSql = this.koneksiDatabase.getData(kodeSql);
//        hasilKodeSql.next();
//        return hasilKodeSql.getInt("last_number");
//    }
    
    public void insert(String idpasien, String namapasien, String alamatpasien, String umurpasien, String notlpnpasien, String genderpasien, String ttlpasien) {
        String kodeSql = "INSERT INTO PASIEN_07083 (ID_PASIEN, NAMA_PASIEN, ALAMAT_PASIEN, UMUR_PASIEN, NOTLPN, JENIS_KELAMIN, TTL) VALUES ('"
                +idpasien+"', '"+namapasien+"', '" +alamatpasien+ "', '"+umurpasien+"', '"+notlpnpasien+"', '"+genderpasien+"', TO_DATE('"+ ttlpasien +"', 'dd/MM/yyyy'))";
        this.koneksiDatabase.manipulasiData(kodeSql);
    }
    
    public void delete(int idpasien) {
        String kodeSql = "DELETE FROM PASIEN_07083 WHERE ID_PASIEN = " + idpasien;
        
        System.out.println("DELETE FROM PASIEN_07083 WHERE ID_PASIEN = " + idpasien);
        this.koneksiDatabase.manipulasiData(kodeSql);
    }
    
    public void update(int idpasien, String namapasien, String alamatpasien, String umurpasien, String notlpnpasien, String genderpasien, String ttlpasien) {
        String kodeSql = "UPDATE PASIEN_07083 SET " + "NAMA_PASIEN = '" + namapasien + "', " + "ALAMAT_PASIEN = '" + alamatpasien + "', "
                + "UMUR_PASIEN = '" + umurpasien + "', " + "NOTLPN = '" + notlpnpasien + "', "+ "JENIS_KELAMIN = '" + genderpasien + "', "
                + "TTL = TO_DATE('"+ ttlpasien + "', 'yyyy-MM-dd') " + "WHERE ID_PASIEN = " + idpasien ;
        this.koneksiDatabase.manipulasiData(kodeSql);
    }
    
    public DefaultTableModel viewTabel() throws SQLException {
        DefaultTableModel tabelModelPasien = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tabelModelPasien.addColumn("ID Pasien");
        tabelModelPasien.addColumn("Nama Pasien");
        tabelModelPasien.addColumn("Alamat Pasien");
        tabelModelPasien.addColumn("Umur Pasien");
        tabelModelPasien.addColumn("No Tlpn");
        tabelModelPasien.addColumn("Jenis Kelamin");
        tabelModelPasien.addColumn("TTL");

        String kodeSql = "SELECT * FROM PASIEN_07083 ORDER BY ID_PASIEN ASC";
        ResultSet hasilKodeSql = this.koneksiDatabase.getData(kodeSql);
        while (hasilKodeSql.next()) {
            int idpasien = hasilKodeSql.getInt("ID_PASIEN");
            String namapasien = hasilKodeSql.getString("NAMA_PASIEN");
            String alamatpasien = hasilKodeSql.getString("ALAMAT_PASIEN");
            String umurpasien = hasilKodeSql.getString("UMUR_PASIEN");
            String notlpnpasien = hasilKodeSql.getString("NOTLPN");
            String genderpasien = hasilKodeSql.getString("JENIS_KELAMIN");
            Date ttlpasien = hasilKodeSql.getDate("TTL");
            
            Pasien pasien = new Pasien();
            pasien.setId_Pasien(idpasien);
            pasien.setNama_Pasien(namapasien);
            pasien.setAlamat_Pasien(alamatpasien);
            pasien.setUmur_Pasien(umurpasien);
            pasien.setNo_Tlpn_Pasien(notlpnpasien);
            pasien.setGender_Pasien(genderpasien);
            pasien.setTtl_Pasien(ttlpasien);
            
            Object[] temp = new Object[7];
            temp[0] = pasien.getId_Pasien();
            temp[1] = pasien.getNama_Pasien();
            temp[2] = pasien.getAlamat_Pasien();
            temp[3] = pasien.getUmur_Pasien();
            temp[4] = pasien.getNo_Tlpn_Pasien();
            temp[5] = pasien.getGender_Pasien();
            temp[6] = pasien.getTtl_Pasien();
            tabelModelPasien.addRow(temp);
        }
        return tabelModelPasien;
    }
    
//    public ArrayList<Pasien> getSemuaDataPasien() throws SQLException {
//        ArrayList<Pasien> daftarDataPasien = new ArrayList<>();
//
//        String kodeSql = "SELECT * FROM PASIEN_07083";
//        ResultSet hasilKodeSql = this.koneksiDatabase.getData(kodeSql);
//        while (hasilKodeSql.next()) {
//            int idpasien = hasilKodeSql.getInt("ID_PASIEN");
//            String namapasien = hasilKodeSql.getString("NAMA_PASIEN");
//            String alamatpasien = hasilKodeSql.getString("ALAMAT_PASIEN");
//            String umurpasien = hasilKodeSql.getString("UMUR_PASIEN");
//            String notlpnpasien = hasilKodeSql.getString("NOTLPN");
//            String genderpasien = hasilKodeSql.getString("JENIS_KELAMIN");
//            String ttlpasien = hasilKodeSql.getString("TTL");
//            
//            Pasien pasien = new Pasien();
//            pasien.setId_Pasien(idpasien);
//            pasien.setNama_Pasien(namapasien);
//            pasien.setAlamat_Pasien(alamatpasien);
//            pasien.setUmur_Pasien(umurpasien);
//            pasien.setNo_Tlpn_Pasien(notlpnpasien);
//            pasien.setGender_Pasien(genderpasien);
//            pasien.setTtl_Pasien(ttlpasien);
//            daftarDataPasien.add(pasien);
//        }
//        return daftarDataPasien;
//    }
//    
//    public boolean cekDataPasienMasihKosong() throws SQLException {
//        String kodeSql = "SELECT * FROM PASIEN_07083";
//        ResultSet hasilKodeSql = this.koneksiDatabase.getData(kodeSql);
//        return !hasilKodeSql.next();
//    }
//    
//    public int cariIdPasien(String namapasien) throws SQLException {
//        String kodeSql = "SELECT ID_PASIEN FROM PASIEN_07083 WHERE NAMA_PASIEN LIKE '" + namapasien + "'";
//        ResultSet hasilKodeSql = this.koneksiDatabase.getData(kodeSql);
//        hasilKodeSql.next();
//        return hasilKodeSql.getInt("ID_PASIEN");
//    }
//    
//    public Pasien cariDataPasien(int idpasien) throws SQLException {
//        Pasien pasien = null;
//        String kodeSql = "SELECT * FROM PASIEN_07083 WHERE ID_PASIEN = " + idpasien;
//        ResultSet hasilKodeSql = this.koneksiDatabase.getData(kodeSql);
//        if (hasilKodeSql.next()) {
//            String namapasien = hasilKodeSql.getString("NAMA_PASIEN");
//            String alamatpasien = hasilKodeSql.getString("ALAMAT_PASIEN");
//            String umurpasien = hasilKodeSql.getString("UMUR_PASIEN");
//            String notlpnpasien = hasilKodeSql.getString("NOTLPN");
//            String jeniskelamin = hasilKodeSql.getString("JENIS_KELAMIN");
//            String ttlpasien = hasilKodeSql.getString("TTL");
//            
//            pasien = new Pasien();
//            pasien.setId_Pasien(idpasien);
//            pasien.setNama_Pasien(namapasien);
//            pasien.setAlamat_Pasien(alamatpasien);
//            pasien.setUmur_Pasien(umurpasien);
//            pasien.setNo_Tlpn_Pasien(notlpnpasien);
//            pasien.setGender_Pasien(jeniskelamin);
//            pasien.setTtl_Pasien(ttlpasien);
//        }
//        return pasien;
//    }
}
