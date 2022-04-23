 package com.example.actvtarasgecsler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

 public class MainActivity extends AppCompatActivity {
    private Button kedi2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kedi2 =findViewById(R.id.kedi2);
        kedi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yeniIntent = new Intent(MainActivity.this,Activity2.class);

            }
        });
}




 }