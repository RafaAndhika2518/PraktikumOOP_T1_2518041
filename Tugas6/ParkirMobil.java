/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas6;


public class ParkirMobil extends Kendaraan {

    public ParkirMobil(String nama, String plat, String merk) {
        setNamaPemilik(nama);
        setNomorPlat(plat);
        setMerk(merk);
    }

    @Override
    public int hitungBiaya(int lamaParkir) {
        return lamaParkir * 5000;
    }

    @Override
    public int hitungBiaya(int lamaParkir, int denda) {
        return (lamaParkir * 5000) + denda;
    }
}
