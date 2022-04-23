package com.example.nesletabanli;

public class BlueMain {
    public static void main(String args[]){
        Blue ogrenciler = new Blue();

        ogrenciler.adres ="Esenler";
        ogrenciler.okulNo= 34536;
        ogrenciler.ad = "momo";


        System.out.println(ogrenciler.ad);

        Blue ogrenci2 = new Blue("hejeje",2334,"ayvalık");
        System.out.println(ogrenci2.ad);








    }
}
