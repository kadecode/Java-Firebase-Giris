package com.example.collestionscalismasi;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Odev3 {
    public static void main(String args[]){

        Scanner k  = new Scanner(System.in);

        Random uret = new Random(101);
        int sayi = uret.nextInt();

        System.out.print("Üretilen sayı : "+sayi);

        ArrayList<Integer> tahminler = new ArrayList<>();
        for(int i = 0 ;i<5 ;i++){
            System.out.print((i+1)+". tahminizi giriniz)");
            int tahmin = k.nextInt();

            tahminler.add(tahmin);
            if(tahmin == sayi){
               System.out.println("tebrikler kazandınız");
            }
            if(tahmin <sayi){
               System.out.print("Biraz büyük sayı girin");
            }
            if(tahmin<sayi){
               System.out.print("Tahmini yükselt");
            }

        System.out.println("tahmin edilen sayılar "+ tahminler);


        }



    }




}