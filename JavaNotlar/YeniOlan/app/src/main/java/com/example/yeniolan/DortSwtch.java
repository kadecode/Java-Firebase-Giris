package com.example.yeniolan;

import java.util.Scanner;

public class DortSwtch {
    public static void main(String args[]){
        Scanner konsol = new Scanner(System.in);




        System.out.println("İşlem seçiniz");
        System.out.println("(1) Toplama :");
        System.out.println("(2) Çıkarma :");
        System.out.println("(3) Çarpma  :");
        System.out.println("(4) Bölme   :");

        int tercih = konsol.nextInt();

        System.out.println("Birinci sayıyı giriniz :");
        int s1 = konsol.nextInt();
        System.out.println("İkinci sayısı giriniz :");
        int s2 = konsol.nextInt();

        switch (tercih){
            case 1:
                System.out.println("Toplama "+(s1+s2));
                break;
            case 2:
                System.out.println("Çıkarma "+(s1-s2));
                break;
            case 3:
                System.out.println("Çarpma "+(s1*s2));
                break;
            case 4:
                System.out.println("Bölme "+(s1/s2));
                break;
            default:
                System.out.println("Böyle bir işlem yok!");
                break;

        }






    }
}
