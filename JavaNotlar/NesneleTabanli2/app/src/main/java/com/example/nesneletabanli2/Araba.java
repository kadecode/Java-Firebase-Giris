package com.example.nesneletabanli2;

public class Araba extends Arac {
    private String kasa;

    public Araba() {
        super();
        System.out.println("Araba boş constructor çalıştı");

    }

    public Araba(String kasa) {
        this.kasa = kasa;
        System.out.println("Araba dolu constructor çalıştı");

    }

    public String getKasa() {
        return kasa;
    }

    public void setKasa(String kasa) {
        this.kasa = kasa;
    }

    public void bilgiAlAraba(){
        System.out.println(kasa);
        System.out.println(getReng());
        System.out.println(getVites());
    }
}
