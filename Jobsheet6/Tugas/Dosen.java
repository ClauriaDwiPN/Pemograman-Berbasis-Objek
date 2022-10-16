/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet6.Tugas;

/**
 *
 * @author CLAURIA
 */
public class Dosen extends Pegawai{
    public int jumlahSks = 0;
    public int tarifSks = 800000;
    
    public Dosen(String nip, String nama, String alamat){
        super(nip, nama, alamat);
    }
    
    public void setTarifSks(int sks){
        jumlahSks = sks;
    }
    public int getGaji(){
        gaji = super.getGaji() + (jumlahSks*tarifSks);
        return gaji;
    }
}
