/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpletestthree;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SE2018453
 */
class SimpleClient {
    
    public static void main(String[] args){
        SimpleClient simpleclient = new SimpleClient();
        simpleclient.executeTest();
    }
    
    private void executeTest() {
        SimpleTemperatureRecorderServer server = new SimpleTemperatureRecorderServer();
        System.out.println("[CLIENT] - Testing if server is connected...");
        if(server.isServerConnected()){
            System.out.println("[CLIENT] - The client is connected, the test can proceed...");
            
//            try {
//                System.out.println("[CLIENT] - The minimum recorded temperature is " + server.getClosestTemp());
//            } catch (Exception ex) {
//                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
//            }
            server.addTemperature(new Double(10),"c");
            try {
                System.out.println("[CLIENT] - The minimum recorded temperature is " + server.getClosestTemp());
            } catch (Exception ex) {
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                System.out.println("[CLIENT] - The maximum recorded temperature is " + server.getHighestTemp());
            } catch (Exception ex) {
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                System.out.println("[CLIENT] - The average temperature is " + server.getAvgTemp());
            } catch (Exception ex) {
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                System.out.println("[CLIENT] - "+server.getNoTemp() +" temperatures recorded so far.");
            } catch (Exception ex) {
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            server.addTemperature(1.0,"f");
            try {
                System.out.println("[CLIENT] - The minimum recorded temperature is " + server.getClosestTemp());
            } catch (Exception ex) {
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                System.out.println("[CLIENT] - The maximum recorded temperature is " + server.getHighestTemp());
            } catch (Exception ex) {
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                System.out.println("[CLIENT] - The average temperature is " + server.getAvgTemp());
            } catch (Exception ex) {
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                System.out.println("[CLIENT] - "+server.getNoTemp() +" temperatures recorded so far.");
            } catch (Exception ex) {
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            server.addTemperature(12.0,"k");
            try {
                System.out.println("[CLIENT] - The minimum recorded temperature is " + server.getClosestTemp());
            } catch (Exception ex) {
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                System.out.println("[CLIENT] - The maximum recorded temperature is " + server.getHighestTemp());
            } catch (Exception ex) {
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                System.out.println("[CLIENT] - The average temperature is " + server.getAvgTemp());
            } catch (Exception ex) {
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                System.out.println("[CLIENT] - "+server.getNoTemp() +" temperatures recorded so far.");
            } catch (Exception ex) {
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            server.addTemperature(-0.1,"c");
            try {
                System.out.println("[CLIENT] - The minimum recorded temperature is " + server.getClosestTemp());
            } catch (Exception ex) {
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                System.out.println("[CLIENT] - The maximum recorded temperature is " + server.getHighestTemp());
            } catch (Exception ex) {
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                System.out.println("[CLIENT] - The average temperature is " + server.getAvgTemp());
            } catch (Exception ex) {
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                System.out.println("[CLIENT] - "+server.getNoTemp() +" temperatures recorded so far.");
            } catch (Exception ex) {
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            server.addTemperature(-18.0,"f");
            try {
                System.out.println("[CLIENT] - The minimum recorded temperature is " + server.getClosestTemp());
            } catch (Exception ex) {
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                System.out.println("[CLIENT] - The maximum recorded temperature is " + server.getHighestTemp());
            } catch (Exception ex) {
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                System.out.println("[CLIENT] - The average temperature is " + server.getAvgTemp());
            } catch (Exception ex) {
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                System.out.println("[CLIENT] - "+server.getNoTemp() +" temperatures recorded so far.");
            } catch (Exception ex) {
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            server.addTemperature(18.0,"k");
            try {
                System.out.println("[CLIENT] - The minimum recorded temperature is " + server.getClosestTemp());
            } catch (Exception ex) {
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                System.out.println("[CLIENT] - The maximum recorded temperature is " + server.getHighestTemp());
            } catch (Exception ex) {
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                System.out.println("[CLIENT] - The average temperature is " + server.getAvgTemp());
            } catch (Exception ex) {
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                System.out.println("[CLIENT] - "+server.getNoTemp() +" temperatures recorded so far.");
            } catch (Exception ex) {
                Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            
   
            
            
            
        }
        else{
            System.out.println("[CLIENT] - Test completed");
        }
}
}

