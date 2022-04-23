package com.example.nesletabanli2.Sinifler;

public class Filmler {
    private  int Film_id;
    private String film_ad;
    private  int film_yİl;
    private  Kaegoriler kategori;
    private Yonetmenler yonetmen;

    public Filmler() {
    }

    public Filmler(int film_id, String film_ad, int film_yİl, Kaegoriler kategori, Yonetmenler yonetmen) {
        Film_id = film_id;
        this.film_ad = film_ad;
        this.film_yİl = film_yİl;
        this.kategori = kategori;
        this.yonetmen = yonetmen;
    }

    public int getFilm_id() {
        return Film_id;
    }

    public void setFilm_id(int film_id) {
        Film_id = film_id;
    }

    public String getFilm_ad() {
        return film_ad;
    }

    public void setFilm_ad(String film_ad) {
        this.film_ad = film_ad;
    }

    public int getFilm_yİl() {
        return film_yİl;
    }

    public void setFilm_yİl(int film_yİl) {
        this.film_yİl = film_yİl;
    }

    public Kaegoriler getKategori() {
        return kategori;
    }

    public void setKategori(Kaegoriler kategori) {
        this.kategori = kategori;
    }

    public Yonetmenler getYonetmen() {
        return yonetmen;
    }

    public void setYonetmen(Yonetmenler yonetmen) {
        this.yonetmen = yonetmen;
    }
}
