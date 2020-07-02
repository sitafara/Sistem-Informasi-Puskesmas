/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

public class Pasien {
    private int idpasien;
    private String namapasien;
    private String alamatpasien;
    private String umurpasien;
    private String notlpnpasien;
    private String genderpasien;
    private Date ttlpasien;
   

    public void setId_Pasien(int idpasien){
        this.idpasien= idpasien;
    }
    public int getId_Pasien(){
        return idpasien;
    }
    public void setNama_Pasien(String namapasien){
        this.namapasien = namapasien;
    }
    public String getNama_Pasien(){
        return namapasien;
    }
    public void setAlamat_Pasien(String alamatpasien){
        this.alamatpasien = alamatpasien;
    }
    public String getAlamat_Pasien(){
        return alamatpasien;
    }
    public void setUmur_Pasien(String umurpasien){
        this.umurpasien = umurpasien;
    }
    public String getUmur_Pasien(){
        return umurpasien;
    }
    public void setNo_Tlpn_Pasien(String notlpnpasien){
        this.notlpnpasien=notlpnpasien;
    }
    public String getNo_Tlpn_Pasien(){
        return notlpnpasien;
    }
    public void setGender_Pasien(String genderpasien){
        this.genderpasien=genderpasien;
    }
    public String getGender_Pasien(){
        return genderpasien;
    }
    public void setTtl_Pasien(Date ttlpasien){
        this.ttlpasien=ttlpasien;
    }
    public Date getTtl_Pasien(){
        return ttlpasien;
    }

}
