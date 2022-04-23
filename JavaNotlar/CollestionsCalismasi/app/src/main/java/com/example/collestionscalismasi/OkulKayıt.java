package com.example.collestionscalismasi;

import java.util.ArrayList;
import java.util.Scanner;

public class OkulKayıt {
    public static void main(String args[]){
        Scanner k = new Scanner(System.in);

        ArrayList<Ogrenciler> yeniOgr = new ArrayList<>();


        while (true){
            System.out.println("Ögremcinin Okul no giriniz");
            int no = k.nextInt();
            System.out.println("Ögrencinin ismini giriniz");
            String isim = k.next();

            Ogrenciler yKayıt = new Ogrenciler();
            yeniOgr.add(yKayıt);

            System.out.println("Çıkış 1 -Devam diğer sayılar");
            int secim = k.nextInt();

            if(secim == 1){
                for(Ogrenciler o : yeniOgr){
                System.out.print("Okul no : "+o.getOkulNo());
                System.out.print("İsim    : "+o.getIsim());
                System.out.print("-------------------");

                }

                break;
            }

        }




    }
}
