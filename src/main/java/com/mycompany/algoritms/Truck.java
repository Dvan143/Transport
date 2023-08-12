package com.mycompany.algoritms;
public class Truck extends Vehicle{
    public Engine Eng;
    Truck(Engine Engine){
        Eng = Engine;
    }
    public void checkEngine(){
        if(Eng.isWork){
            System.out.println("Двигатель в рабочем состоянии");
        }else{
            System.out.println("Двигатель сломан");
        }
    }
    public void startEngine(){
        if(Eng.isWork){
            System.out.println("Двигатель заведён");
            while(Eng.temperature < 110 || Eng.pressure < 2.2){
                Timer1S();
                System.out.println("Температура двигателя: " + Eng.temperature);
                System.out.println("Давление двигателя: " + Eng.pressure);
                Eng.temperature += 25;
                Eng.pressure += 0.5;
            }
        }else{
            System.out.println("Двигатель не завёлся");
            System.exit(0);
        }
    }
    public double getPressEngine(){
        return Eng.pressure;
    }
    public int getTempEngine(){
        return Eng.temperature;
    }
    public String getModelEngine(){
        return Eng.model;
    }
    public void Timer1S(){
        try{
            Thread.sleep(1000); // Время в мс
            } catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
    }
}
