package com.sinav;

import java.util.Scanner;

public class Aritmatik {
    Scanner sc = new Scanner(System.in);
    int kenarSayisi;
    int secilenIslem;

    /* Çokgenlerde alan hesabı yapıp sonucu int olarak dönen method.
    Gecersiz bir kenar sayısı girildiğinde -1 döner.
     */
    public double alanHesabı() {
        kenarSayisiSorma();
        double alan = -1;
        if (kenarSayisi == 4) {
            System.out.println("Dortgenin 1. kenari: ");
            int kenar1 = sc.nextInt();
            System.out.println("Dortgenin 2. kenari: ");
            int kenar2 = sc.nextInt();
            alan = kenar1 * kenar2;
        } else if (kenarSayisi == 3) {
            System.out.println("Ucgenin yuksekligi: ");
            int height = sc.nextInt();
            System.out.println("Yuksekligin dik indigi kenarin uzunlugu: ");
            int kenar1 = sc.nextInt();
            alan = (kenar1 * height) / 2;
        } else if (kenarSayisi > 4) {
            System.out.println("Cokgenin bir kenarinin uzunlugu: ");
            int kenar1 = sc.nextInt();
            alan = ((kenarSayisi * kenar1 * kenar1) / 4) * (Math.cos(3.14 / kenarSayisi) / Math.sin(3.14 / kenarSayisi));
        }

        return alan;
    }

    private int kenarSayisiSorma() {
        System.out.println("Cokgeninizin kac kenari oldugunu giriniz");
        kenarSayisi = sc.nextInt();
        return kenarSayisi;
    }


    public int dortIslem() {
        int islem = islemSorma();
        System.out.println("Kac adet sayi ile islem yapacaksiniz: ");
        int sayi = sc.nextInt();
        int result = 0;
        int[] sayilar = new int[sayi];
        for (int i = 0; i < sayi; i++) {
            System.out.println((i + 1) + ". sayiyi giriniz: ");
            sayilar[i] = sc.nextInt();
        }

        switch (islem) {
            case 1:
                result = toplam(sayilar);
                break;
            case 2:
                result = cikar(sayilar);
                break;
            case 3:
                result = carp(sayilar);
                break;
            case 4:
                result = bol(sayilar);
                break;
        }


        return result;
    }

    private int islemSorma() {
        System.out.println("Bir islem seciniz:");
        System.out.println("1- Toplama ");
        System.out.println("2- Cikarma ");
        System.out.println("3- Carpma ");
        System.out.println("4- Bolme ");
        secilenIslem = sc.nextInt();
        return secilenIslem;
    }

    private static int toplam(int... sayilar) {
        int result = 0;
        for (int i = 0; i < sayilar.length; i++) {
            result += sayilar[i];
        }
        return result;
    }

    private static int cikar(int... sayilar) {
        int result = sayilar[0];
        for (int i = 1; i < sayilar.length; i++) {
            result -= sayilar[i];
        }
        return result;
    }

    private static int carp(int... sayilar) {
        int result = 1;
        for (int i = 0; i < sayilar.length; i++) {
            result *= sayilar[i];
        }
        return result;
    }

    private static int bol(int... sayilar) {
        int result = sayilar[0];
        for (int i = 1; i < sayilar.length; i++) {
            result /= sayilar[i];
        }
        return result;
    }

}





