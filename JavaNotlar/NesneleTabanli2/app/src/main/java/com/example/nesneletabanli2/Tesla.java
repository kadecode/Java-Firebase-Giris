package com.example.nesneletabanli2;

public class Tesla extends Araba {

    private String motorHacmi;

    public  Tesla(){
        super();
        System.out.println("Tesla boş constructor çalıştı");

    }
    public Tesla(String motorHacmi){
        this.motorHacmi = motorHacmi;
        System.out.println("Tesla dolu constructor çalıştı");

    }

    public String getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(String motorHacmi) {
        this.motorHacmi = motorHacmi;
    }
}