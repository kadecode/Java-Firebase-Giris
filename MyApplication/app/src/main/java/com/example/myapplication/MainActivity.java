package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button buttonKayit;
    private TextView cikti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cikti = findViewById(R.id.cikti);
        buttonKayit = findViewById(R.id.buttonKayit);

        buttonKayit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new CountDownTimer(30000,1000){

                    @Override
                    public void onTick(long millisUntilFinished) {
                        cikti.setText("Kalan süre : "+millisUntilFinished/1000+" sn");
                    }

                    @Override
                    public void onFinish() {
                        cikti.setText("Bitir");

                    }
                }.start();
            }
        });
    }
}