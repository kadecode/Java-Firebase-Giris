package com.example.notuygulamasi;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NotKatyitActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private EditText editTextDers, editTextNot1, editTextNot2;
    private Button buttonKayit;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_not_katyit);

        toolbar = findViewById(R.id.toolbar);
        editTextDers = findViewById(R.id.editTextDers);
        editTextNot1 = findViewById(R.id.editTextNot1);
        editTextNot2 = findViewById(R.id.editTextNot2);
        buttonKayit = findViewById(R.id.buttonKayit);

        toolbar.setTitle("Not Kayıt");
        setSupportActionBar(toolbar);

        buttonKayit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NotKatyitActivity.this,MainActivity.class));
                finish();

            }
        });


    }

}