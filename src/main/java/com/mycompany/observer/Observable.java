/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.observer;

/**
 *
 * @author Ahmed Mokhter
 */
public interface Observable {
    public void add(IObserver observer);
    public void remove(IObserver observer);
    public void notifyObservers();
}
