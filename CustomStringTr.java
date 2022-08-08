package com.sinav;

public class CustomStringTr {

    String kelime;

    public int uzunluk() {

        return kelime.length();
    }

    public boolean iceriyoMu(String aranacakKelime) {

        return kelime.contains(aranacakKelime);

    }
    public String karakterleriBuyut() {
        return kelime.toUpperCase();
    }

    public String karakterleriKucult() {
        return kelime.toLowerCase();
    }

    public char indeksdekiKarakter(int indisNo) {

        return kelime.charAt(indisNo);

    }

    public boolean ilemiBasliyor(String baslangıc) {

        return kelime.startsWith(baslangıc);

    }

    public boolean ilemiBitiyor(String bitis) {

        return kelime.endsWith(bitis);

    }

    public int IndeksNoBul(String aranacakKelime) {

        return kelime.indexOf(aranacakKelime);

    }

    public String bastakiSondakiBosluklarıSil() {

        return  kelime.trim();
    }

    public String degerDegiştirme(String eskideger, String yeniDeger) {
        return kelime.replace(eskideger, yeniDeger);

    }

    public String kelimeyiBolme(int baslanficIndex) {

       return kelime.substring(baslanficIndex);

    }

    public String  kelimeBolme(int baslangicIndis, int bitisIndis) {

        return kelime.substring(baslangicIndis, bitisIndis);

    }

    public boolean esitlikKontrol(String verilenKelime) {
        return kelime.equals(verilenKelime);
    }

    public String[] degereGoreKelimeBolme(String deger) {
        return kelime.split(deger);
    }

}