/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

public class Dokter {
    private int iddokter;
    private String namadokter;
    private String spesialis;
    private Date ttl;
    private String jeniskelamin;
    
    public void setId_Dokter(int iddokter){
        this.iddokter = iddokter;
    }
    public int getId_Dokter(){
        return iddokter;
    }
    public void setNama_Dokter(String namadokter){
        this.namadokter = namadokter;
}
    public String getNama_Dokter(){
        return namadokter;
    }
    public void setSpesialis(String spesialis){
        this.spesialis = spesialis;
    }
    public String getSpesialis(){
        return spesialis;
    }
    public void setTtl(Date ttl){
        this.ttl = ttl;
    }
    public Date getTtl(){
        return ttl;
    }
    public void setJenis_Kelamin(String jeniskelamin){
        this.jeniskelamin = jeniskelamin;
    }
    public String getJenis_Kelamin(){
        return jeniskelamin;
    }
}
