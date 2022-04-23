package com.example.nesletabanli2.Sinifler;

public class Urunler {
    private String urunAd;
    private int ununAdet;


    public Urunler() {    }


    public Urunler(String urunAd, int ununAdet) {
        this.urunAd = urunAd;
        this.ununAdet = ununAdet;
    }

    public String getUrunAd() {
        return urunAd;
    }

    public void setUrunAd(String urunAd) {
        this.urunAd = urunAd;
    }

    public int getUnunAdet() {
        return ununAdet;
    }

    public void setUnunAdet(int ununAdet) {
        this.ununAdet = ununAdet;




    }
}