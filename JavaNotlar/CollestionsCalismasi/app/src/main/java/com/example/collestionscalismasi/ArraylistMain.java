package com.example.collestionscalismasi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraylistMain {
    public static void main(String args[]){
        ArrayList<String> meyveler = new ArrayList<>();
        meyveler.add("Ejdarha meyvesi");
        meyveler.add("Ezgi");
        meyveler.add("momo");
        meyveler.add("kedi otu");


        System.out.println("Boyut :"+meyveler.size());
        System.out.println(meyveler.get(1));
        //meyveler.remove(3);
        meyveler.add(1,"lahana");
        meyveler.set(4,"kaka");
        Collections.sort(meyveler);

        for(String s:meyveler){
            System.out.print(s +"-");
        }







    }
}
