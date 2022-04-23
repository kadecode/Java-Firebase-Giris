package com.example.menutasarlama;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button buttonMenü;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonMenü = findViewById(R.id.buttonMenü);
        buttonMenü.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(getApplicationContext(),buttonMenü);
                popup.getMenuInflater().inflate(R.menu.popup_menu,popup.getMenu());
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){
                            case R.id.action_sil:
                                Toast.makeText(getApplicationContext(),"Sil Seçildi",Toast.LENGTH_SHORT).show();
                                return true;
                            case R.id.action_düzenle:
                                Toast.makeText(getApplicationContext(),"Düzenle Seçildi",Toast.LENGTH_SHORT).show();
                                return true;
                            default:
                                return false;

                        }



                    }
                });
                popup.show();

            }
        });
    }
}