/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab1;

/**
 *
 * @author Rio PC
 */
public class MobilListrik {

    String namaPemilik;
    String merkMobil;
    String nomorPlat;
    int lamaParkir;
    int tarifPerJam = 8000; //Ini Harga Parkir Perjam kak :)

    int hitungBiaya() {
        //Ini Rumus Yang Dipakai Untuk Menghitung Biaya Parkir 
        return lamaParkir * tarifPerJam;
    }

    void cetakTiket() {
        //Ini Untuk Informasi Data Pemilik Mobil,Data Mobil Dan Biaya Parkir Berdasarkan Lama Parkir
        System.out.println("INFORMASI TIKET PARKIR MOBIL LISTRIK ANDA");
        System.out.println("Data Nama Pemilik      : " + namaPemilik);
        System.out.println("Merk Mobil Anda        : " + merkMobil);
        System.out.println("Nomor Plat Mobil Anda  : " + nomorPlat);
        System.out.println("Lama Parkir Mobil Anda : " + lamaParkir + " jam");
        System.out.println("Total Biaya Parkir     : Rp " + hitungBiaya());
        System.out.println("======================================");
    }
}
