/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;

public abstract class Kendaraan {
    private String namaPemilik;
    private String nomorPlat;
    private String merk;

    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public void setNomorPlat(String nomorPlat) {
        this.nomorPlat = nomorPlat;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public String getNomorPlat() {
        return nomorPlat;
    }

    public String getMerk() {
        return merk;
    }

    // Abstract method
    public abstract int hitungBiaya(int lamaParkir);

    // Abstract method overloading dengan denda
    public abstract int hitungBiaya(int lamaParkir, int denda);
}