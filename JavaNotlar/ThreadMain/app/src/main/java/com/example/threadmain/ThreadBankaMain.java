package com.example.threadmain;

public class ThreadBankaMain {

    public static void main(String args[]){
        Banka b = new Banka(800);
        BankaIslemThread is1 = new BankaIslemThread(b,"Momo",300);
        BankaIslemThread is2 = new BankaIslemThread(b,"Ezgi",400);
        is1.start();
        is2.start();




    }

     static class BankaIslemThread extends Thread{
        private Banka b;
        private String isim;
        private  int tutar;

         public BankaIslemThread() {
         }

         public BankaIslemThread(Banka b, String isim, int tutar) {
             this.b = b;
             this.isim = isim;
             this.tutar = tutar;
         }

         @Override
         public void run() {

         }
     }

}
