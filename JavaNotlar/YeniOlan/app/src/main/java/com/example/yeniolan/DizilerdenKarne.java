package com.example.yeniolan;

import java.util.Scanner;

public class DizilerdenKarne {
    public static void main(String args[]){
        Scanner k = new Scanner(System.in);

        String dersler [] = new String [3];
        int notlar [] = new int[3];
        for(int i = 0;i<dersler.length;i++){
            System.out.println((i+1)+". Dersi giriniz");
            String ders = k.next();
            dersler[i] = ders ;

            System.out.println((i+1)+". Dersinin notlarını girin");
            int not = k.nextInt();

            notlar[i] = not ;
        }
        int toplam = 0;
        for( int e=0;e<notlar.length;e++){
            System.out.println(dersler[e]+":"+notlar[e]);
            toplam = toplam + notlar[e];
        }
         int ortalama = toplam / dersler.length;
        System.out.println("Ortalama :"+ ortalama);
        if (ortalama >=50){
            System.out.println("Tebrikler sınıfı geçtiniz");
        }else{
            System.out.println("Sınıfta kaldınız!");

        }







    }
}
