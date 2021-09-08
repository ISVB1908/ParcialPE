/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.classes;

/**
 *
 * @author vasqu
 */
public class Car implements Comparable<Car> {
    
    private String brand;
    private String plate;
    private Person owner;
    private int enterHour;
    private int enterMin;
    private int exitHour;
    private int exitMin;

    //constructor
    public Car(String brand, String plate,int enterHour,int enterMin, Person owner) {
        this.brand = brand;
        this.plate = plate;
        this.owner = owner;
        this.enterHour=enterHour;
        this.enterMin=enterMin;
    }

    //getters and  setters
    
    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    @Override
    public int compareTo(Car o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String toString(){
       
        
        return plate+","+brand+","+owner.toString();
    }

    public int getEnterMin() {
        return enterMin;
    }

    public void setEnterMin(int enterMin) {
        this.enterMin = enterMin;
    }

    public int getExitMin() {
        return exitMin;
    }

    public void setExitMin(int exitMin) {
        this.exitMin = exitMin;
    }

    public int getEnterHour() {
        return enterHour;
    }

    public void setEnterHour(int enterHour) {
        this.enterHour = enterHour;
    }

    public int getExitHour() {
        return exitHour;
    }

    public void setExitHour(int exitHour) {
        this.exitHour = exitHour;
    }
    public double factura(int enterHour,int enterMin, int exitHour,int exitMin){
        
        int hoursPassed=exitHour-enterHour;
        int minPassed=exitMin-enterMin;
        if(minPassed>0){
        
            hoursPassed=hoursPassed+1;
        }
        double tarifa=3.500;
        double facturaP=tarifa*hoursPassed;
        return facturaP;
    }

 
    
}
