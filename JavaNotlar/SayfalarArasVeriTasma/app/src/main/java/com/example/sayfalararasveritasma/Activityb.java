package com.example.sayfalararasveritasma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Activityb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityb);
        String gelenMesaj = getIntent().getStringExtra("mesaj");

        Kisiler gelenKisi =(Kisiler) getIntent().getSerializableExtra("nesne");



    }
}