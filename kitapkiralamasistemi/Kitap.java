package com.sinav.kitapkiralamasistemi;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Kitap {
    private String kitapAdi;
    private String kitapYazari;
    private String kitapId;

    public Kitap(String kitapAdi, String kitapYazari) {
        this.kitapAdi = kitapAdi;
        this.kitapYazari = kitapYazari;
        this.kitapId= UUID.randomUUID().toString();
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public String getKitapYazari() {
        return kitapYazari;
    }

    public void setKitapYazari(String kitapYazari) {
        this.kitapYazari = kitapYazari;
    }

    public String getKitapId() {
        return kitapId;
    }

    @Override
    public String toString() {
        return "Kitap{" +
                "kitapAdi='" + kitapAdi + '\'' +
                ", kitapYazari='" + kitapYazari + '\'' +
                ", kitapId='" + kitapId + '\'' +
                '}';
    }
}
