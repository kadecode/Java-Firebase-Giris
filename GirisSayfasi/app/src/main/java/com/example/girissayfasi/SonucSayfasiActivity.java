package com.example.girissayfasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class SonucSayfasiActivity extends AppCompatActivity {
    private Button buttonTekrar;
    private TextView textViewSkorToplam,textViewSkorEn,textViewtToplam,textViewEnYuksek;
    private Animation anima;
    private Animation giris_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sonuc_sayfasi);


        textViewSkorToplam = findViewById(R.id.textViewSkorToplam);
        textViewSkorEn = findViewById(R.id.textViewSkorEn);
        buttonTekrar = findViewById(R.id.buttonTekrar);

        int skor = getIntent().getIntExtra("Skorkod",0);
        textViewSkorToplam.setText(String.valueOf(skor));

        SharedPreferences sp = getSharedPreferences("Sonuc",Context.MODE_PRIVATE);
        int enYuksekSkor = sp.getInt("enYuksekSkor",0);

        if (skor > enYuksekSkor){
            SharedPreferences.Editor editor = sp.edit();
            editor.putInt("enYuksekSkor",skor);
            editor.apply();

            textViewSkorEn.setText(String.valueOf(skor));

        }else{
            textViewSkorEn.setText(String.valueOf(enYuksekSkor));
        }

        anima = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.giris_button);
        buttonTekrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonTekrar.startAnimation(anima);
                startActivity(new Intent(SonucSayfasiActivity.this,OyunSayfasiActivity.class));
                finish();
            }

        });
    }
}