/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet9Tugas2;

/**
 *
 * @author CLAURIA
 */
public class MainProject {
    public static void main(String[] args) {
        Manusia mns = new Manusia();
        Manusia mhs = new Mahasiswa();
        Manusia dsn = new Dosen();
        Mahasiswa mhs1 = new Mahasiswa();
        Dosen dsn1 = new Dosen();
    
        mns.bernafas();
        mns.makan();
        mhs.makan();
        mhs1.tidur();
        dsn.makan();
        dsn1.lembur();
    }
    
}
