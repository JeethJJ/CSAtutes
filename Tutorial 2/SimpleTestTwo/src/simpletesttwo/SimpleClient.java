/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpletesttwo;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SE2018453
 */
public class SimpleClient {
    SimpleCalculatorServer server = new SimpleCalculatorServer();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleClient simpleclient = new SimpleClient();
        simpleclient.executeTest();
    }
    
    private void executeTest(){
        System.out.println("[CLIENT] - Testing if server is connected...");
        if(server.isServerConnected()){
            System.out.println("[CLIENT] - The client is connected, the test can proceed...");
            
            //testing adding
            int x = 2;
            int y = 3;
            System.out.println("[CLIENT] - Asking the server what is the sum of "+x+" and "+y);
            int z = server.addIntNumbers(x, y);
            System.out.println("[CLIENT] - The server has replied sum of "+x+" and "+y + " is "+z);
            if(z==x+y){
            System.out.println("[CLIENT] - The server has returned the CORRECT answer");
            }else{
            System.out.println("[CLIENT] - The server has returned the WRONG answer");
            
            }
            // testing divide methods
            
            x=4;
            y=2;
            System.out.println("[CLIENT] - Asking the server what is the ratio of "+x+" and "+y);
                try {
                    double k=server.divideIntNumbers(x, y);
                    System.out.println("[CLIENT] - The server has replied ratio of "+x+" and "+y + " is "+k);
                    if(k==x/y){
                    System.out.println("[CLIENT] - The server has returned the CORRECT answer");
                    }else{
                    System.out.println("[CLIENT] - The server has returned the WRONG answer");
                    }
                } catch (Exception ex) {
                    Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
            x=4;
            y=2;
            System.out.println("[CLIENT] - Asking the server what is the subtraction of "+y+" frpm "+x);
                try {
                    int j=server.suctractIntNumbers(x, y);
                    System.out.println("[CLIENT] - The server has replied subtraction of "+y+" frpm "+x + " is "+j);
                    if(j==x-y){
                    System.out.println("[CLIENT] - The server has returned the CORRECT answer");
                    }else{
                    System.out.println("[CLIENT] - The server has returned the WRONG answer");
                    }
                } catch (Exception ex) {
                    Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            x=4;
            y=2;
            System.out.println("[CLIENT] - Asking the server what is the multiplication of "+x+" and "+y);
                try {
                    z=server.multiplyIntNumbers(x, y);
                    System.out.println("[CLIENT] - The server has replied multiplication of "+x+" and "+y + " is "+z);
                    if(z==x*y){
                    System.out.println("[CLIENT] - The server has returned the CORRECT answer");
                    }else{
                    System.out.println("[CLIENT] - The server has returned the WRONG answer");
                    }
                } catch (Exception ex) {
                    Logger.getLogger(SimpleClient.class.getName()).log(Level.SEVERE, null, ex);
                }    
                
                
            int [] p = {2,3,4,5};
            int [] q = {3,4,5,6};
            System.out.println("[CLIENT] - Asking the server what is the sum of "+Arrays.toString(p)+" and "+Arrays.toString(q));
            //int[] r = server.addIntNumbersARR(p, q);
            //System.out.println("[CLIENT] - The server has replied sum of "+Arrays.toString(p)+" and "+Arrays.toString(q) + " is "+Arrays.toString(r));
            
           
            System.out.println("[CLIENT] - Asking the server what is the substraction of "+Arrays.toString(p)+" and "+Arrays.toString(q));
            //int[] r = server.suctractIntNumbersARR(p, q);
            //System.out.println("[CLIENT] - The server has replied sum of "+Arrays.toString(p)+" and "+Arrays.toString(q) + " is "+Arrays.toString(r));
        
        
            System.out.println("[CLIENT] - Asking the server what is the multiplication of "+Arrays.toString(p)+" and "+Arrays.toString(q));
            //int[] r = server.multiplyIntNumbersARR(p, q);
            //System.out.println("[CLIENT] - The server has replied sum of "+Arrays.toString(p)+" and "+Arrays.toString(q) + " is "+Arrays.toString(r));
            
           
            System.out.println("[CLIENT] - Asking the server what is the divition of "+Arrays.toString(p)+" and "+Arrays.toString(q));
            //int[] r = server.divideIntNumbersARR(p, q);
            //System.out.println("[CLIENT] - The server has replied sum of "+Arrays.toString(p)+" and "+Arrays.toString(q) + " is "+Arrays.toString(r));
        }
        else{
            System.out.println("[CLIENT] - Test completed");
        }
    }
}
