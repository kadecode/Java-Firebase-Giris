package com.example.ucakmodu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private UcakModuAlici ucakModuAlici;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ucakModuAlici = new UcakModuAlici();
    }

    @Override
    protected void onResume() {
        super.onResume();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
        registerReceiver(ucakModuAlici,intentFilter);

    }

    @Override
    protected void onStop() {
        super.onStop();

        unregisterReceiver(ucakModuAlici);
    }
}