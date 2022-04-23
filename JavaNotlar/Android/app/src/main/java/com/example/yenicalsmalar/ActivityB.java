package com.example.yenicalsmalar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityB extends AppCompatActivity {
    private EditText birSey1;
    private Button zil1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        zil1 = findViewById(R.id.zil1);
        birSey1 = findViewById(R.id.birSey1);

        zil1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String veri = birSey1.getText().toString();
                Intent yeniIntent  = new Intent(ActivityB.this,MainActivity.class);
                yeniIntent.putExtra("mesaj",veri);

                startActivity(yeniIntent);
            }
        });
    }
}