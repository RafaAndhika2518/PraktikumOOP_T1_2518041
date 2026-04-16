/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3.Inheritance;

public class Kendaraan {
    
    public String namaPemilik;
    public String nomorPlat;

    // 1. Constructor Kosong (Wajib ada agar GUI_Kendaraan tidak error)
    public Kendaraan() {
    }

    // 2. Constructor Berparameter (Agar bisa dipanggil oleh super(...) di Sub Class)
    public Kendaraan(String namaPemilik, String nomorPlat) {
        this.namaPemilik = namaPemilik;
        this.nomorPlat = nomorPlat;
    }

    // 3. Method tampilData (Agar bisa dipanggil di Sub Class)
    public void tampilData() {
        System.out.println("Nama Pemilik : " + namaPemilik);
        System.out.println("Nomor Plat   : " + nomorPlat);
    }
}