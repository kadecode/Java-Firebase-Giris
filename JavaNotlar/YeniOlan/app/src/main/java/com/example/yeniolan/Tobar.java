package com.example.yeniolan;

import android.widget.Switch;

import java.util.Scanner;

public class Tobar {
    public static void main(String args[]){
        Scanner konsol = new Scanner(System.in);

        System.out.println("(1) Sil");
        System.out.println("(2) Güncelle");
        System.out.println("(3) Yedekle");

        int tercih = konsol.nextInt();
        switch (tercih){
            case 1 :
                System.out.println("Verileri silindi");
                break;
            case 2 :
                System.out.println("Günlenme yapıldı");
                break;
            case 3 :
                System.out.println("Yedekleme yapıldı");
                break;
            default:
                System.out.println("Böyle bir tercih yok");
                break;
        }






    }
}
