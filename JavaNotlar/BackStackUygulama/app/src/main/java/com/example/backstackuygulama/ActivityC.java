package com.example.backstackuygulama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityC extends AppCompatActivity {
    private Button DGıt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        DGıt = findViewById(R.id.DGıt);
        DGıt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityC.this,ActivityD.class));
            }
        });

    }
}