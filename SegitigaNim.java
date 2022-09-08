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
public class SegitigaNim {
    public static void main(String args[]){
        int nim [] = {2,1,4,1,7,6,2,0,2,9};
        int a = 0;
        
        while(a<=9){
            int b = 0;
            while (b <= a){
                System.out.print (nim[a]);
                b++;
                
            }
            
            System.out.println();
            a++;
        }
}
}
