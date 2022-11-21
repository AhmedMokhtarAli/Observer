/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.observer;

import java.util.ArrayList;

/**
 *
 * @author Ahmed Mokhter
 */
public class WorkStation implements Observable {
    private int temprature;
    private ArrayList<IObserver> observers=new ArrayList<>();
   
    public WorkStation(int temprature)
    {
        this.temprature=temprature;
    }
    
    @Override
    public void add(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(IObserver observer : this.observers)
        {
            observer.update();
        }
    }

   public int getTemprature()
   {
       return this.temprature;
   }

    public void setTemprature(int temprature) {
        this.temprature = temprature;
    }
    
}
