package com.example.karanlkmodkullaimi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button normal,karanlik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        normal = findViewById(R.id.normal);
        karanlik = findViewById(R.id.karanlik);

        normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_NO);

            }
        });
        karanlik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getDelegate().setLocalNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            }
        });
    }
}