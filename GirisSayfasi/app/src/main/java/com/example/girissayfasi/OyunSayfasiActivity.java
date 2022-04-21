package com.example.girissayfasi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class OyunSayfasiActivity extends AppCompatActivity {
    private ConstraintLayout cont;
    private TextView textViewSkor, textViewBasla;
    private ImageView imageViewAdam;
    private ImageView imageViewYesil;
    private ImageView imageViewSari;
    private ImageView imageViewTuruncu;
    private ImageView imageViewMavi;

    //Yön tayin etmek
    private int anakarakterX;
    private int anakarakterY;
    private int imageViewYesilX;
    private int imageViewYesilY;
    private int imageViewSariX;
    private int imageViewSariY;
    private int imageViewTuruncuX;
    private int imageViewTuruncuY;
    private int imageViewMaviX;
    private int imageViewMaviY;
    //Hızları Tanımlama
    private int imageViewTuruncuHız;
    private int imageViewMaviHız;
    private int imageViewSariHız;
    private int imageViewYesilHız;
    private int imageAdamHız;

    //Kontroller
    private boolean dokunmaKontrol = false;
    private boolean baslangicKontrol = false;
    private Timer timer = new Timer();
    private Handler handler = new Handler();
    /// Skor
    private int skor = 0;

    //Boyutlama
    private int ekranGenisligi;
    private int ekranYuksekligi;
    private int adamGenisligi;
    private int adamYuksekligi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oyun_sayfasi);
        textViewSkor = findViewById(R.id.textViewSkor);
        textViewBasla = findViewById(R.id.textViewBasla);

        imageViewAdam = findViewById(R.id.imageViewAdam);
        imageViewYesil = findViewById(R.id.imageViewYesil);
        imageViewSari = findViewById(R.id.imageViewSari);
        imageViewTuruncu = findViewById(R.id.imageViewTuruncu);
        imageViewMavi = findViewById(R.id.imageViewMavi);
        cont = findViewById(R.id.cont);
        imageViewYesil.setX(-80);
        imageViewYesil.setY(-80);
        imageViewSari.setX(-80);
        imageViewSari.setY(-80);
        imageViewTuruncu.setX(-80);
        imageViewTuruncu.setY(-80);
        imageViewMavi.setX(-80);
        imageViewMavi.setY(-80);


        cont.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("ClickableViewAccessibility")
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (baslangicKontrol) {
                    if (event.getAction() == MotionEvent.ACTION_DOWN) {
                        Log.e("ACTION_DOWN", "Çalıştı");
                        dokunmaKontrol = true;
                    }
                    if (event.getAction() == MotionEvent.ACTION_UP) {
                        Log.e("ACTION_UP", "Çalıştı");
                        dokunmaKontrol = false;
                    }
                } else {
                    baslangicKontrol = true;

                    textViewBasla.setVisibility(View.INVISIBLE);
                    anakarakterX = (int) imageViewAdam.getX();
                    anakarakterY = (int) imageViewAdam.getY();

                    adamGenisligi = imageViewAdam.getWidth();
                    adamYuksekligi = imageViewAdam.getHeight();
                    ekranGenisligi = cont.getWidth();
                    ekranYuksekligi = cont.getHeight();


                    timer.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    anaKarakterHareketEttirme();
                                    cisimleriHareketEttir();
                                    carpısmaKontrol();

                                }
                            });

                        }
                    }, 0, 20);


                }

                return true;
            }
        });


    }

    public void anaKarakterHareketEttirme() {
        imageAdamHız = Math.round(ekranYuksekligi / 60);

        if (dokunmaKontrol) {
            anakarakterY -= imageAdamHız;
        } else {
            anakarakterY += imageAdamHız;
        }
        if (anakarakterY <= 0) {
            anakarakterY = 0;
        }
        if (anakarakterY >= ekranYuksekligi - adamYuksekligi) {
            anakarakterY = ekranYuksekligi - adamYuksekligi;
        }
        imageViewAdam.setY(anakarakterY);
    }

    public void cisimleriHareketEttir() {

        imageViewYesilHız = Math.round(ekranGenisligi / 65);
        imageViewMaviHız = Math.round(ekranGenisligi / 50);
        imageViewTuruncuHız = Math.round(ekranGenisligi / 45
        );
        imageViewSariHız = Math.round(ekranGenisligi / 55);

        imageViewYesilX -= imageViewYesilHız;
        if (imageViewYesilX < 0) {
            imageViewYesilX = ekranGenisligi + 20;
            imageViewYesilY = (int) Math.floor(Math.random() * ekranYuksekligi);
        }
        imageViewYesil.setX(imageViewYesilX);
        imageViewYesil.setY(imageViewYesilY);

        imageViewMaviX -= imageViewMaviHız;
        if (imageViewMaviX < 0) {
            imageViewMaviX = ekranGenisligi + 20;
            imageViewMaviY = (int) Math.floor(Math.random() * ekranYuksekligi);
        }
        imageViewMavi.setX(imageViewMaviX);
        imageViewMavi.setY(imageViewMaviY);

        imageViewSariX -= imageViewSariHız;
        if (imageViewSariX < 0) {
            imageViewSariX = ekranGenisligi + 20;
            imageViewSariY = (int) Math.floor(Math.random() * ekranYuksekligi);
        }
        imageViewSari.setX(imageViewSariX);
        imageViewSari.setY(imageViewSariY);

        imageViewTuruncuX -= imageViewTuruncuHız;
        if (imageViewTuruncuX < 0) {
            imageViewTuruncuX = ekranGenisligi + 20;
            imageViewTuruncuY = (int) Math.floor(Math.random() * ekranYuksekligi);
        }
        imageViewTuruncu.setX(imageViewTuruncuX);
        imageViewTuruncu.setY(imageViewTuruncuY);

    }

    public void carpısmaKontrol() {

        int maviMerkezX = imageViewMaviX + imageViewMavi.getWidth() / 2;
        int maviMerkezY = imageViewMaviY + imageViewMavi.getHeight() / 2;

        if (0 <= maviMerkezX && maviMerkezX <= adamGenisligi
                && anakarakterY <= maviMerkezY && maviMerkezY <= anakarakterY + adamYuksekligi) {
            skor -= 10;
            imageViewMaviX = -10;
        }
        int turuncuMerkezX = imageViewTuruncuX + imageViewTuruncu.getWidth() / 2;
        int turuncuMerkezY = imageViewTuruncuY + imageViewTuruncu.getHeight() / 2;

        if (0 <= turuncuMerkezX && turuncuMerkezX <= adamGenisligi
                && anakarakterY <= turuncuMerkezY && turuncuMerkezY <= anakarakterY + adamYuksekligi) {
            skor += 50;
            imageViewTuruncuX = -10;
        }
        int sariMerkezX = imageViewSariX + imageViewSari.getWidth() / 2;
        int sariMerkezY = imageViewSariY + imageViewSari.getHeight() / 2;

        if (0 <= sariMerkezX && sariMerkezX <= adamGenisligi
                && anakarakterY <= sariMerkezY && sariMerkezY <= anakarakterY + adamYuksekligi) {
            skor += 20;
            imageViewSariX = -10;
        }
        int yesilMerkezX = imageViewYesilX + imageViewYesil.getWidth() / 2;
        int yesilMerkezY = imageViewYesilY + imageViewYesil.getHeight() / 2;

        if (0 <= yesilMerkezX && yesilMerkezX <= adamGenisligi
                && anakarakterY <= yesilMerkezY && yesilMerkezY <= anakarakterY + adamYuksekligi) {

            imageViewYesilX = -10;
            timer.cancel();
            timer=null;

            Intent intent = new Intent(OyunSayfasiActivity.this,SonucSayfasiActivity.class);
            intent.putExtra("SkorKod","skor");
            startActivity(intent);

        }
        textViewSkor.setText(String.valueOf(skor));
    }
}