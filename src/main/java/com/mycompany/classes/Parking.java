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
public class Parking {
    //atributos
    private Structure<Car> parkingList;

    public Parking() {
        //crear el objeto del parqueadero
        parkingList=new Structure<Car>();
        for(int i=0;i<10;i++){
        
            Car slot=null;
            parkingList.add(slot);
        }
    }
    
    public Structure getParkingList() {
        return parkingList;
    }

    public void setParkingList(Structure<Car> ParkingList) {
        this.parkingList = ParkingList;
    }
    public void addCarro(Car p){
        
            Car carro= p;
            Node current=parkingList.getFirst();
            int count=0;
            while (count<10){
            
                count++;
                if(current.getValue()==null){
                
                    current.setValue(carro);
                    break;
                }
                current=current.getNext();
            }
        }
   
}
