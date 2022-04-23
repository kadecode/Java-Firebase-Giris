package com.example.sozlukuygulamasi;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class KelimelerDao {
    public ArrayList<Kelimeler> tumkelimeler(Veritabani vt){
        ArrayList<Kelimeler> kelimelerArrayList1 = new ArrayList<>();

        SQLiteDatabase DB = vt.getWritableDatabase();
        Cursor c = DB.rawQuery("SELECT * FROM kelimeler",null);
        while(c.moveToNext()){
            Kelimeler k = new Kelimeler(c.getInt(c.getColumnIndex("kelime_id"))
                    ,c.getString(c.getColumnIndex("ingilizce"))
                    ,c.getString(c.getColumnIndex("turkce")));
            kelimelerArrayList1.add(k);

        }
        return kelimelerArrayList1;
    }

    public ArrayList<Kelimeler> kelimeAra (Veritabani vt,String aramaKelime){
        ArrayList<Kelimeler> kelimelerArrayList1 = new ArrayList<>();

        SQLiteDatabase DB = vt.getWritableDatabase();
        Cursor c = DB.rawQuery("SELECT * FROM kelimeler WHERE ingilizce like '½"+aramaKelime+"½'",null);
        while(c.moveToNext()){
            Kelimeler k = new Kelimeler(c.getInt(c.getColumnIndex("kelime_id"))
                    ,c.getString(c.getColumnIndex("ingilizce"))
                    ,c.getString(c.getColumnIndex("turkce")));
            kelimelerArrayList1.add(k);

        }
        return kelimelerArrayList1;
    }
}

