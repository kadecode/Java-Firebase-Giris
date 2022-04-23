package com.example.finihs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OyunEkrani extends AppCompatActivity {
    private Button bitir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oyun_ekrani);
        bitir = findViewById(R.id.bitir);
        bitir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(OyunEkrani.this,SonucEkrani.class));
            }
        });
    }
}