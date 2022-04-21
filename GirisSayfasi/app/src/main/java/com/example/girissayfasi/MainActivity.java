package com.example.girissayfasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Button buttonBasla;
    private ImageView yesilYum,turuncuYum,sariYum,maviYum;
    private Animation animasyon;
    private Animation yumurtalar, giris_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonBasla = findViewById(R.id.buttonBasla);
        yesilYum = findViewById(R.id.yesilYum);
        turuncuYum = findViewById(R.id.turuncuYum);
        sariYum = findViewById(R.id.sariYum);
        maviYum = findViewById(R.id.maviYum);

        animasyon = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.yumurtalar);
        yesilYum.setAnimation(animasyon);
        maviYum.setAnimation(animasyon);
        sariYum.setAnimation(animasyon);
        turuncuYum.setAnimation(animasyon);

        animasyon = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.giris_button);





        buttonBasla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonBasla.startAnimation(animasyon);
                startActivity(new Intent(MainActivity.this,OyunSayfasiActivity.class));
                finish();
            }
        });
    }
}