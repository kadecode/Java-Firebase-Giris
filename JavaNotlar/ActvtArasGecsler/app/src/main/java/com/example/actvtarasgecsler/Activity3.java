package com.example.actvtarasgecsler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity3 extends AppCompatActivity {
    private Button kedi3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        kedi3 = findViewById(R.id.kedi3);
        kedi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yeniInten1 = new Intent(Activity3.this,MainActivity.class);
                startActivity(yeniInten1);
            }
        });
    }
}