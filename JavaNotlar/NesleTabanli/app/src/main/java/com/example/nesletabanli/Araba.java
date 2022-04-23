package com.example.nesletabanli;

public class Araba {
    String renk;
    int hiz;
    double uzunluk;
    boolean calisiyorMu;

    public void calistir(){
        calisiyorMu =true;
    }
    public void durum(){
        calisiyorMu = false;
    }
    public void hizlan(int miktar){
        hiz =hiz + miktar;
    }
    public  void yavasla(int miktar){
        hiz = hiz - miktar;
    }




}
