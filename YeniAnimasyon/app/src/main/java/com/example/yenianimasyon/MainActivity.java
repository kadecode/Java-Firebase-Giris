package com.example.yenianimasyon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private Button button;
    private TextView textView;
    private FloatingActionButton fabBirinci,fabBaslama,fabikinci;
    private Animation ilkhareket,sonhareket,acikken,kapanirken;
    private Animation animasyon;
    private Boolean fabdurum =false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        fabBaslama = findViewById(R.id.fabBaslama);
        fabBirinci = findViewById(R.id.fabBirici);
        fabikinci = findViewById(R.id.fabikinci);

        animasyon = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.ziplama);
        imageView.setAnimation(animasyon);

        ilkhareket = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.ilkhareket);
        sonhareket = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.sonhareket);
        acikken = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.acikken);
        kapanirken = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.kapanirken);

        fabBaslama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(fabdurum){
                    fabBaslama.startAnimation(sonhareket);
                    fabBirinci.startAnimation(kapanirken);
                    fabikinci.startAnimation(kapanirken);
                    fabBirinci.setClickable(false);
                    fabikinci.setClickable(false);
                    fabdurum = false;
                }else{
                    fabBaslama.startAnimation(ilkhareket);
                    fabBirinci.startAnimation(acikken);
                    fabikinci.startAnimation(acikken);
                    fabBirinci.setClickable(true);
                    fabikinci.setClickable(true);
                    fabdurum = true;
                }
            }
        });

    }
}