/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clauria.relasiclass.percobaan4;

/**
 *
 * @author CLAURIA
 */
public class Penumpang {
    private String nama;
    private String ktp;
    
    Penumpang(String nama, String ktp){
        this.ktp = ktp;
        this.nama = nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setKtp(String ktp){
        this.ktp = ktp;
    }
    public String getKtp(){
        return ktp;
    }
    public String info() {
        String info = "";
        info += "Ktp: " + ktp + "\n";
        info += "Nama: " + nama + "\n";
        return info;
    }

}
