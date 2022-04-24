package com.example.oyunyapimi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewBasla,textViewSkor;
    private ImageView imageViewAdam;
    private ImageView imageViewYesil;
    private ImageView imageViewMavi;
    private ImageView imageViewSari;
    private ImageView imageViewTuruncu;
    private ConstraintLayout cl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cl = findViewById(R.id.cl);
        textViewSkor = findViewById(R.id.textViewSkor);
        textViewBasla = findViewById(R.id.textViewBasla);
        imageViewAdam = findViewById(R.id.imageViewAdam);
        imageViewYesil = findViewById(R.id.imageViewYesil);
        imageViewMavi = findViewById(R.id.imageViewMavi);
        imageViewSari = findViewById(R.id.imageViewSari);
        imageViewTuruncu = findViewById(R.id.imageViewTuruncu);

        textViewBasla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SonucEkraniActivity.class));
                finish();
            }
        });
    }
}