package com.example.rehberprorami;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button buttonGetir,buttonGuncelle,buttonSil,buttonKayit;
    private TextView textViewCikti;
    private EditText editTextTextAd,editTextTextId,editTextTextTel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonGetir = findViewById(R.id.buttonGetir);
        buttonGuncelle = findViewById(R.id.buttonGuncelle);
        buttonSil = findViewById(R.id.buttonSil);
        buttonKayit = findViewById(R.id.buttonKayit);

        textViewCikti = findViewById(R.id.textViewCikti);

        editTextTextAd = findViewById(R.id.editTextTextAd);
        editTextTextId = findViewById(R.id.editTextTextId);
        editTextTextTel = findViewById(R.id.editTextTextTel);

        buttonKayit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContentValues values = new ContentValues();
                values.put("ad",editTextTextAd.getText().toString());
                values.put("tel",editTextTextTel.getText().toString());

                Uri eri = getContentResolver().insert(MyProvider.CONTENT_URI,values);
                Toast.makeText(getApplicationContext(),"Rehber : "+eri.toString()+"kayıt edildi",Toast.LENGTH_SHORT).show();

            }
        });
        buttonGetir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor c = getContentResolver().query(MyProvider.CONTENT_URI,null,null,null,null);
                String result = "Rehber sonuç : ";
                while (c.moveToNext()){
                    result = result + "\n"+c.getInt(c.getColumnIndex("id"))
                            +"--"+c.getString(c.getColumnIndex("ad"))
                            +"--"+c.getString(c.getColumnIndex("tel"));
                }
                textViewCikti.setText(result);
            }
        });

        buttonSil.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("content://com.example.rehberprorami.MyProvider/rehber/"+editTextTextId.getText().toString());
                int count = getContentResolver().delete(uri,null,null);

            }
        });
        buttonGuncelle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ContentValues values = new ContentValues();
                values.put("ad",editTextTextAd.getText().toString());
                values.put("tel",editTextTextTel.getText().toString());
                Uri uri = Uri.parse("content://com.example.rehberprorami.MyProvider/rehber/"+editTextTextId.getText().toString());
                int count = getContentResolver().delete(uri,null,null);

            }
        });



    }
}