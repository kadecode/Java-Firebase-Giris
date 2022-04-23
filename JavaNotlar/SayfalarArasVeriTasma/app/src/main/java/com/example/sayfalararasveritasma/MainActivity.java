package com.example.sayfalararasveritasma;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button MainA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainA = findViewById(R.id.MainA);
        MainA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Kisiler kisi = new Kisiler(6666,"Momo",1.90);
                Intent yeniIntent = new Intent(MainActivity.this,Activityb.class);
               yeniIntent.putExtra("mesaj","merahaba zalım dünya");
                yeniIntent.putExtra("nesne",kisi);

                startActivity(yeniIntent);
            }
        });

    }
}