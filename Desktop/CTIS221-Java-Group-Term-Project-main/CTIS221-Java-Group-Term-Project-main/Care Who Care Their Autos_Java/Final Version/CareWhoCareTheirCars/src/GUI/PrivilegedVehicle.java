package GUI;


import java.time.Year;
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
public class PrivilegedVehicle extends Vehicle implements PossibleFault{

    private String equipmentSufficiency;
    private static final double eqPackage = 758.25;
    
    int thisyear = Year.now().getValue();

    public PrivilegedVehicle() {
        this.equipmentSufficiency = "Unknown";
    }

    public PrivilegedVehicle(String equipmentSufficiency, String plate, String type, String brand, int year, int km, String fuelType, String city, String date, String time, String valletService, String preCheckService, double price, String repetition) {
        super(plate, type, brand, year, km, fuelType, city, date, time, valletService, preCheckService, price, repetition);
        this.equipmentSufficiency = equipmentSufficiency;
    }
    
     @Override
    public void calcPrice() {
        
        if(equipmentSufficiency.equalsIgnoreCase("No"))
            price += eqPackage;
    
        if(valletService.equalsIgnoreCase("Yes"))
            price = price + valletServicePriceP;
        
        if(preCheckService.equalsIgnoreCase("Yes"))
            price = price + preCheckPriceP;
    }

    @Override
    public String toString() {
        return "\nPrivileged Vehicle's Info: " + super.toString();
    }
    
    @Override
    public String possibleFaults() {
        String output = "";
        
        if(equipmentSufficiency.equalsIgnoreCase("Yes"))
            output += "\nYour equipment price (" + eqPackage + " TL) will be added to the final price.";
        
        if(fuelType.equalsIgnoreCase("LPG"))
             output += "\nYour LPG system's tank age must be lower than 10.";
        if(km>200000)
             output += "\nYour motor could be needed to heavy maintenance.";
        if(km>75000)
             output += "\nYour brake system may needed to change.";
        if((thisyear-year) > 10)
             output += "\nVehicle age: " + (thisyear-year) + "\nElectronical and mechanical check may needed.\n";
        
        return output;
    }
    
}
