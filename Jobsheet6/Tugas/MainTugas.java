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
public class MainTugas {
    public static void main(String[] args) {
        Dosen dsn1 = new Dosen("123456", "Clauria", "Probolinggo");
        dsn1.setTarifSks(22);
        Dosen dsn2 = new Dosen("456789", "M.Sidqi", "Lombok");
        dsn2.setTarifSks(25);
        DaftarGaji gj = new DaftarGaji(2);
        gj.addPegawai(dsn1);
        gj.printSemuaGaji();
        System.out.println("=======================================================");
        gj.addPegawai(dsn2);
        gj.printSemuaGaji();
    }
}
