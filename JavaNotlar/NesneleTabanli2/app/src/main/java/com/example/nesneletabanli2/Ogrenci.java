package com.example.nesneletabanli2;

import java.util.Objects;

public class Ogrenci {
     private  int tcno ;
     private String isim;
     public Ogrenci(){
     }

    public Ogrenci(int tcno, String isim) {
        this.tcno = tcno;
        this.isim = isim;
    }

    public int getTcno() {
        return tcno;
    }

    public void setTcno(int tcno) {
        this.tcno = tcno;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "tcno=" + tcno +
                ", isim='" + isim + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ogrenci)) return false;
        Ogrenci ogrenci = (Ogrenci) o;
        return tcno == ogrenci.tcno &&
                Objects.equals(isim, ogrenci.isim);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tcno, isim);
    }
}
