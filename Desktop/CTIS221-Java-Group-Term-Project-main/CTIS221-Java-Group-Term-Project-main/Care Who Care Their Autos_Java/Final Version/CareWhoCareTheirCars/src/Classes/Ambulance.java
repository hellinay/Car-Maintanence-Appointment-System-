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
public class Ambulance extends PrivilegedVehicle{
    
    private String TyreType;
    private static final double discount = 0.98;
    private static final double inspectionPrice = 0;

    public Ambulance() {
       this.TyreType = "Unknown";
    }

    public Ambulance(String TyreType, String equipmentSufficiency, String plate, String type, String brand, int year, int km, String fuelType, String city, String date, String time, String valletService, String preCheckService, double price, String repetition) {
        super(equipmentSufficiency, plate, type, brand, year, km, fuelType, city, date, time, valletService, preCheckService, price, repetition);
        this.TyreType = TyreType;
    }
    
    @Override
    public void calcPrice() {
        
        super.calcPrice();
        
        if(TyreType.equalsIgnoreCase("Standart"))
            price = price * discount;
          
        else
            price = price * 1.10;
        
    }

    @Override
    public String toString() {
        return "\nAmbulance's Tyre Type: " + TyreType + super.toString();
    }
    
    
    
}
