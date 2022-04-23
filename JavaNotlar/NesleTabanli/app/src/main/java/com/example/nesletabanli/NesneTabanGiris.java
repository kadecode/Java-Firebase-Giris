package com.example.nesletabanli;

public class NesneTabanGiris {
    public static void main(String args[]){

        int yas = 30;
        Araba fort = new Araba();
        fort.renk = "Beyaz";
        fort.hiz = 200;
        fort.uzunluk = 2.15;
        fort.calisiyorMu = false;

        Araba tesla = new Araba();
        tesla.renk = "kırmızı";
        tesla.hiz = 220;
        tesla.uzunluk = 2.45;
        tesla.calisiyorMu = true;

        tesla.yavasla(45);
        fort.hizlan(35);

        System.out.println(tesla.hiz);
        System.out.println(fort.hiz);






    }
}
