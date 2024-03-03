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
public class Kucing {
    // state/field
    String jenis;
    String warna;
    int umur;
    
    // behavior/method
    void makan(){
        System.out.println("Kucing sedang makan ikan\n");
    }
    
    void lari(){
        System.out.println("Kucing sedang berlari\n");
    }
    
    void tidur(){
        System.out.println("Kucing sedang tidur\n");
    }
    
    void printStates(){
        System.out.println("Object kucing");
        System.out.println("Jenis: " + jenis);
        System.out.println("Warna: " + warna);
        System.out.println("umur: " + umur + " tahun");
    }
}
