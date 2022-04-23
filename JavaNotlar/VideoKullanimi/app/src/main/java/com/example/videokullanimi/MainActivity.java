package com.example.videokullanimi;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    private VideoView videoView;
    private Button buttonBas;
    private Button buttonDur;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView = findViewById(R.id.videoView);
        buttonBas = findViewById(R.id.buttonBasla);
        buttonDur = findViewById(R.id.buttonDur);

        buttonBas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri yon = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.Video);
                videoView.setVideoURI(yon);
                videoView.start();
            }
        });
        buttonDur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView.stopPlayback();
            }
        });
    }
}