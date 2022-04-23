package com.example.loginekraniyapma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AnaEkranActivity extends AppCompatActivity {
    private Button buttonCıkıs;
    private TextView yazıAna;
    private SharedPreferences sp;
    private SharedPreferences.Editor  editor;
    private String username ;
    private String password ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ana_ekran);
        buttonCıkıs = findViewById(R.id.buttonCıkıs);
        yazıAna = findViewById(R.id.yazıAna);

        sp = getSharedPreferences("GiriiewAnasbilgi",MODE_PRIVATE);
        editor = sp.edit();

        username = sp.getString("username","kullacı adı yok");
        password = sp.getString("password","şifre yok");

        yazıAna.setText("Username : "+username+"Password : "+password);



        buttonCıkıs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.remove("username");
                editor.remove("password");
                editor.commit();

                startActivity(new Intent(AnaEkranActivity.this,MainActivity.class));

            }
        });
    }
}