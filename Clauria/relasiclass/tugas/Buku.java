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
public class Buku {
    private String judul;
    private String penerbit;
    
    public Buku(String judul, String penerbit){
        this.judul = judul;
        this.penerbit = penerbit;
    }
    public void setJudul(String Judul){
        this.judul = judul;
    }
    public String getJudul(){
        return judul;
    }
    public void setPenerbit(String Penerbit){
        this.penerbit = penerbit;
    }
    public String getPenerbit(){
        return penerbit;
    }
    public String info(){
        String info = "";
        info += "Judul: "+judul+"\n";
        info += "Penerbit: "+penerbit;
        return info;
    }
}
