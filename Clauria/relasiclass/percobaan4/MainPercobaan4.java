/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clauria.relasiclass.percobaan4;

/**
 *
 * @author CLAURIA
 */
public class MainPercobaan4 {
    public static void main(String[] args) {
        /*Penumpang p = new Penumpang("12345", "Mr. Krab");
        Gerbong gerbong = new Gerbong("A", 10);
        gerbong.setPenumpang(p, 1);
        System.out.println(gerbong.info());*/
        
        Penumpang budi = new Penumpang("12347", "Budi");
        Gerbong gerbong = new Gerbong ("A", 10);
        gerbong.setPenumpang(budi, 1);
        System.out.println(gerbong.info());
    }
}






