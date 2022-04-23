package com.example.yeniolan;

import java.util.Scanner;

public class DonguUygulama {
    public static void main(String args[]){
        Scanner kolsol =new Scanner(System.in);
        System.out.println("İsminiz Giriniz:");
        String isim = kolsol.nextLine();

        System.out.println("Tekrarlanma miktarı giriniz:");
        int s1 = kolsol.nextInt();
        System.out.println("---------->");


        for(int s = 0 ;s < s1;s++){
            System.out.println(isim+"-->"+s);
        }

        int j = 0;
        while(j < s1){
            System.out.println(isim+"-->"+j);
            j +=1;
        }







    }
}
