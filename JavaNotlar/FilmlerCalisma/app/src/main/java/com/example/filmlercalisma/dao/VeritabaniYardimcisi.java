package com.example.filmlercalisma.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import static java.text.Collator.PRIMARY;

public class VeritabaniYardimcisi extends SQLiteOpenHelper {
    public VeritabaniYardimcisi(Context context){
        super(context, "filmler.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL("CREATE TABLE IF NOT EXISTS\"katageriler\" (\n" +
                "\t\"kategori_id\"\tINTEGER,\n" +
                "\t\"kategori_ad\"\tTEXT,\n" +
                "\tPRIMARY KEY(\"kategori_id\" AUTO" + getI() + "NCREMENT)\n" +
                ")");
        db.execSQL("CREATE TABLE IF NOT EXISTS \"yonetmenler\" (\n" +
                "\t\"yonetmen_id\"\tINTEGER,\n" +
                "\t\"yonetmen_ad\"\tINTEGER,\n" +
                "\tPRIMARY KEY(\"yonetmen_id\" AUTO"+ getI() + "INCREMENT)\n" +")");
        db.execSQL("CREATE TABLE IF NOT EXISTS \"filmler\" (\n" +
                    	"\t\"film_id\"\tINTEGER,\n"+
                    	"\t\"film_ad\"\tTEXT,\n"+
                    	"\t\"film_yil\"\tINTEGER,\n"+
                    	"\t\"film_resim\"\tTEXT,\n"+
                    	"\t\"kategori_id\"\tINTEGER,\n"+
                    	"\t\"yonetmen_id\"\tINTEGER,\n"+
                    	"\tFOREIGN KEY(\"kategori_id\") REFERENCES \"katageriler\"(\"kategori_id\"),\n"+
                    	"\tPRIMARY KEY(\"film_id\" AUTO"+ getI() + "INCREMENT)\n" +")");}

    private String getI() {
        return "I";
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS kategoriler");
        db.execSQL("DROP TABLE IF EXISTS yonetmenler");
        db.execSQL("DROP TABLE IF EXISTS filmler");
        onCreate(db);

    }
}
