package com.sinav.kitapkiralamasistemi;

import java.util.List;

public interface IKiralama {
    public boolean kiralamaYap(Musteri musteri,Kitap kitap,int kacGunluguneKiralamaYapildi);
    public boolean kitapAra(Kitap kitap);
    public boolean müsteriAra(Musteri musteri);
    public List<Kitap> kiralananKitapListesi();
}
