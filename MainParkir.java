/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab1;

/**
 *
 * @author Rio PC
 */
public class MainParkir {

    public static void main(String[] args) {

        MobilListrik mobil1 = new MobilListrik();
        //Ini Informasi Dari Pemilik,Kendaraan,Dan Biaya
        mobil1.namaPemilik = "Rafa Andhika Sevtariano Iskandar";
        mobil1.merkMobil = "BYD";
        mobil1.nomorPlat = "N 9784 KDW";
        mobil1.lamaParkir = 2;

        mobil1.cetakTiket();
    }
}
