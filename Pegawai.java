/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis1;

/**
 *
 * @author CLAURIA
 */
public class Pegawai {
    private String nama, nip;
    private double gajiPokok, lembur, uangMakan, transport, total;
    private int jumlahJamKerja;
    
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setNip(String nip){
        this.nip = nip;
    }
    public void setJumlahJamKerja(int jumlahJamKerja){
        this.jumlahJamKerja = jumlahJamKerja;
    }
    public void setGajiPokok(){
        gajiPokok = 2000 * jumlahJamKerja;
    }
    public double getGajiPokok(){
        gajiPokok = 2000 * jumlahJamKerja;
        return gajiPokok;
    }
    public double getLembur(){
        if(jumlahJamKerja > 7){
            lembur = (jumlahJamKerja - 7)*(1.5 * gajiPokok);
        } else {
            lembur = 0;
        }
        return lembur; 
    }
    public double getUangMakan(){
        if(jumlahJamKerja >= 8){
           uangMakan  = 3500;
        } else {
            uangMakan = 0;
        }
        return uangMakan; 
    }
    public double getTransport(){
        if(jumlahJamKerja >= 9){
           transport  = 4000;
        } else {
            transport = 0;
        }
        return transport; 
    }
    public double getTotal(){
        total = gajiPokok + lembur + uangMakan + transport;
        return total; 
    }
}
