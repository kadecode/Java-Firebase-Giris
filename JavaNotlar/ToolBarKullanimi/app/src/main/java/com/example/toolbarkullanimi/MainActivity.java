package com.example.toolbarkullanimi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Özel Toolbar Başlık");
        toolbar.setSubtitle("Alt Başlık");
        toolbar.setLogo(R.drawable.resim);
        toolbar.setTitleTextColor(getResources().getColor(R.color.black));

        setSupportActionBar(toolbar);
    }
}