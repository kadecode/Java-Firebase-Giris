package com.example.collestionscalismasi;

import java.util.Objects;

public class Ogrenciler {
    private String isim;
    private int okulNo;

    public Ogrenciler() {
    }

    public Ogrenciler(String isim, int okulNo) {
        this.isim = isim;
        this.okulNo = okulNo;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ogrenciler)) return false;
        Ogrenciler that = (Ogrenciler) o;
        return getOkulNo() == that.getOkulNo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOkulNo());
    }
}
