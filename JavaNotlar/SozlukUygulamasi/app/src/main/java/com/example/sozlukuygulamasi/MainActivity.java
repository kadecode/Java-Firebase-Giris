package com.example.sozlukuygulamasi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private VeritabaniYardimcisi vt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vt = new VeritabaniYardimcisi(this);
       /* new Kelimelerdao().kelimeEkle(vt,"door","kapı");
        new Kelimelerdao().kelimeEkle(vt,"window","pencere");
        new Kelimelerdao().kelimeEkle(vt,"table","kapı");
        new Kelimelerdao().kelimeEkle(vt,"sea","deniz");
        new Kelimelerdao().kelimeEkle(vt,"pencil","kalem");*/

        /*new Kelimelerdao().kelimeSil(vt,4);
        new Kelimelerdao().kelimeGuncelle(vt,3,"what","ne");*/

     /*  Integer sonuc = new Kelimelerdao().kayitSorgu(vt);
        Log.e("Veri sayısı",String.valueOf(sonuc);*/

        Kelimeler kelime = new Kelimelerdao().kelimeGetir(vt,4);
        Log.e("Kelime",kelime.getKelime_id()+" - "+kelime.getInglizce()+" - "+kelime.getTurkce() );

        ArrayList<Kelimeler> gelenKelimlerListesi = new Kelimelerdao().tumKelimelerRasgele5(vt);

        for(Kelimeler k :  gelenKelimlerListesi){
          Log.e(String.valueOf(k.getKelime_id()),k.getInglizce()+"-"+k.getTurkce());
        }



    }
}