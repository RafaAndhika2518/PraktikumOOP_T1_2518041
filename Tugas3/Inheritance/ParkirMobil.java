/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3.Inheritance;

/**
 *
 * @author leorl
 */


public class ParkirMobil extends Kendaraan{

    public static void main(String[] args) {
        
        // Pembuatan objek disesuaikan dengan urutan parameter constructor yang baru
        MobilElektrik mobil1 = new MobilElektrik(
            "Rafa Andhika Sevtariano Iskandar", // Nama Pemilik
            "BYD",                              // Merk Mobil
            "N 9784 KDW",                       // Nomor Plat
            2                                   // Lama Parkir (jam)
        );

        // Memanggil method untuk menampilkan hasil di layar console
        mobil1.cetakTiket();
    }
}