package Tugas8;

import Tugas7.*;
import Tugas6.*;

public class MobilElektrik extends Kendaraan {

    public MobilElektrik(String nama, String plat, String merk) {
        setNamaPemilik(nama);
        setNomorPlat(plat);
        setMerk(merk);
    }

    @Override
    public int hitungBiaya(int lamaParkir) {
        return lamaParkir * 4000;
    }

    @Override
    public int hitungBiaya(int lamaParkir, int denda) {
        return (lamaParkir * 4000) + denda;
    }

    // Method khusus milik MobilElektrik
    public String infoMobilElektrik() {
        return "Mobil listrik mendapatkan akses parkir khusus dan bebas denda zona listrik.";
    }
}