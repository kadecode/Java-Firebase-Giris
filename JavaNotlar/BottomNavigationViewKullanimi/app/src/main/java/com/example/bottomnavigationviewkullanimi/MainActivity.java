package com.example.bottomnavigationviewkullanimi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottom_navigation;
    private Fragment tempFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottom_navigation = findViewById(R.id.bottom_navigation);

        getSupportFragmentManager().beginTransaction().add(R.id.fragment_tutucu,new FrangmentBirinci()).commit();

        bottom_navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId() == R.id.action_birinci){
                    Toast.makeText(getApplicationContext(),"Birinci Tıklandı",Toast.LENGTH_SHORT).show();
                    tempFragment = new FrangmentBirinci();
                }
                if(item.getItemId() == R.id.actiın_ikinci){
                    Toast.makeText(getApplicationContext(),"İkinci Tıklandı",Toast.LENGTH_SHORT).show();
                    tempFragment = new Frangmentikinci();
                }
                if(item.getItemId() == R.id.action_ucuncu){
                    Toast.makeText(getApplicationContext(),"Üçüncü Tıklandı",Toast.LENGTH_SHORT).show();
                    tempFragment = new FrangmentUcuncu();
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_tutucu,tempFragment ).commit();

                return true;
            }
        });

    }
}