/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author CLAURIA
 */
public class EncapDemo {
    private String name;
    private int age;
    
    public String getName(){
        return name;
    }
    
    public void setName(String newName){
        name = newName;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int newAge){
        if(newAge > 30){
            System.out.println("Umur maksimal 30 dan umur yang anda masukkan " + newAge);
        }
        else if (newAge < 18){
            System.out.println("Umur minimal 18 dan umur yang anda masukkan " + newAge);
        }
    }
}
