package com.example.sozlukuygulamasi;

public class Kelimeler {
  private int kelime_id;
  private String inglizce,turkce;

    public Kelimeler() {
    }

    public Kelimeler(int kelime_id, String inglizce, String turkce) {
        this.kelime_id = kelime_id;
        this.inglizce = inglizce;
        this.turkce = turkce;
    }

    public int getKelime_id() {
        return kelime_id;
    }

    public void setKelime_id(int kelime_id) {
        this.kelime_id = kelime_id;
    }

    public String getInglizce() {
        return inglizce;
    }

    public void setInglizce(String inglizce) {
        this.inglizce = inglizce;
    }

    public String getTurkce() {
        return turkce;
    }

    public void setTurkce(String turkce) {
        this.turkce = turkce;
    }
}
