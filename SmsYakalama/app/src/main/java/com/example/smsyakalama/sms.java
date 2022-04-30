package com.example.smsyakalama;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.telephony.SmsMessage;
import android.widget.Toast;

public class sms extends BroadcastReceiver {
    SmsManager  sms = SmsManager.getDefault();
    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle b = intent.getExtras();

        Object [] pdusObj = (Object[]) b.get("pdus");
        for (int i = 0;i<pdusObj.length;i++){

            SmsMessage guncelMesaj = SmsMessage.createFromPdu((byte[]) pdusObj[i]);

            String telNo = guncelMesaj.getDisplayMessageBody();
            String mseaj = guncelMesaj.getDisplayOriginatingAddress();

            Toast.makeText(context,"Tel No : "+telNo+"Mesaj : "+mseaj,Toast.LENGTH_LONG).show();

        }



    }
}