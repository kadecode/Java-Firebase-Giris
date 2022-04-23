package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private GridView gridViem;
    private ArrayList <String> vat = new  ArrayList<>();
    private  ArrayAdapter<String>veri;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridViem = findViewById(R.id.gridViem);
        vat.add("Kore");
        vat.add("Rusya");
        vat.add("İngiltere");
        vat.add("Bulgaristan");
        vat.add("İtalya");
        vat.add("Yunanistan");
        veri = new ArrayAdapter<>( MainActivity.this,android.R.layout.simple_list_item_1,android.R.id.text1,vat);
        gridViem.setAdapter(veri);
        gridViem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 Toast.makeText(getApplicationContext(), "Seçtiğin Ülkenin Taaa : "+vat.get(position), Toast.LENGTH_SHORT).show();
             }
         });


    }
}