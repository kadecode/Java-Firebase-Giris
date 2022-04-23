package com.example.nesneletabanli2;

public class Ogretmen extends Personel {
    public void maasArttit(){
        System.out.println("Maaş arttı.Öğrentmen mutlu");
    }

    public void terfiEttir(Personel p) {

        if (p instanceof Ogretmen) {
            ((Ogretmen) p).maasArttit();
        }
        if (p instanceof Isci) {
            System.out.println("İsciler terfi alamaz");
        }


    }




    }