package com.example.string;

import java.util.Scanner;

public class TertenYaz {
public static void main(String args[]){

    Scanner k = new Scanner(System.in);

    System.out.println("Bir kelime giriniz!");
    String gKelime = k.next();
    int boy = gKelime.length();
    char [] dizi = new char[boy];
    for(int i = 0;i<boy ;i++){
        dizi[i] = gKelime.charAt(i);
    }
    for(int i = (boy -1);i>=0;i--){
        System.out.print(dizi[i]);
    }



}



}
