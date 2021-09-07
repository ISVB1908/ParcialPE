/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcialparking;

import com.mycompany.classes.Car;
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
        Car molano= new Car("dx","Xd",costumer);
        newParking.addCarro(mafe);
        newParking.addCarro(molano);
        System.out.println(newParking.getParkingList().toString());
        
        
    }
}
