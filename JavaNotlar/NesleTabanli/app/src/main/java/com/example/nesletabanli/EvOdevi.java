package com.example.nesletabanli;

import java.util.Scanner;

public class EvOdevi {
    public static void main(String args[]){
        Scanner k = new Scanner(System.in);
        System.out.println("Kısa kenarı giriniz :");
        int kısaK = k.nextInt();
        System.out.println("Uzun kenarı giriniz :");
        int uzunK = k.nextInt();

        System.out.println("Dildörtgem Alanı :"+(kısaK*uzunK));
    }
}
