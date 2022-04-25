package com.example.serviscalismasi;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyServis extends Service {
    private Handler handler;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        handler = new Handler();
        handler.postDelayed(runnable,5000);
        Toast.makeText(this,"Servis çalışmaya başladı",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroy() {
        Toast.makeText(this,"Servis durdu",Toast.LENGTH_SHORT).show();
        handler.removeCallbacks(runnable);
    }
    private  final Runnable runnable = new  Runnable(){

        public void run(){
            Toast.makeText(MyServis.this,"Servis çalışmaya devam ediyor",Toast.LENGTH_SHORT).show();

            MyServis.this.handler.postDelayed(runnable,5000);
            

        }


    };
}
