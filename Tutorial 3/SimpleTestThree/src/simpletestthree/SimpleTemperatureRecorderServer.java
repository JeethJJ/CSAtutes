/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpletestthree;

import java.util.ArrayList;

/**
 *
 * @author SE2018453
 */
public class SimpleTemperatureRecorderServer {
    
    public ArrayList<Double> temperatures = new ArrayList<>();
    
    public boolean isServerConnected(){
        System.out.println("[SERVER] - Connecton is being tested...");
        return true;
    }
    
    public void addTemperature(Double sample , String type){
        Double temp;
        if(type=="f"){
            temp= (sample- 32)*5/9;
        }else if(type=="k"){
            temp= (sample-273.15);
        }else{
            temp=sample;
        }
         System.out.println("[SERVER] - Adding sample " + temp);
         temperatures.add(temp);
         System.out.println("[SERVER] - All samples now are  " + temperatures);
    }
    
    public double getClosestTemp() throws Exception{
        Double min=0.0;
        if (temperatures.isEmpty()){
            throw new Exception("No temperatures recorded yet");
        }else{
        
        for(int index=0;index<temperatures.size();index++){
            if(min>temperatures.get(index)){
                min=temperatures.get(index);
            }
        }
        }
        return min;
    }
    
    public double getHighestTemp() throws Exception{
        Double max=0.0;
        if (temperatures.isEmpty()){
            throw new Exception("No temperatures recorded yet");
        }else{
        for(int index=0;index<temperatures.size();index++){
            if(max<temperatures.get(index)){
                max=temperatures.get(index);
            }
        }}
        return max;
    }
    
    public double getAvgTemp() throws Exception{
        Double avg=0.0;
        if (temperatures.isEmpty()){
            throw new Exception("No temperatures recorded yet");
        }else{
        for(int index=0;index<temperatures.size();index++){
                avg=avg+temperatures.get(index);
            }
        avg=avg/temperatures.size();
        }
        return avg;
    }
    
    public int getNoTemp() throws Exception{
        if (temperatures.isEmpty()){
            throw new Exception("No temperatures recorded yet");
        }
        return temperatures.size();
    }
    
    //18. when we add the temperature we can add that to the database as well and when opening the app we should get the data from database and add it to a arraylist  
    //20. depending on the scenario there can be lower and upper limits. 
        //if its like an environment reading there can be different temperature limits. if its a human body temperature reading that might differ
        //so it depends on the situation
    
        //depending on the temperature type we can raise exceptions in the add temperature method.
}
