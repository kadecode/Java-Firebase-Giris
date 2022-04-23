package com.example.wepbaglantisi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    private WebView webViem ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webViem = findViewById(R.id.webViem);
        webViem.getSettings().setJavaScriptEnabled(true);
        webViem.loadUrl();
        
    }
}