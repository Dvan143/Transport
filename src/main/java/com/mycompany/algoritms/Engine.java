package com.mycompany.algoritms;
public class Engine{
    /*
    void checkEngine();
    void startEngine();
    void getPress();
    void getTemp();
    */
    public String model;
    public int maxSpeed;
    public double pressure = 0.0;
    public int temperature = 0;
    public boolean isWork;
    
    Engine(String model, int maxSpeed, boolean isWork){
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.isWork = isWork;
    }
}
