/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author jihanjeeth
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "divide")
    public Double divide(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        System.out.println("[SERVER] - " + a + " / " + b + " = " + (a/b));
        return a/b;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "multiply")
    public Double multiply(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        System.out.println("[SERVER] - " + a + " * " + b + " = " + (a*b));
        return a*b;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "subtract")
    public Double subtract(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        System.out.println("[SERVER] - " + a + " - " + b + " = " + (a-b));
        return a-b;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "add")
    public Double add(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        System.out.println("[SERVER] - " + a + " + " + b + " = " + (a+b));
        return a+b;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "isConnected")
    public Boolean isConnected(){
        System.out.println("[SERVER] - Connection test started.");
        return true;
    }
}