package com.example.nesneletabanli2;

public class CastingMain {
    public static void main(String args[]){

        Tesla tesla = new Tesla();
        Araba araba = tesla;


        Araba araba1 = new Araba();

        Tesla tesla1 = (Tesla) araba1;






    }


}
