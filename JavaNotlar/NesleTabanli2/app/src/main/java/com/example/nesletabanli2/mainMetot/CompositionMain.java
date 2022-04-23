package com.example.nesletabanli2.mainMetot;

import com.example.nesletabanli2.Sinifler.Adresler;
import com.example.nesletabanli2.Sinifler.Filmler;
import com.example.nesletabanli2.Sinifler.Kaegoriler;
import com.example.nesletabanli2.Sinifler.Kisiler;
import com.example.nesletabanli2.Sinifler.Yonetmenler;

public class CompositionMain {
    public static void main(String args[]){

      /*  Adresler adres = new Adresler("İstanbul","Esenler");
        Kisiler kisi1 = new Kisiler("Momo",455646,adres);


        System.out.println("Kişi isim  : " + kisi1.getIsim());
        System.out.println("Kişi tel   : " + kisi1.getTel());
        System.out.println("Kişi adres : " + kisi1.getAdres().getIl());
        System.out.println("Kişi adres : " + kisi1.getAdres().getIlce());
*/
        Kaegoriler kategori = new Kaegoriler(1, "Drama");
        Yonetmenler yonetmen = new Yonetmenler(2,"Yılmaz erdogan");
        Filmler film = new Filmler(10,"Vizontele",2007,kategori,yonetmen);

        System.out.println("Film id  : "+film.getFilm_id());
        System.out.println("Film ad  : "+film.getFilm_ad());
        System.out.println("Film yıl : "+film.getFilm_yİl());
        System.out.println("Film yönetmen : "+film.getYonetmen().getYonetmen_ad());
        System.out.println("Film kategori : "+film.getKategori().getKategori_ad());








    }
}
