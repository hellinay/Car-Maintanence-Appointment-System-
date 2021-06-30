package GUI;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author merte
 */
public class Motorcycle extends StandartVehicle{
   
    private int EngineCC;
    private static final double inspectionPrice = 174.64;
    private static final double discount = 0.98;

    public Motorcycle() {
    }

    public Motorcycle(int EngineCC, String firstAidKit, String fineStatus, double fine, String exhaustEmmission, String plate, String type, String brand, int year, int km, String fuelType, String city, String date, String time, String valletService, String preCheckService, double price, String repetition) {
        super(firstAidKit, fineStatus, fine, exhaustEmmission, plate, type, brand, year, km, fuelType, city, date, time, valletService, preCheckService, price, repetition);
        this.EngineCC = EngineCC;
    } 
    
    @Override
    public void calcPrice() {
        
        super.calcPrice();
        
        price += inspectionPrice;
        
        if(EngineCC <= 125)
        {
          price = price * discount;  
        }
        else if(EngineCC < 250)
        {
            price = price * 1.02;   
        }
        else if(EngineCC <= 660)
        {
            price = price * 1.04; 
        }
        else if(EngineCC <= 1000)
        {
            price = price * 1.06;  
        }
        else
        {
            price = price * 1.08;  
        }
    }

    @Override
    public String toString() {
        return  "\nMotorcycle's Engine Power: " + EngineCC +" cc" + super.toString();
    }
    
}

