package com.example.snacbar;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private Button Normal,Geri,Ozel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Normal = findViewById(R.id.Normal);
        Geri = findViewById(R.id.Geri);
        Ozel = findViewById(R.id.Ozel);

        Normal.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Snackbar.make(v,"Selam",Snackbar.LENGTH_SHORT).show();

           }
       });
        Geri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"Messj Silinsin mi",Snackbar.LENGTH_LONG)
                        .setAction("Evet", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Snackbar.make(v,"Mesaj Silindi",Snackbar.LENGTH_SHORT).show();

                    }
                }).show();


            }
        });
        Ozel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(v,"İnternet Bağlantısı Yok!",Snackbar.LENGTH_LONG)
                        .setAction("Tekrar Dene", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                            }
                        });
                snackbar.setActionTextColor(Color.RED);
                snackbar.getView().setBackgroundColor(Color.BLUE);
                snackbar.setActionTextColor(Color.WHITE);

                snackbar.show();

            }
        });




}
}
