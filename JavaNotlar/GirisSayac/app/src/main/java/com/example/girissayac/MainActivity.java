package com.example.girissayac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView Sayac;
    private SharedPreferences sp;
    private SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Sayac =  findViewById(R.id.Sayac);

        sp =getSharedPreferences("GirisSayac",MODE_PRIVATE);
        editor = sp.edit();

        int say = sp.getInt("sayac",0);

        editor.putInt("sayac",++say);
        editor.commit();
        Sayac.setText("Sayaç :"+String.valueOf(say));


    }
}