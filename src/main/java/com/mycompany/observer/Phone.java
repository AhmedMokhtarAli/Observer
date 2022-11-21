/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.observer;

/**
 *
 * @author Ahmed Mokhter
 */
public class Phone implements IObserver {
    WorkStation station;
    private int temprature;
    public Phone(WorkStation station)
    {
        this.station=station;
    }
    @Override
    public void update() {
        temprature= this.station.getTemprature();
    }

    public void disPlayTemp() {
        Display.disPlayTemp(this.station.getTemprature());
        update();
    }
    
    
}
