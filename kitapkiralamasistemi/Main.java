package com.sinav.kitapkiralamasistemi;

import com.sinav.Question5.Question5;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Kitap kitap = new Kitap("xx", "yy");
        Kitap kitap2 = new Kitap("aa", "bb");
        Kitap kitap3 = new Kitap("cc", "ss");
        Musteri musteri = new Musteri("Eda", "Biyik");
        Musteri musteri2 = new Musteri("ahmEdkdld", "Biyik");
        Musteri musteri3 = new Musteri("AhmOguz", "Biyik");
        KiralamaImpl iKiralama = new KiralamaImpl(new ArrayList<>(Arrays.asList(kitap,kitap2,kitap3)), Arrays.asList(musteri,musteri2,musteri3));
        Kitap kitap4 = new Kitap("dsss", "aaaa");


        System.out.println(iKiralama.kiralamaYap(musteri,kitap2,20));
        System.out.println(iKiralama.kiralamaYap(musteri,kitap,20));

        System.out.println(iKiralama.kitapAra(kitap2));
        System.out.println(iKiralama.kiralananKitapListesi());

        System.out.println(iKiralama.getMüsteriKitapMap());
        Question5 question5 = new Question5(iKiralama);
        question5.idVerilenKitabiKimKiralamis(kitap.getKitapId());
        System.out.println("-----------------------------");
        question5.müsterininKiraladigiKitaplariMusteriIdIleSorgulama(musteri.getKisiId()).forEach(System.out::println);
    }
}
