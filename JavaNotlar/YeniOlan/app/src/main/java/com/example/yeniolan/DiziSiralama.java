package com.example.yeniolan;

import java.sql.Array;
import java.util.Arrays;

public class DiziSiralama {
public static void main(String args[]){
    String isimler [] ={"Kader","Ali","Sevinç","Musa","Bahar","Fatma"};
    for(String z :isimler){
        System.out.println(z);
    }
    Arrays.sort(isimler);
    for(String c : isimler){
        System.out.println(c);
    }



}




}

