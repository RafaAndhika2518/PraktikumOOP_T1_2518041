/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author leorl
 */
public class MobilElektrik {


    String namaPemilik;
    String merkMobil;
    String nomorPlat;
    int lamaParkir;
    int tarifPerJam = 8000;

   
    public MobilElektrik(String namaPemilik, String merkMobil, String nomorPlat, int lamaParkir) {
        this.namaPemilik = namaPemilik;
        this.merkMobil = merkMobil;
        this.nomorPlat = nomorPlat;
        this.lamaParkir = lamaParkir;
    }

    int hitungBiaya() {
        return lamaParkir * tarifPerJam;
    }

    void cetakTiket() {
        System.out.println("INFORMASI TIKET PARKIR MOBIL LISTRIK ANDA");
        System.out.println("Data Nama Pemilik      : " + namaPemilik);
        System.out.println("Merk Mobil Anda        : " + merkMobil);
        System.out.println("Nomor Plat Mobil Anda  : " + nomorPlat);
        System.out.println("Lama Parkir Mobil Anda : " + lamaParkir + " jam");
        System.out.println("Total Biaya Parkir     : Rp " + hitungBiaya());
        System.out.println("======================================");
    }
}
