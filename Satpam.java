/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 

package Tugas1;

/**
 *
 * @author Asus
 */
public class Satpam {
    String nama;
    int usia;
    
    void ronda(){
        System.out.println("Satpam sedang meronda\n");
    }
    
    void istirahat(){
        System.out.println("Satpam sedang istirahat\n");
    }
    
    void printStates(){
        System.out.println("Object satpam");
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia + " tahun");
    }
}
