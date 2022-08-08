package com.sinav.Question5;

import com.sinav.kitapkiralamasistemi.KiralamaImpl;
import com.sinav.kitapkiralamasistemi.Kitap;
import com.sinav.kitapkiralamasistemi.Musteri;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Question5 {
    KiralamaImpl iKiralama;
    public Question5(KiralamaImpl iKiralama) {
        this.iKiralama = iKiralama;
    }

    public List<Musteri> ahmIleBaslayanMusteriler(List<Musteri> müsteriListesi) {
        List<Musteri> arananKelimeileBaslayanlar = müsteriListesi.stream().filter(musteri -> musteri.getKisiAd().toLowerCase().startsWith("ahm"))
                .collect(Collectors.toList());
        return arananKelimeileBaslayanlar;
    }

    public List<Kitap> müsterininKiraladigiKitaplariMusteriIdIleSorgulama(String musteriId) {
        Map<Musteri, List<Kitap>> müsteriKitapMap = iKiralama.getMüsteriKitapMap();
        Map<Musteri, List<Kitap>> musterim = müsteriKitapMap.entrySet().stream().filter(musteri -> musteri.getKey().getKisiId().equals(musteriId)).collect(Collectors.toMap(entry -> entry.getKey(),
                Map.Entry::getValue));
        List<Kitap> result = musterim.values().stream().collect(Collectors.toList()).get(0);
        return result;
    }

    public Musteri idVerilenKitabiKimKiralamis(String kitapid) {
        Map<Musteri, List<Kitap>> müsteriKitapMap = iKiralama.getMüsteriKitapMap();
        Optional<Musteri> musteri = müsteriKitapMap.entrySet().stream().filter(e -> {
                    Kitap kitap1 = e.getValue().stream().filter(kitap -> kitap.getKitapId().equals(kitapid)).findFirst().get();
                    return kitap1 != null ? true : false;
                })
                .map(e -> e.getKey()).findFirst();

        return musteri.get();
    }

    public Musteri adiVerilenKitabiKimKiralamis(String kitapAd) {
        Map<Musteri, List<Kitap>> müsteriKitapMap = iKiralama.getMüsteriKitapMap();
        Optional<Musteri> musteri = müsteriKitapMap.entrySet().stream().filter(e -> {
                    Kitap kitap1 = e.getValue().stream().filter(kitap -> kitap.getKitapAdi().equals(kitap)).findFirst().get();
                    return kitap1 != null ? true : false;
                })
                .map(e -> e.getKey()).findFirst();

        return musteri.get();
    }

}
