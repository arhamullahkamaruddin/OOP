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
public class Guru {
    String nama;
    int usia;
    
    void mengajar(){
        System.out.println("Guru sedang mengajar\n");
    }
    
    void istirahat(){
        System.out.println("Guru sedang istirahat\n");
    }
    
    void printStates(){
        System.out.println("Object guru");
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia + " tahun");
    }
}
