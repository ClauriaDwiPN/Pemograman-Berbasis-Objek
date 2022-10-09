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
public class Peminjam {
    private String nama;
    private Buku buku;
    private Kategori kategori;
    private int hari;
    
    public Peminjam(){
        
    }
    public void setNama(String nama){
       this.nama = nama; 
    }
    public String getNama(){
        return nama;
    }
    public void setBuku(Buku buku){
       this.buku = buku; 
    }
    public Buku getBuku(){
        return buku;
    }
    public void setKategori(Kategori kategori){
       this.kategori = kategori; 
    }
    public Kategori getKategori(){
        return kategori;
    }
    public void setHari(int hari){
       this.hari = hari; 
    }
    public int getHari(){
        return hari;
    }
    public String info(){
        String info = "";
        info += buku.info()+"\n";
        info += "Hari: "+hari+"\n";
        return info;
    }
}
