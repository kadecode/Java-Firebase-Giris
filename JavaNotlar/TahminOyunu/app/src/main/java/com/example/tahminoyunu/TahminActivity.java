package com.example.tahminoyunu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class TahminActivity extends AppCompatActivity {
    private TextView textHak,textArtır;
    private EditText editTextGirdi;
    private Button buttonTahmin;
    private  int rasgeleSayi;
    private  int sayac = 5 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tahmin);
        textHak = findViewById(R.id.textHak);
        textArtır = findViewById(R.id.textArtır);
        editTextGirdi = findViewById(R.id.editTextTextGirdi);
        buttonTahmin = findViewById(R.id.buttonTahmin);

        Random r = new Random();
        rasgeleSayi = r.nextInt(101);
        Log.e("Rasge sayı", String.valueOf(rasgeleSayi));


        buttonTahmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(TahminActivity.this,SonucActivity.class));
               // finish();
                sayac = sayac - 1;
                int tahmin = Integer.parseInt(editTextGirdi.getText().toString());
                if (tahmin == rasgeleSayi){
                    Intent s = new Intent(TahminActivity.this,SonucActivity.class);
                    s.putExtra("Sonuc",true);
                    startActivity(s);
                    finish();
                    return;

                }
                if(tahmin > rasgeleSayi){
                    textArtır.setText("Azalt");
                    textHak.setText("Kalan Hak : "+sayac);


                }
                if(tahmin < rasgeleSayi){
                    textArtır.setText("Arttır");
                    textHak.setText("Kalan Hak : "+sayac);
                }
                if(sayac == 0){
                    Intent i = new Intent(TahminActivity.this,SonucActivity.class);
                    i.putExtra("Sonuc",false);
                    startActivity(i);
                    finish();

                }
                editTextGirdi.setText("");

            }
        });

    }
}