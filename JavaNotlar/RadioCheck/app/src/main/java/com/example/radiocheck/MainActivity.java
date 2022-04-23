package com.example.radiocheck;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    private CheckBox javabox,kodlinbox;
    private RadioButton radioBesik,radioFener;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        javabox = findViewById(R.id.javaBox);
        kodlinbox= findViewById(R.id.kodlinBox);
        radioBesik = findViewById(R.id.radioBesik);
        button = findViewById(R.id.button);


    }




}