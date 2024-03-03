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
public class Dosen {
    String nama;
    int usia;
    
    void mengajar(){
        System.out.println("Dosen sedang mengajar\n");
    }
    
    void istirahat(){
        System.out.println("Dosen sedang istirahat\n");
    }
    
    void printStates(){
        System.out.println("Object dosen");
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia + " tahun");
    }
}
