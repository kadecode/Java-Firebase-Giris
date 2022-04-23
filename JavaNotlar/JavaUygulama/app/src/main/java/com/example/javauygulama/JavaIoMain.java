package com.example.javauygulama;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaIoMain {
    public static void main(String args[]){

    //filewriteyaz();
    // filereadOku();
     //  bufferYaz();
        bufferOku();
    }
    public static void bufferOku(){
        try{
            File dosya = new File("C:\\Users\\Darkkong\\Desktop\\JavaNotlar\\dosyabuffer.txt");
            FileReader fr = new FileReader(dosya);
            BufferedReader okuyucu = new BufferedReader(fr);

            StringBuilder sb = new StringBuilder();
            String satir ="";
            while((satir = okuyucu.readLine()) != null){
                sb.append(satir+"\n");
            }
            okuyucu.close();
            System.out.println(sb.toString());




        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public static void bufferYaz(){
        try{
            File dosya = new File("C:\\Users\\Darkkong\\Desktop\\JavaNotlar\\dosyabuffer.txt");
            if(!dosya.exists()) {
                dosya.createNewFile();
            }
            FileWriter fw = new FileWriter(dosya);
            BufferedWriter yazici = new BufferedWriter(fw);
            yazici.write("tuza banıp yer giiri hıydilhgsişlnmksişlnms");
            yazici.flush();
            yazici.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }









    public static void filewriteyaz(){
        try{
            File dosya = new File("C:\\Users\\Darkkong\\Desktop\\JavaNotlar\\dosya.txt");
            if(!dosya.exists()) {
                dosya.createNewFile();
            }
            FileWriter yazici = new FileWriter(dosya);
             yazici.write("Selam Ezgi ");
             yazici.flush();
             yazici.close();


        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public  static void filereadOku() {
        try {

            File dosya = new File("C:\\Users\\Darkkong\\Desktop\\JavaNotlar\\dosya.txt");

            FileReader okuyucu = new FileReader(dosya);

            StringBuilder sp = new StringBuilder();
            int bilgi = 0;
            while ((bilgi = okuyucu.read()) != -1){
                sp.append((char)bilgi);
            }
            okuyucu.close();
            System.out.println("Okunan : "+sp.toString());

        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
