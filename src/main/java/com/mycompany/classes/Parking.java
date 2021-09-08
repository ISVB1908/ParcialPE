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
    private Node location;

    //constructor
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
    
    public Node getLocation() {
        return location;
    }

    public void setLocation(Node location) {
        this.location = location;
    }
    
    public void addCarro(Car p){
        Car carro=p;
        //saber si encontro o no
        
        //inicializar location
        if(location==null){
        location=parkingList.getFirst();
        }
        Node currentR=Parking.this.getLocation();
        int countR=0;
        while(countR<=5){
        
            if(currentR.getValue()==null || currentR.getValue()=="Empty"){

                break;
            }

            currentR=currentR.getNext();

            countR++;
        }
        
        
        Node currentL=Parking.this.getLocation();
        int countL=0;
        while(countL<=5){
            
            //si encuentra sale y confirma que no necesita buscar mas
            if(currentL.getValue()==null || currentL.getValue()=="Empty"){
               
            break;
            }
                //nodo anterior
             currentL=currentL.getPrevious();
                //conteo
            countL++;
        }
        if(countR==6 && countL==6){
        
            System.out.println("lista llena");
        }else if(countL>=countR){
        
            location=currentR;
            location.setValue(carro);
        }else{
        
            location=currentL;
            location.setValue(carro);
        }

    } 
    
    public void deleteCarro(String placaC,int  hex,int mex){
    
        Node deleteC=parkingList.getFirst();
        do{

            String compare=placaC;
            String placaV=deleteC.getValue().toString().split(",")[0];
            if(placaV.equals(compare)){
            
                //al supe como llamar la piche clase sin tener uqe hacer maromas con el toString
                //bueno ya serio vamos a averiguar  la hora
                Car carrito= (Car) deleteC.getValue();
                int he=carrito.getEnterHour();
                int me=carrito.getEnterMin();
                //int hex=carrito.getExitHour();
                //int mex=carrito.getExitMin();
                double facturaImpr=carrito.factura(he, me, hex, mex);
                System.out.println("su factura es de:"+facturaImpr);
                deleteC.setValue("Empty");
                location=deleteC;
                
                break;
                }
            
            
            deleteC=deleteC.getNext();
            
        }while(deleteC!=parkingList.getFirst());
        
    }
    
}
