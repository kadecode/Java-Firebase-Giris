package com.example.nesletabanli;

import java.util.Scanner;

public class Odevler {
    public static void main(String args[]){

        Scanner K = new Scanner(System.in);
        System.out.println("Sıcak degerini giriniz ");
        double sicak = K.nextDouble();
        OdevMain o = new OdevMain();
        o.sicaklikDonustur(sicak);





    }
}
