package com.example.toolbarmenuekleme;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Toolbar Memu");
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
    switch (item.getItemId()){
           case R.id.action_ayarlar:
               Toast.makeText(getApplicationContext(),"Ayarlar Tıklandı",Toast.LENGTH_SHORT).show();
               return true;
           case R.id.action_bilgi:
               Toast.makeText(getApplicationContext(),"Bilgi Tıklandı",Toast.LENGTH_SHORT).show();
               return true;
           case R.id.action_ekle:
               Toast.makeText(getApplicationContext(),"Ekleye Tıklandı",Toast.LENGTH_SHORT).show();
               return true;
           case R.id.action_cıkıs:
               Toast.makeText(getApplicationContext(),"Çıkış Tıklandı",Toast.LENGTH_SHORT).show();
               return true;
           default:
               return super.onOptionsItemSelected(item);
       }
    }

}