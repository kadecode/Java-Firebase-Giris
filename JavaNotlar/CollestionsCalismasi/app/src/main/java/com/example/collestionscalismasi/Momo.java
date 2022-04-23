package com.example.collestionscalismasi;

import com.google.android.material.internal.VisibilityAwareImageButton;

public class Momo implements Comparable<Momo> {
  private int tc ;
  private  String isim;

    public Momo() {
    }

    public Momo(int tc, String isim) {
        this.tc = tc;
        this.isim = isim;
    }

    public int getTc() {
        return tc;
    }

    public void setTc(int tc) {
        this.tc = tc;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }


    @Override
    public int compareTo(Momo isim) {
        return new String(this.isim).compareTo(isim.getIsim());
    }
}

