package com.example.collestionscalismasi;

import java.util.HashSet;

public class HashSetMain {
   public static void main(String args[]){


       HashSet<String> meyveler = new HashSet<>();


       meyveler.add("elma");
       meyveler.add("nar");
       meyveler.add("kiraz");
       meyveler.add("armut");

       meyveler.remove("kiraz");
       for(String s : meyveler){
           System.out.print(s+"==");
       }


   }
}
