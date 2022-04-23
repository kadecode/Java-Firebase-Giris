package com.example.loginekraniyapma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editTextTextPostalAddressNane,editTextTextPostalAddressPass;
    private Button buttonGiris;
    private SharedPreferences sp ;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextTextPostalAddressNane = findViewById(R.id.editTextTextPostalAddressNane);
        editTextTextPostalAddressPass = findViewById(R.id.editTextTextPostalAddressPass);
        buttonGiris = findViewById(R.id.buttonGiris);

        sp = getSharedPreferences("Girisbilgi",MODE_PRIVATE);
        editor = sp.edit();

        buttonGiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editTextTextPostalAddressNane.getText().toString()
                        .equals("admin")&& editTextTextPostalAddressPass.getText().toString().equals("1234")) {
                    editor.putString("username", editTextTextPostalAddressNane.getText().toString());
                    editor.putString("password", editTextTextPostalAddressPass.getText().toString());
                    editor.commit();

                    startActivity(new Intent(MainActivity.this, AnaEkranActivity.class));
                }else{
                    Toast.makeText(getApplicationContext(),"Giriş HATALI",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}