 package com.example.TimeDatePicker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import java.util.Calendar;

 public class MainActivity extends AppCompatActivity {
     private EditText saat, tarih;


     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         saat = findViewById(R.id.saat);
         tarih = findViewById(R.id.tarih);

         saat.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Calendar takvim = Calendar.getInstance();
                 int zaman = takvim.get(Calendar.HOUR_OF_DAY);
                 int dakika = takvim.get(Calendar.MINUTE);
                 TimePickerDialog time;

                 time = new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
                     @Override
                     public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                         saat.setText(hourOfDay+" : "+minute);
                     }
                 },zaman,dakika,true);
             time.setTitle("Saat Seçiniz");
             time.setButton(DialogInterface.BUTTON_POSITIVE,"Ayarla",time);
             time.setButton(DialogInterface.BUTTON_NEGATIVE,"İptal",time);
             time.show();

             }
         });

         tarih.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Calendar takvim = Calendar.getInstance();
                 int yil = takvim.get(Calendar.YEAR);
                 int ay = takvim.get(Calendar.MONTH);
                 int gun = takvim.get(Calendar.DAY_OF_MONTH);
                 DatePickerDialog date;
                 date = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                     @Override
                     public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                         tarih.setText(year+"/"+month+"/"+dayOfMonth);
                     }
                 },yil,ay,gun);
                 date.setTitle("Tarihi Belirleyin");
                 date.setButton(DialogInterface.BUTTON_POSITIVE,"Ayarlar",date);
                 date.setButton(DialogInterface.BUTTON_NEGATIVE,"İptal",date);
                 date.show();


             }
         });


     }

 }