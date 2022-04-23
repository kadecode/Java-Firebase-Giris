package com.example.nesletabanli;

public class  Islemler {
    public double ortalamaHesapla(double...sayilar){
        double toplam = 0;
        for(Double d:sayilar){
            toplam = toplam + d;
        }
        return toplam / sayilar.length;


    }
}
