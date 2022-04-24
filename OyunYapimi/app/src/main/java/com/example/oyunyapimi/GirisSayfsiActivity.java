package com.example.oyunyapimi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GirisSayfsiActivity extends AppCompatActivity {
    private Button buttonGiris;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        buttonGiris = findViewById(R.id.buttonGiris);
        buttonGiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GirisSayfsiActivity.this,MainActivity.class));
                finish();
            }
        });
    }
}