package com.example.sharedprefereb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.TextViewCompat;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Set;

public class IkinciActivity extends AppCompatActivity {
    private Button buttonSil,buttonGuncelle;
    private TextView textViewCikti;
    private SharedPreferences sp;
    private SharedPreferences.Editor e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikinci);

        buttonSil = findViewById(R.id.buttonSil);
        buttonGuncelle = findViewById(R.id.buttonGuncelle);
        textViewCikti = findViewById(R.id.textViewCikti);

        SharedPreferences sp = getSharedPreferences("KişiselBilgiler",MODE_PRIVATE);

        e = sp.edit();

        String ad = sp.getString("ad","isim yok");
        int yas = sp.getInt("yas",0);
        float boy = sp.getFloat("boy",0.0f);
        boolean bekar = sp.getBoolean("bekar",false);
        Set<String> arkadasListesi = sp.getStringSet("arkadasListesi",null);

        StringBuilder sb =new StringBuilder();
        for (String s : arkadasListesi){
            sb.append(sb+"");
        }
        textViewCikti.setText("AD :"+ad+"Yas"+yas+"Boy :"+boy+"Bekar :"+bekar+"Arkadaşlar : "+sb.toString());





    }
}