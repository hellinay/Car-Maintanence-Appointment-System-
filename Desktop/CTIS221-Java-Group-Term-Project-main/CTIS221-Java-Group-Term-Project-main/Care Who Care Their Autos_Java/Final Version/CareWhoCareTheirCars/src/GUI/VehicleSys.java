package GUI;


import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author merte
 */
public class VehicleSys {
    
    public static ArrayList<Vehicle> VehicleArray = new ArrayList();
    
    public static boolean checkPlate(String checkPlt) {
        for (int i = 0; i < VehicleArray.size(); i++) {
            Vehicle v = VehicleArray.get(i);
            if (v.findPlate(checkPlt)) {
                return true;
            }
        }
        return false;
    }
    
        
     public static Vehicle removePlate(String removePlt) {
        for (int i = 0; i < VehicleArray.size(); i++) {
            String plateNb = VehicleArray.get(i).getPlate();
            if (removePlt.equalsIgnoreCase(plateNb)) {
                Vehicle v = VehicleArray.remove(i);
                return v;
            }
        }
        return null;
    }
    

     
     public static Vehicle searchPlate(String searchPlt) {
        for (int i = 0; i < VehicleArray.size(); i++) {
            String plateNb = VehicleArray.get(i).getPlate();
            if (searchPlt.equalsIgnoreCase(plateNb)) {
                return VehicleArray.get(i);
            }
        }
        return null;
    }
     
     
     public static String[] getPlates()
    {
        
        Vehicle temp5;
        String[] output = new String[10];
        
        for (int i = 0; i < VehicleArray.size(); i++) {

            temp5 = (Vehicle) VehicleArray.get(i);
            output[i] = temp5.getPlate();
            
        }
        
        return output;
        
    }
     
      public static String display() {
        Vehicle temp;
        String out = "";
        for (int i = 0; i < VehicleArray.size(); i++) {

            temp = (Vehicle) VehicleArray.get(i);
            out += temp.toString() + "\n";
        }
        return out;
    }
     
    public static void calcNewPrice() {

        for (int i = 0; i < VehicleArray.size(); i++) {
            VehicleArray.get(i).calcPrice();
        }
    } 
    
    
}
