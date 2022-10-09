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
public class Kategori {
    private String kategori;
    private String judulBuku;
    
    public Kategori(){
        
    }
    public void setKategori(String kategori){
        this.kategori = kategori;
    }
    public String getKategori(){
        return kategori;
    }
    public void setJudulBuku(String judulBuku){
        this.judulBuku = judulBuku;
    }
    public String getJudulBuku(){
        return judulBuku;
    }
    public String info(){
        String info = "";
        info +="Kategori: "+kategori+"\n";
        info +="Judul Buku: "+judulBuku+"\n";
        return info;
    }
}
