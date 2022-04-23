package com.example.nesletabanli2.Sinifler;

public class Personel {
private String isim;
private  int yasa;
public static int sayac;
    public Personel() {
        sayac++;
    }

    public Personel(String isim, int yasa) {
        sayac++;
        this.isim = isim;
        this.yasa = yasa;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYasa() {
        return yasa;
    }

    public void setYasa(int yasa) {
        this.yasa = yasa;
    }
}



