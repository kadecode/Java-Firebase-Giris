package com.example.yasamdongusu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("Yaşam Döngüsü", "onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Yaşam Döngüsü", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Yaşam Döngüsü", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Yaşam Döngüsü", "onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Yaşam Döngüsü", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Yaşam Döngüsü", "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("Yaşam Döngüsü", "onRestart");
    }
}
