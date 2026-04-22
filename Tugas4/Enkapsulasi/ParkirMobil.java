/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4.Enkapsulasi;

/**
 *
 * @author leorl
 */


public class ParkirMobil extends Kendaraan{

    public static void main(String[] args) {
        
        // Pembuatan objek disesuaikan dengan urutan parameter constructor yang baru
        MobilElektrik mobil1 = new MobilElektrik(
            "Rafa Andhika Sevtariano Iskandar", 
            "BYD",                              
            "N 9784 KDW",                       
            2                                   
        );

        
        mobil1.cetakTiket();
    }
}