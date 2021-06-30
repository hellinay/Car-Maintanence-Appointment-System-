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
public class CareHistory {
    
    
    private String lastInspectationDate;
    private ArrayList<String> FaultList;

    public CareHistory() {
        this.lastInspectationDate = "Unknown";
        FaultList = new ArrayList<>();
    }

    public CareHistory(String lastInspectationDate) {
        this.lastInspectationDate = lastInspectationDate;
        FaultList = new ArrayList<>();
    }

    public String getLastInspectationDate() {
        return lastInspectationDate;
    }

    public void setLastInspectationDate(String lastInspectationDate) {
        this.lastInspectationDate = lastInspectationDate;
    }
   
    public void getInput(String fault[], int number)
    {
       for(int a=0; a<number; a++)
       {
        FaultList.add(fault[a]);
       }
       
    }

    public ArrayList<String> getFaultList() {
        return FaultList;
    }
    
    @Override
    public String toString() {
        
        String out = "";
            out+= getFaultList();
        
        return "You need to repair these previous issues before going to inspectation: \n" + out;
    }
    
    
    
            
    
    
    
    
    
    
    
    
    
    
    
    
}
