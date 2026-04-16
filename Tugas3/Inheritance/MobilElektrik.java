/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3.Inheritance;

public class MobilElektrik extends Kendaraan {

    public String merkMobil;
    public int lamaParkir;
    public int tarifPerJam = 8000;

    // Urutannya wajib: Nama Pemilik, Merk Mobil, Nomor Plat, Lama Parkir
public MobilElektrik(String namaPemilik, String merkMobil, String nomorPlat, int lamaParkir) {
    super(namaPemilik, nomorPlat); 
    this.merkMobil = merkMobil;
    this.lamaParkir = lamaParkir;
}

    public int hitungBiaya() {
        return lamaParkir * tarifPerJam;
    }

    public void cetakTiket() {
        System.out.println("INFORMASI TIKET PARKIR MOBIL LISTRIK");
        System.out.println("--------------------------------------");
        tampilData(); // Memanggil method dari Super Class
        System.out.println("Merk Mobil   : " + merkMobil);
        System.out.println("Lama Parkir  : " + lamaParkir + " jam");
        System.out.println("Total Biaya  : Rp " + hitungBiaya());
        System.out.println("--------------------------------------");
    }
}