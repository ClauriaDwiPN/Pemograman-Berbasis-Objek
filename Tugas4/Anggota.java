/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4;

/**
 *
 * @author CLAURIA
 */
public class Anggota {
    private String ktp;
    private String nama;
    private int limit;
    private int jumlah;
    private int angsur;
    
    Anggota(String ktp, String nama, int limit){
        this.ktp = ktp;
        this.nama = nama;
        this.limit = limit;
        this.jumlah = jumlah;
    }
    public String getNama(){
        return nama;
    }
    
    public int getLimitPinjaman(){
        return limit;
    }
    
    public void pinjam(int jumlah){
        if(jumlah > limit){
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        }else{
            this.jumlah = jumlah;
        }
    }
    
    public int getJumlahPinjaman(){
        jumlah = jumlah - angsur;
        return jumlah;
    }
    
    public void angsur(int jumlahAngsur){
        if(jumlahAngsur > limit){
            System.out.println("Maaf, jumlah angsuran anda melebihi limit");
        }else if(jumlahAngsur < (limit * 0.1)){
            System.out.println("Maaf angsuran harus 10% dari jumlah pinjaman");
        }
        else {
            jumlah -= jumlahAngsur;
        }
    }
}
