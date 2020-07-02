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
import model.Rekamedik;
import java.util.Date;

public class AksesDataRekamedik implements InterfaceViewTabel {
    
    private final Koneksi koneksiDatabase;

    public AksesDataRekamedik() {
        this.koneksiDatabase = new Koneksi();
    }
    
//    public int getSequenceNoRekamedik() throws SQLException {
//        String kodeSql = "SELECT last_number FROM user_sequences WHERE sequence_name LIKE 'NO_REKAMEDIK'";
//        ResultSet hasilKodeSql = this.koneksiDatabase.getData(kodeSql);
//        hasilKodeSql.next();
//        return hasilKodeSql.getInt("last_number");
//    }
    
    public void insert(int norekamedik, int idpasien, int idpoli, String keluhan, String beratbadan, String tinggibadan, String suhutubuh, String tekanandarah, String tanggalkedatangan) {
        String kodeSql = "INSERT INTO REKAMEDIK_07083 (NO_REKAMEDIK, ID_PASIEN, ID_POLI, KELUHAN, BERAT_BADAN, TINGGI_BADAN, SUHU_TUBUH, TEKANAN_DARAH, TANGGAL_KEDATANGAN) VALUES ('"
                +norekamedik+"', '"+idpasien+"', '"+idpoli+"', '"+keluhan+"', '"+beratbadan+"', '"+tinggibadan+"', '"+suhutubuh+"', '"+tekanandarah+"', TO_DATE('"+tanggalkedatangan+"', 'dd/MM/yyyy'))";
        this.koneksiDatabase.manipulasiData(kodeSql);
    }
    
    public void delete(int norekamedik) {
        String kodeSql = "DELETE FROM REKAMEDIK_07083 WHERE NO_REKAMEDIK = " + norekamedik;
        this.koneksiDatabase.manipulasiData(kodeSql);
    }
    
    public void update(int norekamedik, int idpoli, int idpasien, String keluhan, String beratbadan, String tinggibadan, String suhutubuh, String tekanandarah, String tanggalkedatangan) {
        String kodeSql = "UPDATE REKAMEDIK_07083 SET " + "ID_PASIEN = '" + idpasien + "', " + "ID_POLI = '" + idpoli + "', "
                + "KELUHAN = '" + keluhan + "', " + "BERAT_BADAN = '" + beratbadan + "', "+ "TINGGI_BADAN = '" + tinggibadan + "', "
                + "SUHU_TUBUH = '" + suhutubuh + "', " + "TEKANAN_DARAH = '" + tekanandarah + "', "
                + "TANGGAL_KEDATANGAN = TO_DATE('"+ tanggalkedatangan + "', 'yyyy-MM-dd') " + "WHERE NO_REKAMEDIK = " + norekamedik ;
        this.koneksiDatabase.manipulasiData(kodeSql);
    }
    
    public DefaultTableModel viewTabel() throws SQLException {
        DefaultTableModel tabelModelRekamedik = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tabelModelRekamedik.addColumn("No Rekamedik");
        tabelModelRekamedik.addColumn("ID Pasien");
        tabelModelRekamedik.addColumn("ID Poli");
        tabelModelRekamedik.addColumn("Keluhan");
        tabelModelRekamedik.addColumn("Berat Badan");
        tabelModelRekamedik.addColumn("Tinggi Badan");
        tabelModelRekamedik.addColumn("Suhu Tubuh");
        tabelModelRekamedik.addColumn("Tekanan Darah");
        tabelModelRekamedik.addColumn("Tanggal Kedatangan");

        String kodeSql = "SELECT * FROM REKAMEDIK_07083 ORDER BY NO_REKAMEDIK ASC";
        ResultSet hasilKodeSql = this.koneksiDatabase.getData(kodeSql);
        while (hasilKodeSql.next()) {
            int norekamedik = hasilKodeSql.getInt("NO_REKAMEDIK");
            int idpasien = hasilKodeSql.getInt("ID_PASIEN");
            int idpoli = hasilKodeSql.getInt("ID_POLI");
            String keluhan = hasilKodeSql.getString("KELUHAN");
            String beratbadan = hasilKodeSql.getString("BERAT_BADAN");
            String tinggibadan = hasilKodeSql.getString("TINGGI_BADAN");
            String suhutubuh = hasilKodeSql.getString("SUHU_TUBUH");
            String tekanandarah = hasilKodeSql.getString("TEKANAN_DARAH");
            Date tanggalkedatangan = hasilKodeSql.getDate("TANGGAL_KEDATANGAN");

            Rekamedik rekamedik = new Rekamedik();
            rekamedik.setNo_Rekamedik(norekamedik);
            rekamedik.setId_Pasien(idpasien);
            rekamedik.setId_Poli(idpoli);
            rekamedik.setKeluhan(keluhan);
            rekamedik.setBerat_Badan(beratbadan);
            rekamedik.setTinggi_Badan(tinggibadan);
            rekamedik.setSuhu_Tubuh(suhutubuh);
            rekamedik.setTekanan_Darah(tekanandarah);
            rekamedik.setTanggal_Kedatangan(tanggalkedatangan);
            
            Object[] temp = new Object[9];
            temp[0] = rekamedik.getNo_Rekamedik();
            temp[1] = rekamedik.getId_Pasien();
            temp[2] = rekamedik.getId_Poli();
            temp[3] = rekamedik.getKeluhan();
            temp[4] = rekamedik.getBerat_Badan();
            temp[5] = rekamedik.getTinggi_Badann();
            temp[6] = rekamedik.getSuhu_Tubuh();
            temp[7] = rekamedik.getTekanan_Darah();
            temp[8] = rekamedik.getTanggal_Kedatangan();

            tabelModelRekamedik.addRow(temp);
        }
        return tabelModelRekamedik;
    }
    
