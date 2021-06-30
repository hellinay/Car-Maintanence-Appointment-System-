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
public class Car extends StandartVehicle{
    
    private int seatCapacity;
    private static final double inspectionPrice = 342.20;
    private static final double discount = 0.98;

    public Car() {
        this.seatCapacity = 0;
    }

    public Car(int seatCapacity, String firstAidKit, String fineStatus, double fine, String exhaustEmmission, String plate, String type, String brand, int year, int km, String fuelType, String city, String date, String time, String valletService, String preCheckService, double price, String repetition) {
        super(firstAidKit, fineStatus, fine, exhaustEmmission, plate, type, brand, year, km, fuelType, city, date, time, valletService, preCheckService, price, repetition);
        this.seatCapacity = seatCapacity;
    }

    
    @Override
    public void calcPrice() {

        super.calcPrice();
        
        price += inspectionPrice;
        
        switch (seatCapacity) {
            case 2:
                price = price * discount;
                break;
            case 5:
                price = price;
                break;
            case 7:
                price = price * 1.02;
                break;
            default:
                price = price * 1.04;
                break;   
        }
        
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
    
}
