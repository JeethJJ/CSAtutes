/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpletestfour;

import java.util.Date;

/**
 *
 * @author SE2018453
 */
public class DummyClient {

    public static void main(String[] args){
        DummyClient dummyClient = new DummyClient();
        dummyClient.executeTest();
    }
    
    private void executeTest() {
        DummyServer server = new DummyServer();
        System.out.println("[CLIENT] - Testing if server is connected...");
        if(server.isServerConnected()){
            System.out.println("[CLIENT] - The client is connected, the test can proceed...");
            
            TemperatureSample t1=new TemperatureSample();
            t1.location="London";
            t1.time=new Date();
            t1.value=10.3;
            server.addSample(t1);
            System.out.println("[CLIENT] - The sample is "+ t1);
            
            TemperatureSample t2=new TemperatureSample();
            t2.location="London";
            t2.time=new Date();
            t2.value=9.1;
            server.addSample(t2);
            System.out.println("[CLIENT] - The sample is "+ t2);
            
            TemperatureSample t3=new TemperatureSample();
            t3.location="London";
            t3.time=new Date();
            t3.value=5.1;
            server.addSample(t3);
            System.out.println("[CLIENT] - The sample is "+ t3);
            
        }
        else{
            System.out.println("[CLIENT] - Test completed");
        }
    }
    
}
