package com.example.recyclerviewkullanimi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.PopupMenu;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BasitRVAdapter1 extends RecyclerView.Adapter<BasitRVAdapter1.CardViewTasarimNesneliniTutucu> {
    private Context mContext;
    private List<String> ulkelerDisaridanGelenListe;

    public BasitRVAdapter1(Context mContext, List<String> ulkelerDisaridanGelenListe) {
        this.mContext = mContext;
        this.ulkelerDisaridanGelenListe = ulkelerDisaridanGelenListe;
    }

    public class CardViewTasarimNesneliniTutucu extends RecyclerView.ViewHolder{
        public TextView satirYazi;
        public CardView satirCardView;
        public ImageView noktaResim;

        public CardViewTasarimNesneliniTutucu(View view){
            super(view);
            satirYazi = view.findViewById(R.id.satirYazi);
            satirCardView = view.findViewById(R.id.satirCardView);
            noktaResim = view.findViewById(R.id.noktaResim);


        }
    }

    @NonNull
    @Override
    public CardViewTasarimNesneliniTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_tasarim,parent,false);
        return new CardViewTasarimNesneliniTutucu(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewTasarimNesneliniTutucu holder, int position) {
       final String ulke = ulkelerDisaridanGelenListe.get(position);

        holder.satirYazi.setText(ulke);

        holder.satirCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,"Şeçtiğiniz ülke :"+ulke,Toast.LENGTH_SHORT).show();
            }
        });
        holder.noktaResim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,"Resim :"+ulke,Toast.LENGTH_SHORT).show();
                PopupMenu popup = new PopupMenu(mContext,v);
                popup.getMenuInflater().inflate(R.menu.card_menu,popup.getMenu());
                popup.show();
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){
                            case R.id.action_sil:
                                Toast.makeText(mContext,"Sil Tıklanıldı . ",Toast.LENGTH_SHORT).show();
                                return true;
                            case R.id.action_düzenle:
                                Toast.makeText(mContext,"Düzenle Tıklanıldı : ",Toast.LENGTH_SHORT).show();
                                return true;
                            default:
                                return false;


                        }

                    }
                });

            }
        });

    }

    @Override
    public int getItemCount() {
        return ulkelerDisaridanGelenListe.size();
    }





}
