package com.example.collestionscalismasi;

public class HashSet {

    public static void main(String args []){

        java.util.HashSet<Ogrenciler> nesneler = new java.util.HashSet<>();


        Ogrenciler o1 = new Ogrenciler("ahmet",1111);
        Ogrenciler o2 = new Ogrenciler("ayse",2222);
        Ogrenciler o3 = new Ogrenciler("sezen",3333);
        Ogrenciler o4 = new Ogrenciler("betül",4444);


        nesneler.add(o1);
        nesneler.add(o2);
        nesneler.add(o3);
        nesneler.add(o4);

        Ogrenciler o5 = new Ogrenciler("kamil",2222);

        nesneler.add(o5);

        for(Ogrenciler o :nesneler){
            System.out.println("<<<<<<<<<<<<<");
            System.out.println("Ögrenciler adı : "+o.getIsim());
            System.out.println("Ögrenciler no  : "+o.getOkulNo());
        }







    }




}
