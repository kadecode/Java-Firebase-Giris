package com.example.collestionscalismasi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Odev1 {
public static void main(String args[]){
    ArrayList<Integer> sayilar = new ArrayList<>();

    Random uret = new Random();
    for( int i=0;i<100;i++) {
        int rasSayı = uret.nextInt(101);
        sayilar.add(rasSayı);
    }
    Collections.sort(sayilar);
    for(Integer i :sayilar){
        System.out.print(i+" ][ ");
    }



}
}
