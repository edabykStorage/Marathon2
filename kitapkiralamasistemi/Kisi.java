package com.sinav.kitapkiralamasistemi;

import java.util.Objects;
import java.util.UUID;

public class Kisi {
    private String kisiAd;
    private String kisiSoyAd;
    private String kisiId;

    public Kisi(String kisiAd, String kisiSoyAd) {
        this.kisiAd = kisiAd;
        this.kisiSoyAd = kisiSoyAd;
        this.kisiId = UUID.randomUUID().toString();
    }
    public String getKisiAd() {
        return kisiAd;
    }

    public void setKisiAd(String kisiAd) {
        this.kisiAd = kisiAd;
    }

    public String getKisiSoyAd() {
        return kisiSoyAd;
    }

    public void setKisiSoyAd(String kisiSoyAd) {
        this.kisiSoyAd = kisiSoyAd;
    }

    public String getKisiId() {
        return kisiId;
    }


    @Override
    public String toString() {
        return "Kisi{" +
                "kisiAd='" + kisiAd + '\'' +
                ", kisiSoyAd='" + kisiSoyAd + '\'' +
                ", kisiId='" + kisiId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kisi kisi = (Kisi) o;
        return Objects.equals(kisiAd, kisi.kisiAd) && Objects.equals(kisiSoyAd, kisi.kisiSoyAd) && Objects.equals(kisiId, kisi.kisiId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kisiAd, kisiSoyAd, kisiId);
    }
}
