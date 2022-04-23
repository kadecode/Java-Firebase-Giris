package com.example.nesletabanli2.mainMetot;

import com.example.nesletabanli2.Sinifler.Personel;

public class matMain {
    public static void main(String args[]){

        //int sonuc = matatamatik.topla(3,6);
       // System.out.println(sonuc);

        Personel p1 = new Personel("momo",35);
        Personel p2 = new Personel("Ezgi",25);
        Personel p3 = new Personel("Ömür",25);
        Personel p4 = new Personel("Şule",31);
        System.out.println(Personel.sayac);
    }
}
