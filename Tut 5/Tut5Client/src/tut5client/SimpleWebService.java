
package tut5client;

import tut5client.*;
import javax.jws.Oneway;
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
@WebService(name = "SimpleWebService", targetNamespace = "http://server/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SimpleWebService {


    /**
     * 
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "isConnected", targetNamespace = "http://server/", className = "tut5client.IsConnected")
    @ResponseWrapper(localName = "isConnectedResponse", targetNamespace = "http://server/", className = "tut5client.IsConnectedResponse")
    @Action(input = "http://server/SimpleWebService/isConnectedRequest", output = "http://server/SimpleWebService/isConnectedResponse")
    public Boolean isConnected();

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://server/", className = "tut5client.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://server/", className = "tut5client.HelloResponse")
    @Action(input = "http://server/SimpleWebService/helloRequest", output = "http://server/SimpleWebService/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "getIPandHostAddress", targetNamespace = "http://server/", className = "tut5client.GetIPandHostAddress")
    @Action(input = "http://server/SimpleWebService/getIPandHostAddress")
    public void getIPandHostAddress();

}
