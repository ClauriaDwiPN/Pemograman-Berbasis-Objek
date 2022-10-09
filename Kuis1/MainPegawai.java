/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis1;
import java.util.Scanner;
/**
 *
 * @author CLAURIA
 */
public class MainPegawai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pegawai kuis = new Pegawai();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        int angka;
        String pilih;
        do{
            do{
                System.out.println("Pilihan menu: ");
                System.out.println("1. Masukkan data pegawai ");
                System.out.println("2. Cetak penghasilan ");
                System.out.println("3. Keluar");
                System.out.println("========================");
                
                System.out.print("Masukkan angka menu: ");
                angka = sc.nextInt();
                if(angka == 1){
                    System.out.println("========================");
                    System.out.print("Nama Pegawai : " );
                    String nama = sc.next();
                    kuis.setNama(nama);
                    System.out.print("NIP : " );
                    String nip = sc.next();
                    kuis.setNip(nip);
                    System.out.print("Jam Kerja : " );
                    int jumlahJamKerja = sc.nextInt();
                    kuis.setJumlahJamKerja(jumlahJamKerja);
                }else if(angka == 2){
                    System.out.println("========================");
                    System.out.println("Gaji Pokok : " + kuis.getGajiPokok());
                    System.out.println("Uang Lembur : " + kuis.getLembur());
                    System.out.println("Uang Makan : " + kuis.getUangMakan());
                    System.out.println("Uang Transport : " + kuis.getTransport());
                    System.out.println("Total Gaji keseluruhan : " + kuis.getTotal());
                }
                System.out.println("-------------------------------");
            }while(angka < 3);
            System.out.println("Apakah anda ingin memilih menu lain lagi? Y/T: ");
            pilih = sc.next();
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        }while(pilih.equalsIgnoreCase("Y"));
    }
}
