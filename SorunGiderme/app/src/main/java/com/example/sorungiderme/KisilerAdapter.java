package com.example.sorungiderme;


import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;

import com.google.android.material.snackbar.Snackbar;

import java.util.List;
import java.util.Objects;

public class KisilerAdapter extends Adapter<KisilerAdapter.CartTasarimTutucu>{
    private Context mContext;
    private List<Kisiler> kisilerList;

    public KisilerAdapter(Context mContext, List<Kisiler> kisilerList) {
        this.mContext = mContext;
        this.kisilerList = kisilerList;
    }

    @NonNull
    @Override
    public CartTasarimTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.kisikart_tasarim,parent,false);
        return new CartTasarimTutucu(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CartTasarimTutucu holder, int position) {
        Kisiler moMo = kisilerList.get(position);

        holder.Kisibilgi.setText(moMo.getKisi_ad()+"/"+moMo.getKisi_tel());

        holder.imageViewNot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               final PopupMenu popupMenu = new PopupMenu(mContext,holder.imageViewNot);
                popupMenu.getMenuInflater().inflate(R.menu.popup_menu,popupMenu.getMenu());
                popupMenu.show();

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){
                            case R.id.action_sil:
                                Snackbar.make(Objects.requireNonNull(holder).imageViewNot,"Sil Tıklandı",Snackbar.LENGTH_SHORT).show();
                            case R.id.action_duzenle:
                                alertTasarim();
                                return true;
                            default:
                                return false;
                        }
                    }
                });
                popupMenu.show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return kisilerList.size();
    }

    public class CartTasarimTutucu extends RecyclerView.ViewHolder{
        private TextView Kisibilgi;
        private ImageView imageViewNot;
        private View view;

        public CartTasarimTutucu(@NonNull View itemView) {
            super(itemView);
            this.Kisibilgi = Kisibilgi;
            this.imageViewNot = imageViewNot;
            this.view = view;
        }
    }
    public void alertTasarim(){
        LayoutInflater inflater = LayoutInflater.from(mContext);
       View tasarım = inflater.inflate(R.layout.alert_tasarim,null);

        final EditText isimEkle = tasarım.findViewById(R.id.isimEkle);
        final EditText telNumarasi = tasarım.findViewById(R.id.telNumarasi);

        AlertDialog.Builder momo = new AlertDialog.Builder(mContext);
        momo.setTitle("Kişi Güncelle");
        momo.setView(tasarım);
        momo.setPositiveButton("Güncelle", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String kisi_ad;
                kisi_ad = isimEkle.getText().toString().trim();
                String kisi_tel;
                kisi_tel = telNumarasi.getText().toString().trim();

                Toast.makeText(mContext, kisi_ad + "-" + kisi_tel, Toast.LENGTH_SHORT).show();


            }
        }).setNegativeButton("İptal", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        momo.create().show();

    }

}
