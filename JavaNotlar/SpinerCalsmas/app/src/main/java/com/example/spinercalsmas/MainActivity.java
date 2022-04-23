package com.example.spinercalsmas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private Button buttonGoster;
    private ArrayList<String> meyveler = new ArrayList<>();
    private ArrayAdapter<String> veriBank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        buttonGoster = findViewById(R.id.buttonGoster);

        meyveler.add("Elma");
        meyveler.add("Nar");
        meyveler.add("Armut");
        meyveler.add("Kaysı");
        meyveler.add("Nektari");
        meyveler.add("Kiraz");
        meyveler.add("Şeftali");

        veriBank = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,
                android.R.id.text1
                ,meyveler);

        spinner.setAdapter(veriBank);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Seçilen Meyve :"+meyveler.get(position),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        buttonGoster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Meyve :"+meyveler.get(spinner.getSelectedItemPosition()),
                        Toast.LENGTH_SHORT).show();


            }
        });


    }


}