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
        Scanner sc= new Scanner(System.in);
        System.out.println("ingrese marca");
        String brandSave =sc.nextLine();
        System.out.println("ingrese placas");
        String plateSave =sc.nextLine();
        System.out.println("ingrese su ID");
        int idSave = Integer.parseInt(sc.nextLine());
        System.out.println("si eres afiliado, escribe si, de lo contrario no");
        String afiliateSave = sc.nextLine();
        boolean checkAfiliate=false;
        if(afiliateSave=="si"){
        
            boolean chekAfiliate=true;
        }else{
        
            boolean chekAfiliate=false;
        }
     
        Person costumer = new Person(idSave,checkAfiliate);
        Car mafe =new Car(plateSave,brandSave,costumer);
        Car molano= new Car("dxadfaeg","Xdagagadg",costumer);
        Car mario= new Car("dx","Xd",costumer);
        Car pau= new Car("lol","Xd",costumer);
        Car cata= new Car("zzzz","Xd",costumer);
        Car santiago= new Car("xxx","Xd",costumer);
        Car jax= new Car("maint","Xd",costumer);
        Car ate= new Car("tra","Xd",costumer);
        Car teo= new Car("buco","Xd",costumer);
        Car juan= new Car("prr","Xd",costumer);
        
        
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
        
        System.out.println(newParking.getParkingList().toString());
        //System.out.println(newParking.getParkingList().find(5).getPrevious().getValue());
        Node current=newParking.getParkingList().getFirst();
        for(int i=0;i<10;i++){
        
            System.out.println(current.getValue());
            current=current.getPrevious();
                    
        }
        
        
    }
}
