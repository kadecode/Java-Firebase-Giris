package com.example.nesletabanli;

public class OtobusCalıstır {
    public static void main(String args[]){
        Otobus koc = new Otobus();
        koc.kapasite = 45;
        koc.mevcutyolcu =25;
        koc.nereden ="İstanbul";
        koc.nereye = "Badavut";

        Otobus turDay =new Otobus();
        turDay.kapasite = 56;
        turDay.mevcutyolcu = 42;
        turDay.nereden = "Bodrum";
        turDay.nereye = "İstanbul";

        System.out.println(koc.nereye);
        System.out.println();

        koc.yolcuAl(8);
        turDay.yolcuİndir(22);
        System.out.println("____________");


        turDay.bilgiAl();
        System.out.println("___________");

        koc.bilgiAl();




    }
}
