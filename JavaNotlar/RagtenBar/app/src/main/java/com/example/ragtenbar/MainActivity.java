package com.example.ragtenbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button,basla,dur;
    private ProgressBar barCek;
    private SeekBar seekBar;
    private RatingBar ratingBar;
    private TextView textViewSonuc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        basla = findViewById(R.id.basla);
        dur = findViewById(R.id.dur);
        button = findViewById(R.id.button);
        seekBar = findViewById(R.id.seekBar);
        barCek = findViewById(R.id.barCek);
        ratingBar= findViewById(R.id.ratingBar);
        textViewSonuc = findViewById(R.id.textViewSonuc);

        basla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                barCek.setVisibility(View.VISIBLE);

            }
        });
        dur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                barCek.setVisibility(View.INVISIBLE);

            }
        });

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textViewSonuc.setText("Sonuç : "+progress);


            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float gelenOylama = ratingBar.getRating();
                Log.e("Oylama Sonucu",String.valueOf(gelenOylama));
            }
        });
    }
}