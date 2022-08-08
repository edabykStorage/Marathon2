package com.sinav.kitapkiralamasistemi;

import java.util.*;

public class KiralamaImpl implements IKiralama {
    private List<Kitap> kitapListesi = new ArrayList<>();
    private List<Kitap> kiralananKitapListesi = new ArrayList<>();
    private List<Musteri> musteriListesi = new ArrayList<>();

    private Map<Musteri, List<Kitap>> müsteriKitapMap=new HashMap<>();

    public KiralamaImpl(List<Kitap> kitapListesi, List<Musteri> musteriListesi) {
        this.kitapListesi = kitapListesi;
        this.musteriListesi = musteriListesi;
    }

    @Override
    public boolean kiralamaYap(Musteri musteri, Kitap kitap, int kacGunluguneKiralamaYapildi) {
        boolean kiralamaYapildiMi = false;
        if (kitapAra(kitap) && müsteriAra(musteri)) {
            kiralamaYapildiMi = true;
            kiralananKitapListesi.add(kitap);
            kitapListesi.remove(kitap);
            if(müsteriKitapMap.get(musteri)==null){
                müsteriKitapMap.put(musteri,List.of(kitap));
            }else {
                List<Kitap> kitapList=  müsteriKitapMap.get(musteri);
                List tmp= new ArrayList();
                for (Kitap k:kitapList){
                    tmp.add(k);
                }
                tmp.add(kitap);
                müsteriKitapMap.put(musteri,tmp);
            }

        }
        return kiralamaYapildiMi;
    }

    @Override
    public boolean kitapAra(Kitap kitap) {
        boolean kitapVarMi = false;
        if (kitapListesi.contains(kitap)) {
            kitapVarMi = true;
        }
        return kitapVarMi;
    }

    @Override
    public boolean müsteriAra(Musteri musteri) {
        boolean musteriVarMi = false;
        if (musteriListesi.contains(musteri)) {
            musteriVarMi = true;
        }
        return musteriVarMi;
    }

    @Override
    public List<Kitap> kiralananKitapListesi() {
        return kiralananKitapListesi;
    }

    public List<Kitap> getKitapListesi() {
        return kitapListesi;
    }

    public void setKitapListesi(List<Kitap> kitapListesi) {
        this.kitapListesi = kitapListesi;
    }

    public List<Kitap> getKiralananKitapListesi() {
        return kiralananKitapListesi;
    }

    public void setKiralananKitapListesi(List<Kitap> kiralananKitapListesi) {
        this.kiralananKitapListesi = kiralananKitapListesi;
    }

    public List<Musteri> getMusteriListesi() {
        return musteriListesi;
    }

    public void setMusteriListesi(List<Musteri> musteriListesi) {
        this.musteriListesi = musteriListesi;
    }

    public Map<Musteri, List<Kitap>> getMüsteriKitapMap() {
        return müsteriKitapMap;
    }

    public void setMüsteriKitapMap(Map<Musteri, List<Kitap>> müsteriKitapMap) {
        this.müsteriKitapMap = müsteriKitapMap;
    }
}
