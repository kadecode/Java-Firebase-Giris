package com.example.nesneletabanli2;

public class Elma implements  Eatable,Squueezabel{
    @Override
    public void howToeat() {
        System.out.println("Yıka ve dilimliyerek ye");
    }

    @Override
    public void howToSqueeze() {
        System.out.println("Soy ve suyunu çıkar");

    }
}
