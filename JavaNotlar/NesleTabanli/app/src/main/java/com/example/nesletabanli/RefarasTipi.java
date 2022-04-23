package com.example.nesletabanli;

public class RefarasTipi {
public static void main(String args[]){
     int say1 = 40 ;
     int say2 = say1 ;
     say1 = 50 ;
     Blue ogrenciler1 = new Blue();
     ogrenciler1.ad = "momo";
     System.out.println(ogrenciler1.ad);
     Blue ogrenci2 = ogrenciler1;
     ogrenci2.ad = "Elif";

    System.out.println(ogrenci2.ad);
    System.out.println(ogrenciler1.hashCode());
    System.out.println(ogrenci2.hashCode());








}


}
