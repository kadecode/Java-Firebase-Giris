package com.example.nesletabanli;

public class Otobus {

    int kapasite;
    int mevcutyolcu;
    String nereden;
    String  nereye;

    public void bilgiAl(){
        System.out.println("Kapasite :"+kapasite);
        System.out.println("Mevcut Yolcu :"+mevcutyolcu);
        System.out.println("Nereden :"+nereden);
        System.out.println("Nereye :"+nereye);
    }

    public void yolcuAl(int yolcuMiktari){
        mevcutyolcu = mevcutyolcu + yolcuMiktari;
        if(mevcutyolcu > kapasite){
            System.out.println("Otobüs dolu");
        }else{
            System.out.println("Yolcu sayısı :"+mevcutyolcu);
        }
    }
    public void yolcuİndir(int yolMiktar){
        mevcutyolcu = mevcutyolcu - yolMiktar;

        if(mevcutyolcu == 0){
            System.out.println("Otobüs boş!");
        }else{
            System.out.println("Yolcu sayısı :"+ mevcutyolcu);
        }
    }



}
