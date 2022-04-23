package com.example.notuygulas1;

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
    private FloatingActionButton fab;
    private ArrayList<Notlar> notlarArrayList;
    private NotlarAdapter adapter;
    private Veritabani vt;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        rv = findViewById(R.id.rv);
        fab = findViewById(R.id.fab);

        vt = new Veritabani(this);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));

        notlarArrayList = new NotlarDao().tumNotlar(vt);



        adapter = new NotlarAdapter(this,notlarArrayList);

        rv.setAdapter(adapter);



        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,NotKayitActivity.class));

            }
        });

    }
}