package Tugas9;

import Tugas8.*;
import Tugas7.*;
import Tugas6.*;

public class MobilElektrik extends Kendaraan implements BiayaParkir, DendaParkir, StatusParkir {

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

    @Override
    public String tampilStatus() {
        return "Mobil listrik mendapatkan akses parkir khusus dan bebas denda zona listrik.";
    }
}