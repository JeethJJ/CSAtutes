/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tut5client;

/**
 *
 * @author jihanjeeth
 */
public class Tut5Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tut5Client client = new Tut5Client();
        client.execute();
    }
    
    private void execute(){
        System.out.println("[ CLIENT ] - Executing connection test");
        if(isConnected()){
            System.out.println("[ CLIENT ] - Server is connected, test can continue.");
            String greeting = "[ CLIENT ] - "+ hello("JJ");
            System.out.println(greeting);
            getIPandHostAddress();
            
        }else{
            System.out.println("[ CLIENT ] - Server is NOT connected, test failed.");
        }
    }
    
    private static Boolean isConnected(){
        tut5client.SimpleWebService_Service service= new tut5client.SimpleWebService_Service();
        tut5client.SimpleWebService port = service.getSimpleWebServicePort();
        return port.isConnected();
    }
    
    private static String hello(String name){
        tut5client.SimpleWebService_Service service= new tut5client.SimpleWebService_Service();
        tut5client.SimpleWebService port = service.getSimpleWebServicePort();
        return port.hello(name);
    }
    
    private static void getIPandHostAddress(){
        tut5client.SimpleWebService_Service service= new tut5client.SimpleWebService_Service();
        tut5client.SimpleWebService port = service.getSimpleWebServicePort();
        port.getIPandHostAddress();
    }
    
    //28. change the soap address <soap:address location="http://localhost:8080/Tut5-2/SimpleWebService"/> to whatever the server address.
    
}
