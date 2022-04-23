package com.example.notuygulamasi;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NotlaraAdapter extends RecyclerView.Adapter<NotlaraAdapter.CardTasarimTutucu> {
    private Context mContext;
    private List<Notlar> notlarList;

    public NotlaraAdapter(Context mContext, List<Notlar> notlarList) {
        this.mContext = mContext;
        this.notlarList = notlarList;
    }

    @NonNull
    @Override
    public CardTasarimTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_tadarim,parent,false);
        return new  CardTasarimTutucu(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardTasarimTutucu holder, int position) {
        final Notlar not = notlarList.get(position);
        holder.textViewDersAd.setText(not.getDers_adi());
        holder.textViewNot1.setText(String.valueOf(not.getNot1()));
        holder.textViewNot2.setText(String.valueOf(not.getNot2()));

        holder.not_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,DetayActivity.class);
                intent.putExtra("nesne",not);
                mContext.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return notlarList.size();
    }

    public class CardTasarimTutucu extends RecyclerView.ViewHolder {
        private TextView textViewDersAd;
        private TextView textViewNot1;
        private TextView textViewNot2;
        private CardView not_card;

        public CardTasarimTutucu(@NonNull View itemView) {
            super(itemView);
            textViewDersAd = itemView.findViewById(R.id.textViewDersAd);
            textViewNot1 = itemView.findViewById(R.id.textViewNot1);
            textViewNot2 = itemView.findViewById(R.id.textViewNot2);
            not_card = itemView.findViewById(R.id.not_card);


        }
    }
}
