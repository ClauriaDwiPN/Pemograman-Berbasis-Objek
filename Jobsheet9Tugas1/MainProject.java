/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet9Tugas1;

/**
 *
 * @author CLAURIA
 */
public class MainProject {
    public static void main(String[] args) {
        Segitiga clauria = new Segitiga();
        
        System.out.println("Total sudut :" + clauria.totalSudut(5));
        System.out.println("Total sudut :" + clauria.totalSudut(6, 8));
        System.out.println("Keliling :" + clauria.keliling(7, 4, 6));
        System.out.println("Keliling :" + clauria.keliling(6, 6));
        
    }
}
