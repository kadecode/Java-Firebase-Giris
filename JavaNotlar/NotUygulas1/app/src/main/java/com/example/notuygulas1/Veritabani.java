package com.example.notuygulas1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Veritabani extends SQLiteOpenHelper {


    public Veritabani(Context context){
        super(context,"notlar.sqlite",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(new StringBuilder().append("CREATE TABLE \"notlar\" (\n")
                .append("\t\"not_id\"\tINTEGER,\n").append("\t\"ders_adi\"\tTEXT,\n")
                .append("\t\"not1\"\tINTEGER,\n").append("\t\"not2\"\tINTEGER,\n")
                .append("\tPRIMARY KEY(\"not_id\" AUTOINCREMENT)\n")
                .append(")").toString());

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS notlar");
        onCreate(db);


    }
}
