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
public class Mahasiswa {
    //field
    String nama;
    String nim;
    
    //method
    void belajar(){
        System.out.println("Mahasiswa sedang belajar\n");
    }
    
    void kerjaTugas(){
        System.out.println("Mahasiswa sedang kerja tugas\n");
    }
    
    void printStates(){
        System.out.println("Object mahasiswa");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}
