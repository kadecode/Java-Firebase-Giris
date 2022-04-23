package com.example.collestionscalismasi;

import java.util.ArrayList;
import java.util.Scanner;

public class Odev2 {
public static void main(String args[]){

    ArrayList<String> isimler = new ArrayList<>();

    isimler.add("Binnaz");
    isimler.add("Nazlı");
    isimler.add("Ebru");
    isimler.add("Mustafa");
    isimler.add("Salih");

    Scanner k = new Scanner(System.in);
    System.out.print("Aranacak ismi girin");
    String isim = k.next();

    for(String s:isimler){
        if(s.equalsIgnoreCase(isim));
           System.out.print("İsim mevcut");
           break;

    }




}


}
