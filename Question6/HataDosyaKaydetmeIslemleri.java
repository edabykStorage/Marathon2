package com.sinav.Question6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class HataDosyaKaydetmeIslemleri {
    public static void main(String[] args) {
        try {
            int a=20;
            int b=0;
            System.out.println(a/b);
        }catch (Exception e){
            HataDosyaKaydetmeIslemleri hataDosyaKaydetmeIslemleri=new HataDosyaKaydetmeIslemleri();
            hataDosyaKaydetmeIslemleri.hataKaydet(e);
        }
    }


    public void hataKaydet(Exception e) {
        ObjectOutputStream write=null;
        try {
            FileOutputStream file = new FileOutputStream("hataDosyasi.txt",true);
           write = new ObjectOutputStream(file);
            write.writeObject(e);
            write.close();
        }catch (Exception b) {
            System.out.println("Dosya islerken hata olustu: "+ b.toString());
        }finally {
            try {
                write.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}

