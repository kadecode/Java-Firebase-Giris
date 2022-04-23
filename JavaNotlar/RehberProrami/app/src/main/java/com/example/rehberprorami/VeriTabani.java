package com.example.rehberprorami;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class VeriTabani extends SQLiteOpenHelper {

    public VeriTabani(Context context){
        super(context,"VeriDB",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE rehber " +
                "(id INTEGER PRIMARY KEY AUTOINCREMENT,ad,TEXT NOT NULL  ,tel TEXT NOT NULL);");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE  IF EXISTS rehber");
        onCreate(db);

    }
}
