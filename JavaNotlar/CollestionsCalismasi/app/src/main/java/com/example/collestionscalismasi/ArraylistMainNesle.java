package com.example.collestionscalismasi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraylistMainNesle {

     public static void main(String args[]){


         List<Momo> nesneler = new ArrayList<>();
         Momo m1 = new Momo(4444,"Elif");
         Momo m2 = new Momo(3333,"Hatice");
         Momo m3 = new Momo(2222,"Burcu");
         Momo m4 = new Momo(1111,"Azime");

         nesneler.add(m1);
         nesneler.add(m2);
         nesneler.add(m3);
         nesneler.add(m4);

         Collections.sort(nesneler);


         for(Momo m: nesneler){

             System.out.println("Ögrenciler tcno : "+m.getTc());
             System.out.println("Ögrenciler İsim : "+m.getIsim());
             System.out.println("===========");

         }









     }



}
