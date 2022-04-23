package com.example.backstackuygulama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button BGıt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BGıt = findViewById(R.id.BGit);
        BGıt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(new Intent(MainActivity.this,ActivityB.class));
            }
        });
    }
}