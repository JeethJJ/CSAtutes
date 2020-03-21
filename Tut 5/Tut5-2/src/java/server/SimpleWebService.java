/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author jihanjeeth
 */
@WebService(serviceName = "SimpleWebService")
public class SimpleWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "isConnected")
    public Boolean isConnected() {
        System.out.println("[SERVER] - Testing if server is connected");
         
        return true;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getIPandHostAddress")
    @Oneway
    public void getIPandHostAddress() {
        InetAddress ip;
        try {
            ip = InetAddress.getLocalHost();
            String hostname = ip.getHostName();
            System.out.println("Your current IP address : " + ip);
            System.out.println("Your current Hostname : " + hostname);
        } catch (UnknownHostException ex) {
            Logger.getLogger(SimpleWebService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
