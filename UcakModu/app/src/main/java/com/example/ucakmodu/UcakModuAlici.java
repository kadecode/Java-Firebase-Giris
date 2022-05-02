package com.example.ucakmodu;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class UcakModuAlici extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Uçak Modu Çalıştı",Toast.LENGTH_SHORT).show();
    }
}