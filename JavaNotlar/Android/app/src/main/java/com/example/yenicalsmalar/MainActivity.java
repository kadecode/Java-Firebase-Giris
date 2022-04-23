package com.example.yenicalsmalar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView bura;
  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bura = findViewById(R.id.bura);

        String gelenVeri = getIntent().getStringExtra("mesaj");
        bura.setText(gelenVeri);
    }

}