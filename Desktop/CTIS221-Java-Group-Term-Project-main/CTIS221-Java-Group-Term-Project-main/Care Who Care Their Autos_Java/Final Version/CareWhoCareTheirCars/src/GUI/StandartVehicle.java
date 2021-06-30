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
public class StandartVehicle extends Vehicle implements PossibleFault{
    
    private String firstAidKit;
    private String fineStatus;
    private double fine;
    private String exhaustEmmission;
    private static final double exhaustIns = 80.2;
    
    int thisyear = Year.now().getValue();
    
    public StandartVehicle() {
        this.firstAidKit = "Unknown";
        this.fineStatus = "Unknown";
        this.exhaustEmmission = "Unknown";
        this.fine = 0.0;
    }

    public StandartVehicle(String firstAidKit, String fineStatus, double fine, String exhaustEmmission, String plate, String type, String brand, int year, int km, String fuelType, String city, String date, String time, String valletService, String preCheckService, double price, String repetition) {
        super(plate, type, brand, year, km, fuelType, city, date, time, valletService, preCheckService, price, repetition);
        this.firstAidKit = firstAidKit;
        this.fineStatus = fineStatus;
        this.fine = fine;
        this.exhaustEmmission = exhaustEmmission;
    }
    
    @Override
    public void calcPrice() {
        
        if(exhaustEmmission.equalsIgnoreCase("No"))
        price = price + exhaustIns;
        
        if(fineStatus.equalsIgnoreCase("Yes"))
        price = price + fine;    
        
        if(valletService.equalsIgnoreCase("Yes"))
        price = price + valletServicePrice;
        
        if(preCheckService.equalsIgnoreCase("Yes"))
        price = price + preCheckPrice;
        
    }

    @Override
    public String toString() {
        return "\nStandard Vehicle's Info: \nExhaust Emmission Status: " + exhaustEmmission + super.toString() ;
    }
    
    @Override
    public String possibleFaults() {
        String output = "";
        
            output += "\nYou need to bring your vehicle licence with the up-to-date informations(car paint/fuel type).";    
        if(fineStatus.equalsIgnoreCase("Yes"))
            output += "\nYour fine (" + fine + " TL) will be added to the final price.";
        if(exhaustEmmission.equalsIgnoreCase("No"))
            output += "\nExhaust emmission price (" + exhaustIns + " TL) will be added to the final price.";
        if(firstAidKit.equalsIgnoreCase("No"))
            output += "\nYou have to get a proper first aid kit with your car before inspectation!";
        if(fuelType.equalsIgnoreCase("LPG"))
             output += "\nYour LPG system's tank age must be lower than 10.";
        if(km>300000)
             output += "\nYour motor could be needed to heavy maintenance.";
        if(km>100000)
             output += "\nYour brake system may needed to change.";
        if((thisyear-year) > 10)
             output += "\nVehicle age: " + (thisyear-year) + "\nElectronical and mechanical check may needed.";
        if(repetition.equalsIgnoreCase("Yes"))
             output += "\nYour will not pay inspectation price at this time.\n";
        else
            output += "\nYou will pay inspectation price.\n";
       
        return output;
        
    }
    
    
    
}
