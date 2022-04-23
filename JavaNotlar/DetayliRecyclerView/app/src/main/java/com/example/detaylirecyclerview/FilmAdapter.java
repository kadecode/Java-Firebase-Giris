package com.example.detaylirecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FilmAdapter extends RecyclerView.Adapter<FilmAdapter.CardViewTasarimNesneleriTutucu> {
     private Context context;
     private List<FilmSayfa> filmSayfaList;

    public FilmAdapter(Context context, List<FilmSayfa> filmSayfaList) {
        this.context = context;
        this.filmSayfaList = filmSayfaList;
    }
    public class CardViewTasarimNesneleriTutucu extends RecyclerView.ViewHolder{
        public ImageView imageViewAfis ;
        public TextView urunAd;
        public TextView fiyat;
        public Button sepeteEkle;

        public CardViewTasarimNesneleriTutucu(@NonNull View itemView) {
            super(itemView);
            imageViewAfis = itemView.findViewById(R.id.imageViewAfis);
            urunAd = itemView.findViewById(R.id.urunAd);
            fiyat = itemView.findViewById(R.id.fiyat);
            sepeteEkle = itemView.findViewById(R.id.sepeteEkle);

        }
    }

    @NonNull
    @Override
    public CardViewTasarimNesneleriTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_tasarim,parent,false);

        return new CardViewTasarimNesneleriTutucu(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewTasarimNesneleriTutucu holder, int position) {
       final FilmSayfa film = filmSayfaList.get(position);

        holder.urunAd.setText(film.getFilm_ad());
        holder.fiyat.setText(film.getFilm_fiyat()+"TL");

        holder.imageViewAfis.setImageResource(context.getResources().getIdentifier(film
                .getFilm_resim_ad(),"drawable",context.getPackageName()));
        holder.sepeteEkle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,film.getFilm_ad()+" sepete eklendi",Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {

        return filmSayfaList.size();
    }


}
