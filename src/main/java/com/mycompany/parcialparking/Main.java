/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcialparking;

import com.mycompany.classes.Car;
import com.mycompany.classes.Node;
import com.mycompany.classes.Parking;
import com.mycompany.classes.Person;
import java.util.Scanner;

/**
 *
 * @author vasqu
 */
public class Main {
    public static void main(String[] args) {
        Parking newParking = new Parking();
        //Scanner sc= new Scanner(System.in);
        //System.out.println("ingrese marca");
        //String brandSave =sc.nextLine();
        //System.out.println("ingrese placas");
        //String plateSave =sc.nextLine();
        //System.out.println("ingrese su ID");
        //int idSave = Integer.parseInt(sc.nextLine());
        //System.out.println("si eres afiliado, escribe si, de lo contrario no");
        //String afiliateSave = sc.nextLine();
        //boolean checkAfiliate=false;
        //if(afiliateSave=="si"){
        
            //boolean chekAfiliate=true;
        //}else{
        
            //boolean chekAfiliate=false;
        //}
     //create
        Person costumer = new Person(123,true);
        Car mafe =new Car("1","1",1,0,costumer);
        Car molano= new Car("2","2",1,0,costumer);
        Car mario= new Car("3","3",1,0,costumer);
        Car pau= new Car("4","4",1,0,costumer);
        Car cata= new Car("5","5",1,0,costumer);
        Car santiago= new Car("6","6",1,0,costumer);
        Car jax= new Car("7","7",1,0,costumer);
        Car ate= new Car("8","8",1,0,costumer);
        Car teo= new Car("9","9",1,0,costumer);
        Car juan= new Car("10","10",1,0,costumer);
        Car xd= new Car("11","11",1,0,costumer);
        
        //add
        newParking.addCarro(mafe);
        newParking.addCarro(molano);
        newParking.addCarro(mario);
        newParking.addCarro(pau);
        newParking.addCarro(cata);
        newParking.addCarro(santiago);
        newParking.addCarro(jax);
        newParking.addCarro(ate);
        newParking.addCarro(teo);
        newParking.addCarro(juan);
        
        newParking.deleteCarro("1",2,1);
        //newParking.deleteCarro("5");
        //newParking.deleteCarro("7");
        
        newParking.addCarro(xd);
        
        newParking.addCarro(cata);
        System.out.println(newParking.getLocation().getValue());
        //print
        System.out.println(newParking.getParkingList().toString());
        //System.out.println(newParking.getParkingList().find(5).getPrevious().getValue());
        //Node current=newParking.getParkingList().getFirst();
        //for(int i=0;i<10;i++){
        
            //System.out.println(current.getValue());
            //current=current.getPrevious();
                    
        //}
        
        
    }
}
