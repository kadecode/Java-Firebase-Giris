package com.example.oyunyapimi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SonucEkraniActivity extends AppCompatActivity {
    private TextView textViewSkor2, textViewSkorYuksek;
    private Button buttonTekrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sonuc_ekrani);

        textViewSkor2 = findViewById(R.id.textViewSkor2);
        textViewSkorYuksek = findViewById(R.id.textViewSkorYuksek);
        buttonTekrar = findViewById(R.id.buttonTekrar);

        buttonTekrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SonucEkraniActivity.this, MainActivity.class));
                finish();
            }


        });

    }

}