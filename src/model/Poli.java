/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class Poli {
   private int idpoli;
   private int iddokter;
   private String namadokter;
   private String namapoli;
   private String keterangan;
   
   public void setNama_Dokter(String namadokter) {
       this.namadokter = namadokter;
   }
   public String getNama_Dokter(){
       return namadokter;
   }
    public void setId_Poli(int idpoli){
        this.idpoli = idpoli;
    }
    public int getId_Poli(){
        return idpoli;
    }
    public void setId_Dokter(int iddokter){
        this.iddokter = iddokter;
    }
    public int getId_Dokter(){
        return iddokter;
    }
    public void setNama_Poli(String namapoli){
        this.namapoli = namapoli;
    }
    public String getNama_Poli(){
        return namapoli;
    }
    public void setKeterangan_Poli(String keterangan){
        this.keterangan = keterangan;
    }
    public String getKeterangan_Poli(){
        return keterangan;
    }
}
