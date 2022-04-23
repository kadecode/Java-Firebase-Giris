package com.example.rehberprorami;

import android.content.ContentProvider;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.HashMap;

public class MyProvider extends ContentProvider {
    static final String PROVIDER_NAME ="com.example.rehberprorami.MyProvider";
    static final String URL = "content://"+PROVIDER_NAME+"/rehber";
    static final Uri CONTENT_URI = Uri.parse(URL);

    private VeriTabani veriTabani;
    private SQLiteDatabase database;

    static final String TABLE_NAME ="rehber";
    static final String ID ="id";
    static final String  AD ="ad";
    static final String TEL ="tel";

    private static HashMap<String,String> RehberMap;

    static final int REHBER = 1 ;
    static final int REHBER_PARAMETRE = 2 ;

    static final UriMatcher uriMatcher;

    static {
        uriMatcher = new UriMatcher(UriMatcher.NO_MATCH);
        uriMatcher.addURI(PROVIDER_NAME,"rehber",REHBER);
        uriMatcher.addURI(PROVIDER_NAME,"rehber/*",REHBER_PARAMETRE);
    }

    @Override
    public boolean onCreate() {
        Context context = getContext();

        veriTabani = new VeriTabani(context);
        database = veriTabani.getReadableDatabase();
        if(database == null){
            return  false;
        }else{
            return true;
        }
    }
    @Nullable
    @Override
    public Cursor query(@NonNull Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder) {
        SQLiteQueryBuilder queryBuilder = new SQLiteQueryBuilder();
        queryBuilder.setTables(TABLE_NAME);

        switch (uriMatcher.match(uri)){
            case REHBER:
                queryBuilder.setProjectionMap(RehberMap);
                break;
            case REHBER_PARAMETRE:
                queryBuilder.appendWhere(ID+"="+uri.getLastPathSegment());
                break;
            default:
                throw new IllegalArgumentException("bilinmeyen URI"+uri);
        }
        Cursor cursor = queryBuilder.query(database,projection,selection,selectionArgs,null,null,ID);
        cursor.setNotificationUri(getContext().getContentResolver(),uri);
        return cursor;
    }

    @Nullable
    @Override
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues values) {
        long row = database.insert(TABLE_NAME,"",values);

        if( row > 0){
            Uri newUri = ContentUris.withAppendedId(CONTENT_URI,row);
            getContext().getContentResolver().notifyChange(newUri,null);
            return newUri;
        }
           throw new SQLException("Yeni kayıt oluşturma hatası "+uri);
    }

    @Override
    public int delete(@NonNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs) {

        int count = 0 ;
        switch (uriMatcher.match(uri)) {
            case REHBER:
                count = database.delete(TABLE_NAME, selection, selectionArgs);
                break;
            case REHBER_PARAMETRE:
                count = database.delete(TABLE_NAME, ID + "=" + uri.getLastPathSegment(), selectionArgs);
                break;
            default:
                throw new IllegalArgumentException("bilinmeyen URI" + uri);
        }
           getContext().getContentResolver().notifyChange(uri,null);

                return count;
    }

    @Override
    public int update(@NonNull Uri uri, @Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs) {
        int count1;
        count1 = 0;
        switch (uriMatcher.match(uri)) {
            case REHBER:
                count1 = database.update(TABLE_NAME, values,selection,selectionArgs);
                break;
            case REHBER_PARAMETRE:
                count1 = database.update(TABLE_NAME,values,ID + "=" + uri.getLastPathSegment(),selectionArgs);
                break;
            default:
                throw new IllegalArgumentException("bilinmeyen URI" + uri);
        }
        getContext().getContentResolver().notifyChange(uri,null);

        return count1;
    }
}
