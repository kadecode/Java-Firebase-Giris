package com.example.detaylirecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    private ArrayList<FilmSayfa> filmSayfaArrayList;
    private FilmAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.rv);
        rv.setHasFixedSize(true);

        rv.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        FilmSayfa f1 = new FilmSayfa(1,"İlber Ortaylı","ilber",12.99);
        FilmSayfa f2 = new FilmSayfa(1,"By Bahçeli","bahceli",9.99);
        FilmSayfa f3 = new FilmSayfa(1,"Emrah Acıları","emrah",8.99);
        FilmSayfa f4 = new FilmSayfa(1,"Er Kurtarma","kurtarma",12.99);
        filmSayfaArrayList = new ArrayList<>();
        filmSayfaArrayList.add(f1);
        filmSayfaArrayList.add(f2);
        filmSayfaArrayList.add(f3);
        filmSayfaArrayList.add(f4);

        adapter = new FilmAdapter(this,filmSayfaArrayList);

        rv.setAdapter(adapter);



    }
}