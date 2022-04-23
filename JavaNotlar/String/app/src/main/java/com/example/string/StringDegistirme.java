package com.example.string;

public class StringDegistirme {
    public static void main(String args[]){

        String s1 = "Merhaba dünya";
        String s2 = s1 ;
        String s3 = "Merhaba dünya";

        String s6 = new String("Merhaba dünya");

        if(s1 == s3 ){
            System.out.println("Eşit");
        }else{
            System.out.println("Eşit  değil");
        }


        StringBuilder stringToplayıci = new StringBuilder();

        stringToplayıci.append("merhaba");
        stringToplayıci.append(" Dünya");

        System.out.println(stringToplayıci.toString());






    }
}
