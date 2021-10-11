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

    //constructor
    public Car(String brand, String plate,Person owner) {
        this.brand = brand;
        this.plate = plate;
        this.owner = owner;

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
 
    //corregir
    public double factura(int enteranio,int entermes,int enterdia,int enterHour,int enterMin,int exitanio,int exitmes,int exitdia, int exitHour,int exitMin){
        int anioPassed=exitanio-enteranio;
        int mesPassed=exitmes-entermes;
        int diasPassed=exitdia-enterdia;
        int hoursPassed=exitHour-enterHour;
        int minPassed=exitMin-enterMin;
        
        if(minPassed>0){
        
            hoursPassed=hoursPassed+1;
        }
        if(diasPassed>0){
        
            int pp=diasPassed;
            hoursPassed=hoursPassed+(pp*24);
        }
        if(mesPassed>0){
        
            int pp=mesPassed;
            hoursPassed=hoursPassed+(pp*24*31);
        }
        if(anioPassed>0){
        
            int pp=anioPassed;
            hoursPassed=hoursPassed+(pp*24*31*365);
        }
        double tarifa=3.500;
        double facturaP=tarifa*hoursPassed;
        return facturaP;
    }

}
