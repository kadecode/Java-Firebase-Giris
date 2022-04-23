package com.example.yeniolan;

import java.util.Scanner;

public class TekCifSonsuz {
    public static void main(String args[]){
        Scanner konsol = new Scanner(System.in);

        while(true){
            System.out.println("Bir sayı giriniz!");
            int sayi = konsol.nextInt();

            int sonuc = sayi % 2;

            switch (sonuc){
                case 0:
                    System.out.println("Sayı çift sayıdır");
                    break;
                case 1:
                    System.out.println("Sayı tek");
                    break;



            }

            System.out.println("Çıkış için (1) Devam için diğer sayılara basınız !");
            int secim = konsol.nextInt();
             if(secim == 1){
                 System.out.println("Çıkış Yapılıyor!!");

                 break;

             }
        }











    }
}
