package com.example.intersetesilkullanimi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.instream.InstreamAd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class MainActivity extends AppCompatActivity {
    private Button buttonGoster;
    private InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonGoster = findViewById(R.id.buttonGoster);

        MobileAds.initialize(MainActivity.this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {

            }
        });

        AdRequest adRequest = new AdRequest.Builder().build();
        InterstitialAd.load(this,"ca-app-pub-3940256099942544/1033173712",adRequest,new InterstitialAdLoadCallback();
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        super.onAdLoaded(interstitialAd);
                    }






        buttonGoster.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                return false;
            }
        });
}
}