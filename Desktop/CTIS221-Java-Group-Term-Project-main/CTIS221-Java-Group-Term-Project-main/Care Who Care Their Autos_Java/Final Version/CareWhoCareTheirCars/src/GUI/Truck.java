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
public class Truck extends StandartVehicle{
    
    private String truckType;
    private static final double inspectionPrice = 462.56;
    private static final double discount = 0.98;
    public Truck() {
         this.truckType = "Unknown";
    }

    public Truck(String truckType, String firstAidKit, String fineStatus, double fine, String exhaustEmmission, String plate, String type, String brand, int year, int km, String fuelType, String city, String date, String time, String valletService, String preCheckService, double price, String repetition) {
        super(firstAidKit, fineStatus, fine, exhaustEmmission, plate, type, brand, year, km, fuelType, city, date, time, valletService, preCheckService, price, repetition);
        this.truckType = truckType;
    }

      
      @Override
    public void calcPrice() {
        
        super.calcPrice();
        
        price += inspectionPrice;
        
        if(truckType.equalsIgnoreCase("Van"))
            price = price * discount;
        
        else if(truckType.equalsIgnoreCase("Truck"))
            price = price;
        
        else if(truckType.equalsIgnoreCase("Lorry"))
            price = price * 1.10;
        
        else if(truckType.equalsIgnoreCase("Tractor"))
            price = price * 1.05;
        
    }

    @Override
    public String toString() {
        return "\nTruck Type: " + truckType + super.toString();
    }
    
    
    
    
    
}
