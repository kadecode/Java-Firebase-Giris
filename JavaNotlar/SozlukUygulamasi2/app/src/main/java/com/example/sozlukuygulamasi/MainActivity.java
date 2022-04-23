package com.example.sozlukuygulamasi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.MenuItemCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener{
    private Toolbar toolbar;
    private RecyclerView rv;
    private ArrayList<Kelimeler> kelimelerArrayList;
    private KelimelerAdapter adapter ;
    private Veritabani vt;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        rv = findViewById(R.id.rv);

        toolbar.setTitle("Sözlük Uygulaması");
        setSupportActionBar(toolbar);

        vt = new Veritabani(this);

        veritabaniKobyala();

        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));

        kelimelerArrayList = new KelimelerDao().tumkelimeler(vt);
        adapter = new KelimelerAdapter(this,kelimelerArrayList);
        rv.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.toolbar_arama,menu);

        MenuItem item = menu.findItem(R.id.action_ara);
        SearchView searchView =(SearchView) item.getActionView();
        searchView.setOnQueryTextListener(this);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        Log.e("Gönderilen Arama",query);
        aramaYap(query);
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        Log.e("Harf girdikce",newText);
        aramaYap(newText);
        return false;
    }

    public void veritabaniKobyala(){
        DatabaseCopyHelper databaseCopyHelper = new DatabaseCopyHelper(this);
        try {
            databaseCopyHelper.createDataBase();
        } catch (IOException e) {
            e.printStackTrace();
        }
        databaseCopyHelper.openDataBase();

    }
    public void aramaYap(String aramaKelime){
        kelimelerArrayList = new KelimelerDao().kelimeAra(vt,aramaKelime);
        adapter = new KelimelerAdapter(this,kelimelerArrayList);
        rv.setAdapter(adapter);



    }
}