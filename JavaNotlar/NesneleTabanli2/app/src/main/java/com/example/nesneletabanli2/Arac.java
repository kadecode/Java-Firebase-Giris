package com.example.nesneletabanli2;

public class Arac {
    private String reng;
    private int vites;

    public Arac() {
     super();
        System.out.println("araba boş constructor çalıştı");

    }
    public Arac(String reng, int vites) {  super();  System.out.println("Araba doluconstructor çalıştı");
        this.reng = reng;
        this.vites = vites;
    }

    public String getReng() {
        return reng;
    }

    public void setReng(String reng) {
        this.reng = reng;
    }

    public int getVites() {
        return vites;
    }

    public void setVites(int vites) {
        this.vites = vites;
    }





}