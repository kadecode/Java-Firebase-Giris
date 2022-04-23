package com.example.sozlukuygulamasi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetayActivity extends AppCompatActivity {
    private TextView textViewIngilice,textViewTurkc;
    private Kelimeler kelime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detay);

        textViewIngilice = findViewById(R.id.textViewIngilizce);
        textViewTurkc = findViewById(R.id.textViewTurkc);

        kelime =(Kelimeler) getIntent().getSerializableExtra("nesne");
        textViewIngilice.setText(kelime.getIngilizce());
        textViewTurkc.setText(kelime.getTurkce());
    }
}