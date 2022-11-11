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
public class Segitiga {
    private int sudut;
    private int keliling;
    
    public int totalSudut(int sudutA){
        return sudut = 180 - sudutA;
    }
    public int totalSudut(int sudutA, int sudutB){
        return sudut = 180 - (sudutA + sudutB);
    }
    public int keliling(int sisiA, int sisiB, int sisiC){
        return keliling = sisiA + sisiB + sisiC;
    }
    public double keliling(int sisiA, int sisiB){
        double c = Math.sqrt(Math.pow(((double)sisiA),2)
                 +Math.pow(((double)sisiB),2));
    return sisiA+sisiB+c;
    }
}
