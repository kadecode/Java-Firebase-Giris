package com.example.yeniolan;

import java.util.Scanner;

public class HesabMakinesi {
public static void main(String args[]){
    Scanner konsol =new Scanner(System.in);

    System.out.println("Hesap seçiniz");
    System.out.println("(1) Toplama");
    System.out.println("(2) Çıkarma");
    System.out.println("(3) Çarpma");
    System.out.println("(4) Bölme");

    int tercih = konsol.nextInt();

    System.out.println("Birinci sayıyı girin");
    int s1 = konsol.nextInt();
    System.out.println("İkinci sayıyı girin");
    int s2 = konsol.nextInt();

    if(tercih == 1){
        System.out.println("Toplama :"+(s1+s2));
    }else if (tercih == 2){
        System.out.println("Çıkarma :"+(s1-s2));
    }else if (tercih == 3){
        System.out.println("Çarma :"+(s1*s2));
    }else if(tercih == 4){
        System.out.println("Bölme :"+(s1/s2));
    }










}





}
