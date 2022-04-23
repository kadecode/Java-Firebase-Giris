package com.example.nesneletabanli2;

public class Equeals {
     public static void main(String Args []){
         Ogrenci e1 = new Ogrenci(55555, "Momo");
         Ogrenci e2 = new Ogrenci(44444, "Ezo");
         Ogrenci e3 = new Ogrenci(66666, "Kefgir");
         Ogrenci e4 = new Ogrenci(77777, "Momo");

         System.out.println(e1);
         System.out.println(e2);
         System.out.println(e3);
         System.out.println(e4);

         if(e1.equals(e1)){
             System.out.println("Eşit");
         }else{
             System.out.println("Esit değil");
         }




     }



}
