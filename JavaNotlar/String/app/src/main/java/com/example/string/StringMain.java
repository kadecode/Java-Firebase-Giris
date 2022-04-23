package com.example.string;

public class StringMain {
    public static void main(String args[]){

        String s1 = "Merhaba Ali";
        System.out.println(s1.charAt(8));
        System.out.println(s1.length());
        System.out.println(s1.replace("a","g"));
        System.out.println(s1.substring(2,5));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.trim());
        String [] dizi = s1.split("");
        for(String s:dizi){
            System.out.println(s);

        }






    }
}
