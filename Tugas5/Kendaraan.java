/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas5;

public class Kendaraan {
    private String namaPemilik;
    private String nomorPlat;
    private String merk; // Tambahan atribut merk

    public void setNamaPemilik(String namaPemilik) { this.namaPemilik = namaPemilik; }
    public void setNomorPlat(String nomorPlat) { this.nomorPlat = nomorPlat; }
    public void setMerk(String merk) { this.merk = merk; }

    public String getNamaPemilik() { return namaPemilik; }
    public String getNomorPlat() { return nomorPlat; }
    public String getMerk() { return merk; }

    // Method dasar (Override)
    public int hitungBiaya(int lamaParkir) {
        return 0;
    }

    // Method Overloading (Dengan Denda)
    public int hitungBiaya(int lamaParkir, int denda) {
        return 0;
    }
}