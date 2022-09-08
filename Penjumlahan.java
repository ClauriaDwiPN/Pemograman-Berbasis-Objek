/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan2;

/**
 *
 * @author CLAURIA
 */
public class Penjumlahan {
    public static void main(String[] args) {
        int nim [] = {2,1,4,1,7,6,2,0,2,9};
        int jum = 0;
        for(int i=0; i<nim.length; i++){
            jum += nim[i];
        }
        System.out.println("Total : " + jum);
    }
}
