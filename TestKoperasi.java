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
import java.util.Scanner;
public class TestKoperasi {
    public static void main(String[] args) {
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nama Anggota: " + donny.getNama());
        /*System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
        
        System.out.println("\nMeminjam uang 10.000.000...");
        donny.pinjam(10000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        
        System.out.println("\nMeminjam uang 4.000.000...");
        donny.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        
        System.out.println("\nMembayar angsuran 200.000...");
        donny.angsur(200000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        
        System.out.println("\nMembayar angsuran 3.000.000...");
        donny.angsur(3000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        */
        
        //Tugas 6
        int angka;
        String pilih;
        do{
            do{
                System.out.println("++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("Pilihan menu: ");
                System.out.println("1. Jumlah yang ingin dipinjam ");
                System.out.println("2. Angsuran yang ingin dibayar ");
                System.out.println("3. Keluar");
                System.out.println("------------------------------------------");
                
                System.out.print("Masukkan angka menu: ");
                angka = sc.nextInt();
                if(angka == 1){
                    System.out.print("Jumlah yang ingin dipinjam: ");
                    int pinjam = sc.nextInt();
                    donny.pinjam(pinjam);
                    System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
                }else if(angka == 2){
                    System.out.print("Jumlah angsuran: ");
                    int angsuran = sc.nextInt();
                    donny.angsur(angsuran);
                    System.out.println("Jumlah angsuran saat ini: " + donny.getJumlahPinjaman());
                }
                System.out.println("++++++++++++++++++++++++++++++++++++++++++");
                System.out.println("");
            }while(angka < 3);
            System.out.println("Apakah anda ingin memilih menu lain lagi? Y/T: ");
            pilih = sc.next();
        }while(pilih.equalsIgnoreCase("Y"));
    }
}
