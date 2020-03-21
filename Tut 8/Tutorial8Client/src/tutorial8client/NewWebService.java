
package tutorial8client;

import tutorial8client.*;
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
@WebService(name = "NewWebService", targetNamespace = "http://server/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface NewWebService {


    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns java.lang.Double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://server/", className = "tutorial8client.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://server/", className = "tutorial8client.AddResponse")
    @Action(input = "http://server/NewWebService/addRequest", output = "http://server/NewWebService/addResponse")
    public Double add(
        @WebParam(name = "a", targetNamespace = "")
        double a,
        @WebParam(name = "b", targetNamespace = "")
        double b);

    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns java.lang.Double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "divide", targetNamespace = "http://server/", className = "tutorial8client.Divide")
    @ResponseWrapper(localName = "divideResponse", targetNamespace = "http://server/", className = "tutorial8client.DivideResponse")
    @Action(input = "http://server/NewWebService/divideRequest", output = "http://server/NewWebService/divideResponse")
    public Double divide(
        @WebParam(name = "a", targetNamespace = "")
        double a,
        @WebParam(name = "b", targetNamespace = "")
        double b);

    /**
     * 
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "isConnected", targetNamespace = "http://server/", className = "tutorial8client.IsConnected")
    @ResponseWrapper(localName = "isConnectedResponse", targetNamespace = "http://server/", className = "tutorial8client.IsConnectedResponse")
    @Action(input = "http://server/NewWebService/isConnectedRequest", output = "http://server/NewWebService/isConnectedResponse")
    public Boolean isConnected();

    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns java.lang.Double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "multiply", targetNamespace = "http://server/", className = "tutorial8client.Multiply")
    @ResponseWrapper(localName = "multiplyResponse", targetNamespace = "http://server/", className = "tutorial8client.MultiplyResponse")
    @Action(input = "http://server/NewWebService/multiplyRequest", output = "http://server/NewWebService/multiplyResponse")
    public Double multiply(
        @WebParam(name = "a", targetNamespace = "")
        double a,
        @WebParam(name = "b", targetNamespace = "")
        double b);

    /**
     * 
     * @param a
     * @param b
     * @return
     *     returns java.lang.Double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "subtract", targetNamespace = "http://server/", className = "tutorial8client.Subtract")
    @ResponseWrapper(localName = "subtractResponse", targetNamespace = "http://server/", className = "tutorial8client.SubtractResponse")
    @Action(input = "http://server/NewWebService/subtractRequest", output = "http://server/NewWebService/subtractResponse")
    public Double subtract(
        @WebParam(name = "a", targetNamespace = "")
        double a,
        @WebParam(name = "b", targetNamespace = "")
        double b);

}
