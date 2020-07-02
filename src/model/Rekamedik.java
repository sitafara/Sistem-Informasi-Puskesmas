/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

public class Rekamedik {
    private int norekamedik;
    private int idpasien;
    private int idpoli;
    private String keluhan;
    private String beratbadan;
    private String suhutubuh;
    private String tinggibadan;
    private String tekanandarah;
    private Date tanggalkedatangan;
    
    
    public void setNo_Rekamedik(int norekamedik){
        this.norekamedik=norekamedik;
    }
    public int getNo_Rekamedik(){
        return norekamedik;
    }
    public void setId_Pasien(int idpasien){
        this.idpasien=idpasien;
    }
    public int getId_Pasien(){
        return idpasien;
    }
    public void setId_Poli(int idpoli){
        this.idpoli=idpoli;
    }
    public int getId_Poli(){
        return idpoli;
    }
    public void setBerat_Badan(String beratbadan){
        this.beratbadan = beratbadan;
    }
    public String getBerat_Badan(){
        return beratbadan;
    }
    public void setSuhu_Tubuh(String suhutubuh){
        this.suhutubuh = suhutubuh;
    }
    public String getSuhu_Tubuh(){
        return suhutubuh;
    }
    public void setKeluhan(String keluhan){
        this.keluhan = keluhan;
    }
    public String getKeluhan(){
        return keluhan;
    }
    public void setTinggi_Badan(String tinggibadan){
        this.tinggibadan = tinggibadan;
    }
    public String getTinggi_Badann(){
        return tinggibadan;
    }
    public void setTanggal_Kedatangan(Date tanggalkedatangan){
        this.tanggalkedatangan = tanggalkedatangan;
    }
    public Date getTanggal_Kedatangan(){
        return tanggalkedatangan;
    }
    public void setTekanan_Darah(String tekanandarah){
        this.tekanandarah = tekanandarah;
    }
    public String getTekanan_Darah(){
        return tekanandarah;
    }
}
