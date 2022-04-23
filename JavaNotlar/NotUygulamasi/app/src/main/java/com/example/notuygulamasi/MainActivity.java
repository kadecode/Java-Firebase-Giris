package com.example.notuygulamasi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private RecyclerView rv;
    private FloatingActionButton buttonFab;
    private ArrayList<Notlar> notlarArrayList;
    private NotlaraAdapter adater;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        rv = findViewById(R.id.rv);

        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));

        notlarArrayList = new ArrayList<>();
        Notlar n1 = new Notlar(1,"Yazılım",60,55);
        Notlar n2 = new Notlar(2,"Çizim",70,80);
        Notlar n3 = new Notlar(3,"Kayıt Alma",75,75);

        notlarArrayList.add(n1);
        notlarArrayList.add(n2);
        notlarArrayList.add(n3);

        adater = new NotlaraAdapter(this,notlarArrayList);

        rv.setAdapter(adater);



        buttonFab = findViewById(R.id.buttonFab);
       buttonFab.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(MainActivity.this,NotKatyitActivity.class));

           }
       });



    }
}