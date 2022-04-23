package com.example.recyclerviewkullanimi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv;
    private ArrayList<String> ulkelerList;
    private BasitRVAdapter1 adapter1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.rv);
        rv.setHasFixedSize(true);

        //rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));

        ulkelerList = new ArrayList<>();
        ulkelerList.add("Japonya");
        ulkelerList.add("Afrika");
        ulkelerList.add("Yunanistan");
        ulkelerList.add("Fransa");
        ulkelerList.add("Rusya");
        ulkelerList.add("Cin");
        ulkelerList.add("Türkiye");
        ulkelerList.add("Kanada");

        adapter1 = new BasitRVAdapter1(getApplicationContext(),ulkelerList);

        rv.setAdapter(adapter1);
    }
}