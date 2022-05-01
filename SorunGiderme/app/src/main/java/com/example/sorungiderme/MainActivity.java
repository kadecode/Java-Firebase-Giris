package com.example.sorungiderme;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {
   private RecyclerView rv;
   private Toolbar toolbar;
   private FloatingActionButton fab;
    private SearchView SearchView;
    private ArrayList<Kisiler> kisilerArrayList;
    private KisilerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.rv);
        fab = findViewById(R.id.fab);

        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Gelecege Şıçış");
        setSupportActionBar(toolbar);

        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));

        kisilerArrayList = new ArrayList<>();
        Kisiler k1 = new Kisiler(1,"Momo","645463098");
        Kisiler k2 = new Kisiler(2,"Comes","46543213");
        Kisiler k3 = new Kisiler(3,"Haydar","4654984");
        Kisiler k4 = new Kisiler(4,"Patates","4654348");
        kisilerArrayList.add(k1);
        kisilerArrayList.add(k2);
        kisilerArrayList.add(k3);
        kisilerArrayList.add(k4);

        adapter = new KisilerAdapter(this,kisilerArrayList);
        rv.setAdapter(adapter);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertTasarim();
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_toolbar,menu);

        MenuItem menuI = menu.findItem(R.id.app_bar_search);
        SearchView ara = (SearchView) menuI.getActionView();
        ara.setOnQueryTextListener(this);
        return true;
    }
    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        return false;
    }

    public void alertTasarim(){
        LayoutInflater inflater = LayoutInflater.from(this);
        View tasarım = inflater.inflate(R.layout.alert_tasarim,null);

       final EditText isimEkle = tasarım.findViewById(R.id.isimEkle);
       final EditText telNumarasi = tasarım.findViewById(R.id.telNumarasi);

        AlertDialog.Builder momo = new AlertDialog.Builder(this);
        momo.setTitle("Kişi Ekle");
        momo.setView(tasarım);
        momo.setPositiveButton("Ekle", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String kisi_ad = isimEkle.getText().toString().trim();
                String kisi_tel = telNumarasi.getText().toString().trim();

                Toast.makeText(getApplicationContext(),kisi_ad+"-"+kisi_tel,Toast.LENGTH_SHORT).show();
            }
        });
        momo.setNegativeButton("İptal", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        momo.create().show();
    }
}


