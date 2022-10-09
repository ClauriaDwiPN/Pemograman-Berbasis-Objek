/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clauria.relasiclass.tugas;

/**
 *
 * @author CLAURIA
 */
public class Pegawai {
    private String nama;
    private Peminjam peminjam;
    
    public Pegawai(){
        
    }
    public void setNama(String nama){
        this.nama = nama;
    } 
    public String getNama(){
        return nama;
    }
    public void setPeminjam(Peminjam peminjam){
       this.peminjam = peminjam; 
    }
    public Peminjam getPeminjam(){
        return peminjam;
    }
    public String info(){
        String info = "";
        info += "Nama: "+nama+"\n";
        info += peminjam.info();
        return info;
    }
}
