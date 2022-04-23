package com.example.toggber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private Switch swictch1;
    private ToggleButton toggleButton;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        swictch1 = findViewById(R.id.switch1);
        toggleButton = findViewById(R.id.toggleButton);
        button = findViewById(R.id.button);
        swictch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean b) {
                if (b){
                    Log.e("Switch","ON");
                }else{
                    Log.e("Switch","OFF");
                }
            }
        });
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean b) {
                if (b){
                    Log.e("Toggle","ON");
                }else{
                    Log.e("Toggle","OFF");
                }
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean switchDurum = swictch1.isChecked();
                Boolean toggleDurum = toggleButton.isChecked();
                Log.e("Switch durum",String.valueOf(swictch1));
                Log.e("Toggle Durum",String.valueOf(toggleButton));
                
            }
        });
    }
}