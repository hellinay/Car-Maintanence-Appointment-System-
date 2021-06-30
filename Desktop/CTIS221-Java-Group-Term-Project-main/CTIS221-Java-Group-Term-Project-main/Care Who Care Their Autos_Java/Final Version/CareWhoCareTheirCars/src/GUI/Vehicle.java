package GUI;


import java.util.ArrayList;
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
public abstract class Vehicle {
    
    protected String plate;
    protected String type;
    protected String brand;
    protected int year;
    protected int km;
    protected String fuelType;
    protected String city;
    protected String date;
    protected String time;
    protected String valletService;
    protected String preCheckService;
    protected double price;
    protected String repetition;
    
    private ArrayList<CareHistory> arrHist;
    protected static final int preCheckPrice = 100;
    protected static final int preCheckPriceP = 50;
    protected static final int valletServicePrice = 250;
    protected static final int valletServicePriceP = 125;

    public Vehicle() {
        this.date = "No date!";
        this.time = "No time!";
        this.city = "No city!";
        this.km = 0;
        this.year = 0;
        this.valletService = "Unknown";
        this.preCheckService = "Unknown";
        this.fuelType = "Unknown";
        this.plate = "Unknown";
        this.brand = "Unknown";
        this.type = "Unknown";
        this.repetition = "Unknown";
        this.price = 0.0;
        arrHist = new ArrayList<>();
    }

    public Vehicle(String plate, String type, String brand, int year, int km, String fuelType, String city, String date, String time, String valletService, String preCheckService, double price, String repetition) {
        this.plate = plate;
        this.type = type;
        this.brand = brand;
        this.year = year;
        this.km = km;
        this.fuelType = fuelType;
        this.city = city;
        this.date = date;
        this.time = time;
        this.valletService = valletService;
        this.preCheckService = preCheckService;
        this.price = price;
        this.repetition = repetition;
        arrHist = new ArrayList<>();
    }
    
    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
    
    public boolean findPlate(String plate)
    {
        return this.plate.equalsIgnoreCase(plate);
    }
    
    public boolean findDate(String fdate)
    {
        return this.date.equalsIgnoreCase(fdate);
    }
    
    public boolean findTime(String ftime)
    {
        return this.time.equalsIgnoreCase(ftime);
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setValletService(String valletService) {
        this.valletService = valletService;
    }

    public void setPreCheckService(String preCheckService) {
        this.preCheckService = preCheckService;
    }
    
    public String HistDisplay() {
        CareHistory temp;
        String outHist = "";
        for (int i = 0; i < arrHist.size(); i++) {

            temp = (CareHistory) arrHist.get(i);
            outHist += temp.toString() + "\n";
        }
        return outHist;
    }
   
    public void getHistInput(CareHistory ch) {
            arrHist.add(ch);
    }

    public double getPrice() {
        return price;
    }
    
    public abstract void calcPrice();

    @Override
    public String toString() {
        
        return "\nPlate:" + plate + "\nType:" + type + "\nBrand:" + brand + "\nYear:" + year + "\nkm=" + km + "\nFuel Type:" + fuelType + "\nCity:" + city + "\nDate:" + date + "\nTime:" + time + "\nVallet Service:" + valletService + "\nPre Check Service:" + preCheckService + "\nPrice=" + price +"\n";
    }



}
