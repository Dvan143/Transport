package com.mycompany.algoritms;
public class Algoritms{
    
    public static void main(String []args){
        Engine RL40 = new Engine("RL40", 220, true);
        Engine RL80 = new Engine("RL80", 310, false);
        Engine TurboRL = new Engine("TurboRL", 160, true);

        Car BMW = new Car(RL40);
        Car Audi = new Car(RL80);
        Truck ZIL = new Truck(TurboRL);
        
        BMW.startEngine();
    }
}