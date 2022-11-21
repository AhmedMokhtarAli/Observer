/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.observer;

import java.util.Scanner;

/**
 *
 * @author Ahmed Mokhter
 */
public class Observer {

    public static void main(String[] args) {
       WorkStation station=new WorkStation(12);
       Phone samsung=new Phone(station);
       
       station.add(samsung);
       
       for(int i=0;i<10;i++){
       System.out.print("Enter Temprature : ");
       Scanner sc=new Scanner(System.in);
       int num =sc.nextInt();
       station.setTemprature(num);
       samsung.disPlayTemp();
       }
       

    }
}
