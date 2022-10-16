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
public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int gaji;
    
    DaftarGaji(int gajiPegawai){
        this.listPegawai = new Pegawai[gajiPegawai];
    }
    
    public void addPegawai(Pegawai pegawai){
        for(int i = 0; i<listPegawai.length; i++){
            listPegawai[i] = pegawai;
        }
    }
    
    public void printSemuaGaji(){
        System.out.println("NIP\t| Nama\t\t| Gaji\t\t| Alamat\t\t");
        for(int i=1; i<listPegawai.length; i++){
            System.out.println(listPegawai[i].nip + "\t| " + listPegawai[i].getNama() + "\t| "
            + listPegawai[i].getGaji() + "\t| " + listPegawai[i].alamat);
        }
    }
}
