/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial8client;

/**
 *
 * @author jihanjeeth
 */
public class Tutorial8Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tutorial8Client t8 = new Tutorial8Client();
        t8.execute();
    }
    
    private static Boolean isConnected(){
        tutorial8client.NewWebService_Service service= new NewWebService_Service();
        tutorial8client.NewWebService port = service.getNewWebServicePort();
        return port.isConnected();
    }
    
    private static Double add(double a, double b){
        tutorial8client.NewWebService_Service service= new NewWebService_Service();
        tutorial8client.NewWebService port = service.getNewWebServicePort();
        return port.add(a, b);
    }
    
    private static Double subtract(double a, double b){
        tutorial8client.NewWebService_Service service= new NewWebService_Service();
        tutorial8client.NewWebService port = service.getNewWebServicePort();
        return port.subtract(a, b);
    }
    
    private static Double divide(double a, double b){
        tutorial8client.NewWebService_Service service= new NewWebService_Service();
        tutorial8client.NewWebService port = service.getNewWebServicePort();
        return port.divide(a, b);
    }
    
    private static Double multiply(double a, double b){
        tutorial8client.NewWebService_Service service= new NewWebService_Service();
        tutorial8client.NewWebService port = service.getNewWebServicePort();
        return port.multiply(a, b);
    }

    private void execute() {
        System.out.println("[CLIENT] - Test Starting...");
        System.out.println("[CLIENT] - Testing if the server is connected...");
        if(isConnected())
        {
            System.out.println("[CLIENT] - The server is connected, test can proceed...");
            Double a    =   7.0;
            Double b    =   3.0;
            
            System.out.println("[CLIENT] - Testing the sum...");
            if(add(a, b).equals(a+b))
            {
                System.out.println("[CLIENT] - The server has returned the correct sum...");            
            }
            else
            {
                System.out.println("[CLIENT] - The server has returned the wrong sum...");                            
            }

            System.out.println("[CLIENT] - Testing the difference...");
            if(subtract(a, b).equals(a-b))
            {
                System.out.println("[CLIENT] - The server has returned the correct difference.");            
            }
            else
            {
                System.out.println("[CLIENT] - The server has returned the wrong difference.");                            
            }
        
            System.out.println("[CLIENT] - Testing the multiplication...");
            if(multiply(a, b).equals(a*b))
            {
                System.out.println("[CLIENT] - The server has returned the correct product.");            
            }
            else
            {
                System.out.println("[CLIENT] - The server has returned the wrong product.");                            
            }

            System.out.println("[CLIENT] - Testing the division...");
            if(divide(a, b).equals(a/b))
            {
                System.out.println("[CLIENT] - The server has returned the correct ratio.");            
            }
            else
            {
                System.out.println("[CLIENT] - The server has returned the wrong ratio.");                            
            }

            
        }
        else
        {
            System.out.println("[CLIENT] - The server is connected, test aborted !");
            
        }
        System.out.println("[CLIENT] - Test Completed !");
    }
}
//15. Well, assuming that by exceptions, it means the exception handelling, so it depends on the exception type and the application type 
//    if it is a application needs internet to execute and it couldnt connect to the internet, which means the application should wait till the application's internet connection is back on!!
//    also processes that take tome to receive should run in different threads, so the user can perform another action if required before the server responds.


//16. We can send a arraylist of the elements that we want to perform the operations to the server and we can perform the required operations and send them back to the client