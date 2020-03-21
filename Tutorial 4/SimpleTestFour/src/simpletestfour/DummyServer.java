/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpletestfour;

import java.util.ArrayList;

/**
 *
 * @author SE2018453
 */
public class DummyServer {
    
    ArrayList<TemperatureSample> samples = new ArrayList<TemperatureSample>();
    
   
    
     public boolean isServerConnected(){
        System.out.println("[SERVER] - Connecton is being tested...");
        return true;
    }
     
     public void addSample(TemperatureSample s){
        System.out.println("[SERVER] - Adding "+s+ " to " + samples);
        samples.add(s);
        System.out.println("[SERVER] - Samples are : " + samples);
        
    }
}

