/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4.Enkapsulasi;


public class Kendaraan {
    // 1. Mengubah atribut menjadi Private agar terenkapsulasi
    String namaPemilik;
    String nomorPlat;

    
    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public void setNomorPlat(String nomorPlat) {
        this.nomorPlat = nomorPlat;
    }

    
    public String getNamaPemilik() {
        return namaPemilik;
    }

    public String getNomorPlat() {
        return nomorPlat;
    }
}
