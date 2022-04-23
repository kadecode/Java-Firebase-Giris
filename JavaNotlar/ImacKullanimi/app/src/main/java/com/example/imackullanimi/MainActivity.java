package com.example.imackullanimi;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView fare;
    private Button farebutton;
    private Button girlbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fare = findViewById(R.id.fare);
        farebutton = findViewById(R.id.farebutton);
        girlbutton = findViewById(R.id.girlbutton);

        farebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fare.setImageResource(R.drawable.resim1);

            }
        });
        girlbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
    }
}