package com.example.tahminoyunu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SonucActivity extends AppCompatActivity {
    private ImageView imageViewSocun;
    private TextView textViewKayıp;
    private Button buttonSon;
    private boolean sonuc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sonuc);
        imageViewSocun = findViewById(R.id.imageViewSonuc);
        textViewKayıp = findViewById(R.id.textViewKayıp);
        buttonSon = findViewById(R.id.buttonSon);

        sonuc = getIntent().getBooleanExtra("sonuc",false);

        if(sonuc = true){
            textViewKayıp.setText("KAZANDINIZ");
            imageViewSocun.setImageResource(R.drawable.mutlu_surat);
        }else{
            textViewKayıp.setText("KAYIBETTİNİZ");
            imageViewSocun.setImageResource(R.drawable.uzgun_surat);
        }
        buttonSon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SonucActivity.this,TahminActivity.class));
                finish();

            }
        });
    }
}