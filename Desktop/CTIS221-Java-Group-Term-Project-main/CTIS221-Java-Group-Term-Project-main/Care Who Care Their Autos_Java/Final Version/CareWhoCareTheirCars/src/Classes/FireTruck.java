package Classes;


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
public class FireTruck extends PrivilegedVehicle{
    
    private int tankCapacity;
    private String lift;
    private static final double inspectionPrice = 0;
    private static final double discount = 0.98;

    public FireTruck() {
        this.tankCapacity = 0;
        this.lift = "Unknown";
    }

    public FireTruck(int tankCapacity, String lift, String equipmentSufficiency, String plate, String type, String brand, int year, int km, String fuelType, String city, String date, String time, String valletService, String preCheckService, double price, String repetition) {
        super(equipmentSufficiency, plate, type, brand, year, km, fuelType, city, date, time, valletService, preCheckService, price, repetition);
        this.tankCapacity = tankCapacity;
        this.lift = lift;
    }

    @Override
    public void calcPrice() {
        
        super.calcPrice();
                
        if(lift.equalsIgnoreCase("Yes"))
        {
            if(tankCapacity <= 7)
                price = price * discount;
            else if(tankCapacity <= 13)
                price = price * 1.06;
            
            else if(tankCapacity <= 16)
                price = price * 1.08;
            
            else if(tankCapacity <= 20)
                price = price * 1.10;
        }
        
        else 
        {
            if(tankCapacity <= 7)
                price = price * 0.96;
            else if(tankCapacity <= 13)
                price = price * 1.02;
            
            else if(tankCapacity <= 16)
                price = price * 1.04;
            
            else if(tankCapacity <= 20)
                price = price * 1.06;
        }
        
    }

    @Override
    public String toString() {
        return  "\nFire Truck's Tank Capacity: " + tankCapacity + "\nLift: " + lift + super.toString();
    }
    
    
    
    
    
}
