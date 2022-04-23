package com.example.backstackuygulama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class ActivityD extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActionMode(new Intent(ActivityD.this,ActivityB.class);
}


}