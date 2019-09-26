/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118085.latihan5;

/**
 * @author 
 * NAMA                 : RISKY IRFRANSYAH
 * KELAS                : IF-2
 * NIM                  : 10118085
 * DESKRIPSI PROGRAM    : Kambing global
 * @author RISKY
 */
public class KambingGlobal {
    
    //variabel jumlahkambing menjadi variabel instance
    
    int jumlahKambing = 88;
    
    //method untuk menampilkan jumlah kambing
    public void getJumlahKambing() {
        System.out.println("Jumlah kambing: " + jumlahKambing);
    }
    
    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
    }


    public static void main(String[] args) {
        KambingGlobal kambingSusu = new KambingGlobal();
        
        // menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        // menambah satu kambing
        kambingSusu.tambahKambing();
        
        // menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
        
    }
    
}
