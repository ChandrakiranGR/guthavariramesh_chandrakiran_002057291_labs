/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author chandrkiran
 */
public class VitalSignsHistory {
    ArrayList<VitalSigns> history;
    
    //creating a constructor to create a empty array list for history
    public VitalSignsHistory(){
        history = new ArrayList<VitalSigns>(); 
    }
    
    public VitalSigns addNewVitals(){
        VitalSigns newVs = new VitalSigns();
        history.add(newVs);
        return newVs;
    }
    
    public void removeVitals(VitalSigns vs){
        history.remove(vs);
    }
    
    public ArrayList<VitalSigns> getHistory(){
        return history;
    }
}
