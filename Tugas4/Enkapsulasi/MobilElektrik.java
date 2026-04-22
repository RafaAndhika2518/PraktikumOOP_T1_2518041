package Tugas4.Enkapsulasi;

public class MobilElektrik extends Kendaraan {
    // Variabel private (Enkapsulasi)
    private String merkMobil;
    private int lamaParkir;
    
    // CONSTRUCTOR (Pastikan tulisan 'throw new...' sudah hilang di sini)
    public MobilElektrik(String nama, String merk, String plat, int lama) {
        // Mengirim data ke class induk (Kendaraan) menggunakan Setter
        super.setNamaPemilik(nama);
        super.setNomorPlat(plat);
        
        // Memasukkan data ke variabel class ini sendiri
        this.merkMobil = merk;
        this.lamaParkir = lama;
    }

    // GETTER
    public String getMerkMobil() {
        return merkMobil;
    }

    public int getLamaParkir() {
        return lamaParkir;
    }

    // METHOD HITUNG BIAYA
    // Pastikan namanya sesuai dengan yang dipanggil di GUI (hitungBiaya atau hitungTotalBiaya)
    public int hitungBiaya() {
        int tarifElektrik = 5000;
        return this.lamaParkir * tarifElektrik;
    }

    String hitungTotalBiaya() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void cetakTiket() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}