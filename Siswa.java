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
public class Siswa {
        //field
    String nama;
    String kelas;
    
    //method
    void belajar(){
        System.out.println("Siswa sedang belajar\n");
    }
    
    void kerjaTugas(){
        System.out.println("Siswa sedang kerja tugas\n");
    }
    
    void printStates(){
        System.out.println("Object siswa");
        System.out.println("Nama: " + nama);
        System.out.println("Kelas: " + kelas);
    }
}
