
package cex2client;

import cex2client.*;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CEX2WebService", targetNamespace = "http://server/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CEX2WebService {


    /**
     * 
     * @param s1
     * @param s2
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getLongestString", targetNamespace = "http://server/", className = "cex2client.GetLongestString")
    @ResponseWrapper(localName = "getLongestStringResponse", targetNamespace = "http://server/", className = "cex2client.GetLongestStringResponse")
    @Action(input = "http://server/CEX2WebService/getLongestStringRequest", output = "http://server/CEX2WebService/getLongestStringResponse")
    public String getLongestString(
        @WebParam(name = "s1", targetNamespace = "")
        String s1,
        @WebParam(name = "s2", targetNamespace = "")
        String s2);

    /**
     * 
     * @param s1
     * @param s2
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getLongestStringWithException", targetNamespace = "http://server/", className = "cex2client.GetLongestStringWithException")
    @ResponseWrapper(localName = "getLongestStringWithExceptionResponse", targetNamespace = "http://server/", className = "cex2client.GetLongestStringWithExceptionResponse")
    @Action(input = "http://server/CEX2WebService/getLongestStringWithExceptionRequest", output = "http://server/CEX2WebService/getLongestStringWithExceptionResponse")
    public String getLongestStringWithException(
        @WebParam(name = "s1", targetNamespace = "")
        String s1,
        @WebParam(name = "s2", targetNamespace = "")
        String s2);

    /**
     * 
     * @param n
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addNumberToServer", targetNamespace = "http://server/", className = "cex2client.AddNumberToServer")
    @ResponseWrapper(localName = "addNumberToServerResponse", targetNamespace = "http://server/", className = "cex2client.AddNumberToServerResponse")
    @Action(input = "http://server/CEX2WebService/addNumberToServerRequest", output = "http://server/CEX2WebService/addNumberToServerResponse")
    public String addNumberToServer(
        @WebParam(name = "n", targetNamespace = "")
        double n);

    /**
     * 
     * @return
     *     returns java.lang.Double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findLargestNumberInServer", targetNamespace = "http://server/", className = "cex2client.FindLargestNumberInServer")
    @ResponseWrapper(localName = "findLargestNumberInServerResponse", targetNamespace = "http://server/", className = "cex2client.FindLargestNumberInServerResponse")
    @Action(input = "http://server/CEX2WebService/findLargestNumberInServerRequest", output = "http://server/CEX2WebService/findLargestNumberInServerResponse")
    public Double findLargestNumberInServer();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addSampleToServer", targetNamespace = "http://server/", className = "cex2client.AddSampleToServer")
    @ResponseWrapper(localName = "addSampleToServerResponse", targetNamespace = "http://server/", className = "cex2client.AddSampleToServerResponse")
    @Action(input = "http://server/CEX2WebService/addSampleToServerRequest", output = "http://server/CEX2WebService/addSampleToServerResponse")
    public String addSampleToServer(
        @WebParam(name = "arg0", targetNamespace = "")
        Sample arg0);

    /**
     * 
     * @return
     *     returns cex2client.Sample
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findSampleWithHighestTemperature", targetNamespace = "http://server/", className = "cex2client.FindSampleWithHighestTemperature")
    @ResponseWrapper(localName = "findSampleWithHighestTemperatureResponse", targetNamespace = "http://server/", className = "cex2client.FindSampleWithHighestTemperatureResponse")
    @Action(input = "http://server/CEX2WebService/findSampleWithHighestTemperatureRequest", output = "http://server/CEX2WebService/findSampleWithHighestTemperatureResponse")
    public Sample findSampleWithHighestTemperature();

    /**
     * 
     * @param t
     * @return
     *     returns java.util.List<cex2client.Sample>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAllSamplesWithTemperatureAbove", targetNamespace = "http://server/", className = "cex2client.FindAllSamplesWithTemperatureAbove")
    @ResponseWrapper(localName = "findAllSamplesWithTemperatureAboveResponse", targetNamespace = "http://server/", className = "cex2client.FindAllSamplesWithTemperatureAboveResponse")
    @Action(input = "http://server/CEX2WebService/findAllSamplesWithTemperatureAboveRequest", output = "http://server/CEX2WebService/findAllSamplesWithTemperatureAboveResponse")
    public List<Sample> findAllSamplesWithTemperatureAbove(
        @WebParam(name = "t", targetNamespace = "")
        double t);

    /**
     * 
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "isConnected", targetNamespace = "http://server/", className = "cex2client.IsConnected")
    @ResponseWrapper(localName = "isConnectedResponse", targetNamespace = "http://server/", className = "cex2client.IsConnectedResponse")
    @Action(input = "http://server/CEX2WebService/isConnectedRequest", output = "http://server/CEX2WebService/isConnectedResponse")
    public Boolean isConnected();

}
