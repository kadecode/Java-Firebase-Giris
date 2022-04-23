package com.example.soncalismaveim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textEzgi;
    private Button dgMomo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textEzgi = findViewById(R.id.textEzgi);
        dgMomo = findViewById(R.id.dgMono);

        dgMomo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textEzgi.setText("Nedirsen Canını Yediğim");
                Log.e("Mesaj","Merbaha");
            }
        });

        



    }
}