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
public class MainTugas {
    public static void main(String[] args) {
        Buku b = new Buku("Matematika","Erlangga");
        
        Kategori k = new Kategori();
        k.setKategori("Pendidikan");
        
        Pegawai p = new Pegawai();
        p.setNama("Clauria");
        
        Peminjam pm = new Peminjam();
        pm.setNama("M.Sidqi");
        pm.setBuku(b);
        pm.setHari(5);
        
        System.out.println("=============PERPUSTAKAAN=============");
        System.out.println("Nama peminjam : " + pm.getNama());
        System.out.println(pm.info());
    
    }
}
