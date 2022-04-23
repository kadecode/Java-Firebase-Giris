package com.example.sharedprefereb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.HashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
    private Button buttonKayıt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonKayıt = findViewById(R.id.buttonKayıt);
        SharedPreferences sp = getSharedPreferences("KişiselBilgiler",MODE_PRIVATE);
        SharedPreferences.Editor e = sp.edit();




        buttonKayıt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                e.putString("ad","Momo");
                e.putInt("yas",19);
                e.putFloat("boy",1.98f);
                e.putBoolean("bekar",true);

                Set<String> arkadasListesi = new HashSet<>();
                arkadasListesi.add("Comes");
                arkadasListesi.add("Karakedi");
                arkadasListesi.add("Poncik");

                e.putStringSet("arkadasListesi",arkadasListesi);
                e.commit();



                startActivity(new Intent(MainActivity.this,IkinciActivity.class));
            }
        });
    }
}