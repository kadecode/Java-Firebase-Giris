package com.example.foatinglabel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private TextInputEditText adGirin,telGirin;
    private Button buttonYap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adGirin = findViewById(R.id.adGirin);
        telGirin = findViewById(R.id.telGirin);
        buttonYap = findViewById(R.id.buttonYap);

        buttonYap.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String ad = adGirin.getText().toString();
                String tel = telGirin.getText().toString();
                Toast.makeText(getApplicationContext(),ad+" - "+tel,Toast.LENGTH_SHORT).show();

            }
        });
    }
}