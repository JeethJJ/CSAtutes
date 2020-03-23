/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author jihanjeeth
 */
@WebService(serviceName = "CEX2WebService")
public class CEX2WebService {

    ArrayList<Double> numbers = new ArrayList<Double>();
    ArrayList<Sample> samples = new ArrayList<Sample>();
    /*
     * Web service operation
     */
    @WebMethod(operationName = "isConnected")
    public Boolean isConnected() {
        System.out.println("[SERVER] - Connection test started.");
        return true;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getLongestString")
    public String getLongestString(@WebParam(name = "s1") String s1, @WebParam(name = "s2") String s2) {
        System.out.println("[SERVER] - Starting to check the longest string between "+s1+" and "+s2+".");
        if(s1.length()>s2.length()){
            return s1;
        }else {
            return s2;
        }
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getLongestStringWithException")
    public String getLongestStringWithException(@WebParam(name = "s1") String s1, @WebParam(name = "s2") String s2) {
        if(s1==null && s2==null){
        throw new IllegalArgumentException("Element cannot be null");
        }else{
            if(s1.length()>s2.length()){
            return s1;
        }else {
            return s2;
        }
        }
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addNumberToServer")
    public String addNumberToServer(@WebParam(name = "n") double n) {
        numbers.add(n);
        return "Done";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findLargestNumberInServer")
    public Double findLargestNumberInServer() {
        Double max= numbers.get(1);
        for(Double d : numbers){
            if(d>max){
                max=d;
            }
        }
        return max;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addSampleToServer")
    public String addSampleToServer(Sample s) {
        samples.add(s);
        return "Done";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findSampleWithHighestTemperature")
    public Sample findSampleWithHighestTemperature() {
        Sample maxtempSample = samples.get(0);
        Double maxTemp=samples.get(0).getTemperature();
        for(Sample s : samples){
            if(s.getTemperature()>maxTemp){
                maxtempSample=s;
            }
        }
        return maxtempSample;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findAllSamplesWithTemperatureAbove")
    public ArrayList<Sample> findAllSamplesWithTemperatureAbove(@WebParam(name = "t") double t) {
        ArrayList<Sample> ans = new ArrayList<Sample>();
        for(Sample s : samples){
            if(s.getTemperature()>t){
                ans.add(s);
            }
        }
        return ans;
    }
}
