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
import javax.swing.JOptionPane;

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
        Car mafe =new Car("1","1",1,0,1,1,1,costumer);
        Car molano= new Car("2","2",1,0,1,1,1,costumer);
       Car mario= new Car("3","3",1,0,1,1,1,costumer);
        Car pau= new Car("4","4",1,0,1,1,1,costumer);
        Car cata= new Car("5","5",1,0,1,1,1,costumer);
        Car santiago= new Car("6","6",1,0,1,1,1,costumer);
        Car jax= new Car("7","7",1,0,1,1,1,costumer);
        Car ate= new Car("8","8",1,0,1,1,1,costumer);
        Car teo= new Car("9","9",1,0,1,1,1,costumer);
        Car juan= new Car("10","10",1,0,1,1,1,costumer);
        Car xd= new Car("11","11",1,0,1,1,1,costumer);
        
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
        
        //newParking.deleteCarroID(123,2,1);
        //newParking.deleteCarroID(123,2,1);
        //newParking.deleteCarroID(123,2,1);
        
       // newParking.addCarro(xd);
        
        //newParking.addCarro(cata);
        //System.out.println(newParking.getLocation().getValue());
        //print
        System.out.println(newParking.getParkingList().toString());
        //System.out.println(newParking.getParkingList().find(5).getPrevious().getValue());
        //Node current=newParking.getParkingList().getFirst();
        //for(int i=0;i<10;i++){
        
            //System.out.println(current.getValue());
            //current=current.getPrevious();
                    
        //}
        int input =-1;
        do{
        
            JOptionPane.showMessageDialog(null,"1.Enter to the parking \n2.Salida por placas \n3.Salida por placas");
            input=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
            while(input>3 || input<0){
                input=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
            }
            switch(input){
            
                case 1:
                    //add
                    String addPlate=JOptionPane.showInputDialog("Digite las placas:");
                    String addBrand=JOptionPane.showInputDialog("Digite las brand:");
                    int addEnterHour=Integer.parseInt(JOptionPane.showInputDialog("Digite la hora de entrada al parqueadero(0-23):"));
                    while(addEnterHour>23 || addEnterHour<0){
                    
                        addEnterHour=Integer.parseInt(JOptionPane.showInputDialog("Digite la hora de entrada al parqueadero(0-23):"));
                    }
                    int addEnterMin=Integer.parseInt(JOptionPane.showInputDialog("Digite el minuto de entrada al parqueadero(0-59):"));
                    while(addEnterMin>59 || addEnterMin<0){
                    
                        addEnterMin=Integer.parseInt(JOptionPane.showInputDialog("Digite el minuto de entrada al parqueadero(0-59):"));
                    }
                    //
                    int diaEnter=Integer.parseInt(JOptionPane.showInputDialog("Digite el dia de entrada al parqueadero(1-31):"));
                    while(diaEnter<1 || diaEnter>31){
                    
                        diaEnter=Integer.parseInt(JOptionPane.showInputDialog("Digite el dia de entrada al parqueadero(1-31):"));
                    }
                    int mesEnter=Integer.parseInt(JOptionPane.showInputDialog("Digite el mes de entrada al parqueadero(1-12):"));
                    while(mesEnter<1 || mesEnter>12){
                    
                        mesEnter=Integer.parseInt(JOptionPane.showInputDialog("Digite el mes de entrada al parqueadero(1-12):"));
                    }
                    int anioEnter=Integer.parseInt(JOptionPane.showInputDialog("Digite el anio de entrada al parqueadero:"));
                    //
                    int addId=Integer.parseInt(JOptionPane.showInputDialog("Digite su ID:"));
                    String addAfiliate=JOptionPane.showInputDialog("Si es afiliado escriba si, de lo contrario no(minuscula):");
                    String si="si";
                    String no="no";
                    boolean verfyS=addAfiliate.equals(si);
                    boolean veryfyN=addAfiliate.equals(no);
                    while(verfyS==false && veryfyN==false){
                    
                        addAfiliate=JOptionPane.showInputDialog("Si es afiliado escriba si, de lo contrario no:");
                        si="si";
                        no="no";
                        verfyS=addAfiliate.equals(si);
                        veryfyN=addAfiliate.equals(no);
                    }
                    boolean afi=false;
                    if(verfyS==true){
                    
                        afi=true;
                    }else if(veryfyN==true){
                    
                        afi=false;
                    }
                    Person costumerr = new Person(addId,afi);
                    Car nuevoCarro = new Car(addBrand,addPlate,addEnterHour,addEnterMin,anioEnter,mesEnter,diaEnter,costumerr);
                    newParking.addCarro(nuevoCarro);
                    System.out.println(nuevoCarro.toString());
                    System.out.println(newParking.getParkingList().toString());
                    
                    break;
                case 2:
                    //deletePlate
                    String deletePlate=JOptionPane.showInputDialog("Digite las placas:");
                    int hourExitt=Integer.parseInt(JOptionPane.showInputDialog("Digite la hora de entrada al parqueadero(0-23):"));
                    while(hourExitt>23 || hourExitt<0){
                    
                        hourExitt=Integer.parseInt(JOptionPane.showInputDialog("Digite la hora de entrada al parqueadero(0-23):"));
                    }
                    int minExitt=Integer.parseInt(JOptionPane.showInputDialog("Digite el minuto de entrada al parqueadero(0-59):"));
                    while(minExitt>59 || minExitt<0){
                    
                        minExitt=Integer.parseInt(JOptionPane.showInputDialog("Digite el minuto de entrada al parqueadero(0-59):"));
                    }
                    int diaDelete=Integer.parseInt(JOptionPane.showInputDialog("Digite el dia de entrada al parqueadero(1-31):"));
                    while(diaDelete<1 || diaDelete>31){
                    
                        diaDelete=Integer.parseInt(JOptionPane.showInputDialog("Digite el dia de entrada al parqueadero(1-31):"));
                    }
                    int mesDelete=Integer.parseInt(JOptionPane.showInputDialog("Digite el mes de entrada al parqueadero(1-12):"));
                    while(mesDelete<1 || mesDelete>12){
                    
                        mesDelete=Integer.parseInt(JOptionPane.showInputDialog("Digite el mes de entrada al parqueadero(1-12):"));
                    }
                    int anioDelete=Integer.parseInt(JOptionPane.showInputDialog("Digite el anio de entrada al parqueadero:"));
                    newParking.deleteCarro(deletePlate,anioDelete,mesDelete,diaDelete,hourExitt,minExitt);
                    

                    break;


                case 3:
                    //idDelete
                    int deleteId=Integer.parseInt(JOptionPane.showInputDialog("Digite el id:"));
                    int hourExittI= Integer.parseInt(JOptionPane.showInputDialog("Digite la hora de salida (0-23):"));
                    int minExittI= Integer.parseInt(JOptionPane.showInputDialog("Digite el minuto(0-59):"));
                    int diaDeleteI=Integer.parseInt(JOptionPane.showInputDialog("Digite el dia de entrada al parqueadero(1-31):"));
                    while(diaDeleteI<1 || diaDeleteI>31){
                    
                        diaDeleteI=Integer.parseInt(JOptionPane.showInputDialog("Digite el dia de entrada al parqueadero(1-31):"));
                    }
                    int mesDeleteI=Integer.parseInt(JOptionPane.showInputDialog("Digite el mes de entrada al parqueadero(1-12):"));
                    while(mesDeleteI<1 || mesDeleteI>12){
                    
                        mesDeleteI=Integer.parseInt(JOptionPane.showInputDialog("Digite el mes de entrada al parqueadero(1-12):"));
                    }
                    int anioDeleteI=Integer.parseInt(JOptionPane.showInputDialog("Digite el anio de entrada al parqueadero:"));
                    newParking.deleteCarroID(deleteId,anioDeleteI,mesDeleteI,diaDeleteI,hourExittI,minExittI);
                    break;
                //case 4: 
                    //getlast
                    //try {
                        //if(list.getFirst()==null){
                            //JOptionPane.showMessageDialog(null,"emptyList");
                        //}else{
                        
                            //JOptionPane.showMessageDialog(null,"Node:"+list.getLast()+"\nName:"+list.getLast().getValue().getName()
                            //+"\nAge:"+list.getLast().getValue().getAge());
                        //}
                    
                    //} catch (HeadlessException ex) {
                        //Logger.getLogger(SList.class.getName()).log(Level.SEVERE, null, ex);
                    //}
                    //break;
            }
        }while(input!=0);
        
    }
}
