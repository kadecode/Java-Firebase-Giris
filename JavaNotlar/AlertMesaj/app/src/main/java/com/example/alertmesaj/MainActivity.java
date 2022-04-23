 package com.example.alertmesaj;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {
    private Button buttonNormal,buttonOzel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonNormal = findViewById(R.id.buttonNormal);
        buttonOzel = findViewById(R.id.buttonOzel);
        buttonNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder ad = new AlertDialog.Builder(getApplicationContext());
                ad.setMessage("Mesaj");
                ad.setTitle("Başlık");
                ad.setIcon(R.drawable.resim);
                ad.setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"Tamam tıklandı",Toast.LENGTH_SHORT).show();

                    }
                });
                ad.setNegativeButton("İptal", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"İptal tıklandı",Toast.LENGTH_SHORT).show();

                    }
                });
                ad.create().show();

            }
        });
        buttonOzel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View tasarim = getLayoutInflater().inflate(R.layout.alerttasim,null);
               final EditText veriGir = tasarim.findViewById(R.id.veriGir);
                AlertDialog.Builder ad = new AlertDialog.Builder(MainActivity.this);
                ad.setMessage("Mesaj");
                ad.setView(tasarim);
                ad.setPositiveButton("Kaydet", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String gVeri = veriGir.getText().toString();
                        Toast.makeText(getApplicationContext(),"Alınan Veri "+gVeri,Toast.LENGTH_SHORT).show();

                    }
                });
                ad.setNegativeButton("İptal", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"Özel iptal seçildi :"+veriGir,Toast.LENGTH_LONG).show();

                    }
                });
                ad.create().show();

            }
        });
    }
}