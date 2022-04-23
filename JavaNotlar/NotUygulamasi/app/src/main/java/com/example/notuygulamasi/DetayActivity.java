package com.example.notuygulamasi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class DetayActivity extends AppCompatActivity {
    private EditText editTextDersd,editTextNot1d,editTextNot2d;
    private Toolbar toolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detay);

        editTextDersd = findViewById(R.id.editTextDersd);
        editTextNot1d = findViewById(R.id.editTextNot1d);
        editTextNot2d = findViewById(R.id.editTextNot2);
        toolbar = findViewById(R.id.toolbar);

        toolbar.setTitle("Not Detay");
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_sil:
                Snackbar.make(toolbar,"Silinsin mi?",Snackbar.LENGTH_SHORT).setAction("Evet", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(DetayActivity.this,MainActivity.class));
                        finish();

                    }
                }).show();
                return true;
            case R.id.action_duzenle:
                startActivity(new Intent(DetayActivity.this,MainActivity.class));
                finish();
                return  true;
            default:
                return false;

        }
    }
}