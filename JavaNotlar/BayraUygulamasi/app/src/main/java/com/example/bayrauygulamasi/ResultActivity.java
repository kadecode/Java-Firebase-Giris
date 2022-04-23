package com.example.bayrauygulamasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    private TextView textViewSonuc,textViewYuzdeSonuc;
    private Button buttonTerar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        textViewSonuc = findViewById(R.id.textViewSonuc);
        textViewYuzdeSonuc = findViewById(R.id.textViewYuzdeSonuc);
        buttonTerar = findViewById(R.id.buttonTerar);

        buttonTerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ResultActivity.this,QuizActivity.class));
                finish();
            }
        });

    }
}