    public DefaultTableModel viewTabelRekamedik() throws SQLException {
        DefaultTableModel tabelModelRekamedik = new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tabelModelRekamedik.addColumn("No Rekamedik");
        tabelModelRekamedik.addColumn("ID Pasien");
        tabelModelRekamedik.addColumn("Nama Pasien");
        tabelModelRekamedik.addColumn("ID Poli");
        tabelModelRekamedik.addColumn("Nama Poli");
        tabelModelRekamedik.addColumn("Keluhan");
        tabelModelRekamedik.addColumn("Berat Badan");
        tabelModelRekamedik.addColumn("Tinggi Badan");
        tabelModelRekamedik.addColumn("Suhu Tubuh");
        tabelModelRekamedik.addColumn("Tekanan Darah");
        tabelModelRekamedik.addColumn("Tanggal Kedatangan");

        String kodeSql = ("SELECT REKAMEDIK_07083.*, PASIEN_07083.*, POLI_07083.*  "
                + "FROM REKAMEDIK_07083 JOIN PASIEN_07083 ON REKAMEDIK_07083.ID_PASIEN = PASIEN_07083.ID_PASIEN"
                + "JOIN POLI_07083 ON REKAMEDIK_07083.ID_POLI = POLI_07083.ID_POLI");
        ResultSet hasilKodeSql = this.koneksiDatabase.getData(kodeSql);
        while (hasilKodeSql.next()) {
            int norekamedik = hasilKodeSql.getInt("NO_REKAMEDIK");
            int idpasien = hasilKodeSql.getInt("ID_PASIEN");
            int idpoli = hasilKodeSql.getInt("ID_POLI");
            String keluhan = hasilKodeSql.getString("KELUHAN");
            String beratbadan = hasilKodeSql.getString("BERAT_BADAN");
            String tinggibadan = hasilKodeSql.getString("TINGGI_BADAN");
            String suhutubuh = hasilKodeSql.getString("SUHU_TUBUH");
            String tekanandarah = hasilKodeSql.getString("TEKANAN_DARAH");
            Date tanggalkedatangan = hasilKodeSql.getDate("TANGGAL_KEDATANGAN");

            Rekamedik rekamedik = new Rekamedik();
            rekamedik.setNo_Rekamedik(norekamedik);
            rekamedik.setId_Pasien(idpasien);
            rekamedik.setId_Poli(idpoli);
            rekamedik.setKeluhan(keluhan);
            rekamedik.setBerat_Badan(beratbadan);
            rekamedik.setTinggi_Badan(tinggibadan);
            rekamedik.setSuhu_Tubuh(suhutubuh);
            rekamedik.setTekanan_Darah(tekanandarah);
            rekamedik.setTanggal_Kedatangan(tanggalkedatangan);
            
            Object[] temp = new Object[9];
            temp[0] = rekamedik.getNo_Rekamedik();
            temp[1] = rekamedik.getId_Pasien();
            temp[2] = rekamedik.getId_Poli();
            temp[3] = rekamedik.getKeluhan();
            temp[4] = rekamedik.getBerat_Badan();
            temp[5] = rekamedik.getTinggi_Badann();
            temp[6] = rekamedik.getSuhu_Tubuh();
            temp[7] = rekamedik.getTekanan_Darah();
            temp[8] = rekamedik.getTanggal_Kedatangan();

            tabelModelRekamedik.addRow(temp);
        }
        return tabelModelRekamedik;
    }
    
    public String cariNamaPasien(int idpasien) throws SQLException {
        String kodeSql = "SELECT idpasien FROM PASIEN_07083 WHERE ID_PASIEN = " + idpasien;
        ResultSet hasilKodeSql = this.koneksiDatabase.getData(kodeSql);
        hasilKodeSql.next();
        String kodeSql2 = "SELECT a.NO_REKAMEDIK, b.ID_PASIEN, b.NAMA_PASIEN"
                + "FROM REKAMEDIK_07083 a "
                + "JOIN PASIEN_07083 b ON a.NO_REKAMEDIK = b.ID_PASIEN"
                + "WHERE b.ID_PASIEN = " + hasilKodeSql.getInt("ID_PASIEN");
        ResultSet hasilKodeSql2 = this.koneksiDatabase.getData(kodeSql2);
        hasilKodeSql2.next();
        return hasilKodeSql2.getString("NAMA_PASIEN");
    }
    
    public String cariNamaPoli(int idpoli) throws SQLException {
        String kodeSql = "SELECT idpoli FROM POLI_07083 WHERE ID_POLI = " + idpoli;
        ResultSet hasilKodeSql = this.koneksiDatabase.getData(kodeSql);
        hasilKodeSql.next();
        String kodeSql2 = "SELECT a.NO_REKAMEDIK, b.ID_POLI, b.NAMAPOLI_07083"
                + "FROM NO_REKAMEDIK a "
                + "JOIN POLI_07083 b ON a.NO_REKAMEDIK = b.ID_POLI"
                + "WHERE b.ID_POLI = " + hasilKodeSql.getInt("ID_POLI");
        ResultSet hasilKodeSql2 = this.koneksiDatabase.getData(kodeSql2);
        hasilKodeSql2.next();
        return hasilKodeSql2.getString("NAMAPOLI_07083");
    }
}
