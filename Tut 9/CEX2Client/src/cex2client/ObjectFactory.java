
package cex2client;

import cex2client.*;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cex2client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddSampleToServer_QNAME = new QName("http://server/", "addSampleToServer");
    private final static QName _AddSampleToServerResponse_QNAME = new QName("http://server/", "addSampleToServerResponse");
    private final static QName _GetLongestStringWithException_QNAME = new QName("http://server/", "getLongestStringWithException");
    private final static QName _AddNumberToServer_QNAME = new QName("http://server/", "addNumberToServer");
    private final static QName _FindAllSamplesWithTemperatureAboveResponse_QNAME = new QName("http://server/", "findAllSamplesWithTemperatureAboveResponse");
    private final static QName _IsConnected_QNAME = new QName("http://server/", "isConnected");
    private final static QName _FindSampleWithHighestTemperature_QNAME = new QName("http://server/", "findSampleWithHighestTemperature");
    private final static QName _FindSampleWithHighestTemperatureResponse_QNAME = new QName("http://server/", "findSampleWithHighestTemperatureResponse");
    private final static QName _AddNumberToServerResponse_QNAME = new QName("http://server/", "addNumberToServerResponse");
    private final static QName _FindLargestNumberInServer_QNAME = new QName("http://server/", "findLargestNumberInServer");
    private final static QName _IsConnectedResponse_QNAME = new QName("http://server/", "isConnectedResponse");
    private final static QName _FindAllSamplesWithTemperatureAbove_QNAME = new QName("http://server/", "findAllSamplesWithTemperatureAbove");
    private final static QName _FindLargestNumberInServerResponse_QNAME = new QName("http://server/", "findLargestNumberInServerResponse");
    private final static QName _GetLongestStringWithExceptionResponse_QNAME = new QName("http://server/", "getLongestStringWithExceptionResponse");
    private final static QName _GetLongestString_QNAME = new QName("http://server/", "getLongestString");
    private final static QName _GetLongestStringResponse_QNAME = new QName("http://server/", "getLongestStringResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cex2client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddNumberToServerResponse }
     * 
     */
    public AddNumberToServerResponse createAddNumberToServerResponse() {
        return new AddNumberToServerResponse();
    }

    /**
     * Create an instance of {@link FindLargestNumberInServer }
     * 
     */
    public FindLargestNumberInServer createFindLargestNumberInServer() {
        return new FindLargestNumberInServer();
    }

    /**
     * Create an instance of {@link FindSampleWithHighestTemperatureResponse }
     * 
     */
    public FindSampleWithHighestTemperatureResponse createFindSampleWithHighestTemperatureResponse() {
        return new FindSampleWithHighestTemperatureResponse();
    }

    /**
     * Create an instance of {@link IsConnected }
     * 
     */
    public IsConnected createIsConnected() {
        return new IsConnected();
    }

    /**
     * Create an instance of {@link FindSampleWithHighestTemperature }
     * 
     */
    public FindSampleWithHighestTemperature createFindSampleWithHighestTemperature() {
        return new FindSampleWithHighestTemperature();
    }

    /**
     * Create an instance of {@link AddSampleToServerResponse }
     * 
     */
    public AddSampleToServerResponse createAddSampleToServerResponse() {
        return new AddSampleToServerResponse();
    }

    /**
     * Create an instance of {@link GetLongestStringWithException }
     * 
     */
    public GetLongestStringWithException createGetLongestStringWithException() {
        return new GetLongestStringWithException();
    }

    /**
     * Create an instance of {@link AddNumberToServer }
     * 
     */
    public AddNumberToServer createAddNumberToServer() {
        return new AddNumberToServer();
    }

    /**
     * Create an instance of {@link FindAllSamplesWithTemperatureAboveResponse }
     * 
     */
    public FindAllSamplesWithTemperatureAboveResponse createFindAllSamplesWithTemperatureAboveResponse() {
        return new FindAllSamplesWithTemperatureAboveResponse();
    }

    /**
     * Create an instance of {@link AddSampleToServer }
     * 
     */
    public AddSampleToServer createAddSampleToServer() {
        return new AddSampleToServer();
    }

    /**
     * Create an instance of {@link GetLongestStringResponse }
     * 
     */
    public GetLongestStringResponse createGetLongestStringResponse() {
        return new GetLongestStringResponse();
    }

    /**
     * Create an instance of {@link GetLongestStringWithExceptionResponse }
     * 
     */
    public GetLongestStringWithExceptionResponse createGetLongestStringWithExceptionResponse() {
        return new GetLongestStringWithExceptionResponse();
    }

    /**
     * Create an instance of {@link GetLongestString }
     * 
     */
    public GetLongestString createGetLongestString() {
        return new GetLongestString();
    }

    /**
     * Create an instance of {@link FindAllSamplesWithTemperatureAbove }
     * 
     */
    public FindAllSamplesWithTemperatureAbove createFindAllSamplesWithTemperatureAbove() {
        return new FindAllSamplesWithTemperatureAbove();
    }

    /**
     * Create an instance of {@link FindLargestNumberInServerResponse }
     * 
     */
    public FindLargestNumberInServerResponse createFindLargestNumberInServerResponse() {
        return new FindLargestNumberInServerResponse();
    }

    /**
     * Create an instance of {@link IsConnectedResponse }
     * 
     */
    public IsConnectedResponse createIsConnectedResponse() {
        return new IsConnectedResponse();
    }

    /**
     * Create an instance of {@link Sample }
     * 
     */
    public Sample createSample() {
        return new Sample();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSampleToServer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "addSampleToServer")
    public JAXBElement<AddSampleToServer> createAddSampleToServer(AddSampleToServer value) {
        return new JAXBElement<AddSampleToServer>(_AddSampleToServer_QNAME, AddSampleToServer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSampleToServerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "addSampleToServerResponse")
    public JAXBElement<AddSampleToServerResponse> createAddSampleToServerResponse(AddSampleToServerResponse value) {
        return new JAXBElement<AddSampleToServerResponse>(_AddSampleToServerResponse_QNAME, AddSampleToServerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLongestStringWithException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getLongestStringWithException")
    public JAXBElement<GetLongestStringWithException> createGetLongestStringWithException(GetLongestStringWithException value) {
        return new JAXBElement<GetLongestStringWithException>(_GetLongestStringWithException_QNAME, GetLongestStringWithException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNumberToServer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "addNumberToServer")
    public JAXBElement<AddNumberToServer> createAddNumberToServer(AddNumberToServer value) {
        return new JAXBElement<AddNumberToServer>(_AddNumberToServer_QNAME, AddNumberToServer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllSamplesWithTemperatureAboveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "findAllSamplesWithTemperatureAboveResponse")
    public JAXBElement<FindAllSamplesWithTemperatureAboveResponse> createFindAllSamplesWithTemperatureAboveResponse(FindAllSamplesWithTemperatureAboveResponse value) {
        return new JAXBElement<FindAllSamplesWithTemperatureAboveResponse>(_FindAllSamplesWithTemperatureAboveResponse_QNAME, FindAllSamplesWithTemperatureAboveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsConnected }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "isConnected")
    public JAXBElement<IsConnected> createIsConnected(IsConnected value) {
        return new JAXBElement<IsConnected>(_IsConnected_QNAME, IsConnected.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindSampleWithHighestTemperature }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "findSampleWithHighestTemperature")
    public JAXBElement<FindSampleWithHighestTemperature> createFindSampleWithHighestTemperature(FindSampleWithHighestTemperature value) {
        return new JAXBElement<FindSampleWithHighestTemperature>(_FindSampleWithHighestTemperature_QNAME, FindSampleWithHighestTemperature.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindSampleWithHighestTemperatureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "findSampleWithHighestTemperatureResponse")
    public JAXBElement<FindSampleWithHighestTemperatureResponse> createFindSampleWithHighestTemperatureResponse(FindSampleWithHighestTemperatureResponse value) {
        return new JAXBElement<FindSampleWithHighestTemperatureResponse>(_FindSampleWithHighestTemperatureResponse_QNAME, FindSampleWithHighestTemperatureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNumberToServerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "addNumberToServerResponse")
    public JAXBElement<AddNumberToServerResponse> createAddNumberToServerResponse(AddNumberToServerResponse value) {
        return new JAXBElement<AddNumberToServerResponse>(_AddNumberToServerResponse_QNAME, AddNumberToServerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindLargestNumberInServer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "findLargestNumberInServer")
    public JAXBElement<FindLargestNumberInServer> createFindLargestNumberInServer(FindLargestNumberInServer value) {
        return new JAXBElement<FindLargestNumberInServer>(_FindLargestNumberInServer_QNAME, FindLargestNumberInServer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsConnectedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "isConnectedResponse")
    public JAXBElement<IsConnectedResponse> createIsConnectedResponse(IsConnectedResponse value) {
        return new JAXBElement<IsConnectedResponse>(_IsConnectedResponse_QNAME, IsConnectedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllSamplesWithTemperatureAbove }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "findAllSamplesWithTemperatureAbove")
    public JAXBElement<FindAllSamplesWithTemperatureAbove> createFindAllSamplesWithTemperatureAbove(FindAllSamplesWithTemperatureAbove value) {
        return new JAXBElement<FindAllSamplesWithTemperatureAbove>(_FindAllSamplesWithTemperatureAbove_QNAME, FindAllSamplesWithTemperatureAbove.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindLargestNumberInServerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "findLargestNumberInServerResponse")
    public JAXBElement<FindLargestNumberInServerResponse> createFindLargestNumberInServerResponse(FindLargestNumberInServerResponse value) {
        return new JAXBElement<FindLargestNumberInServerResponse>(_FindLargestNumberInServerResponse_QNAME, FindLargestNumberInServerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLongestStringWithExceptionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getLongestStringWithExceptionResponse")
    public JAXBElement<GetLongestStringWithExceptionResponse> createGetLongestStringWithExceptionResponse(GetLongestStringWithExceptionResponse value) {
        return new JAXBElement<GetLongestStringWithExceptionResponse>(_GetLongestStringWithExceptionResponse_QNAME, GetLongestStringWithExceptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLongestString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getLongestString")
    public JAXBElement<GetLongestString> createGetLongestString(GetLongestString value) {
        return new JAXBElement<GetLongestString>(_GetLongestString_QNAME, GetLongestString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLongestStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://server/", name = "getLongestStringResponse")
    public JAXBElement<GetLongestStringResponse> createGetLongestStringResponse(GetLongestStringResponse value) {
        return new JAXBElement<GetLongestStringResponse>(_GetLongestStringResponse_QNAME, GetLongestStringResponse.class, null, value);
    }

}
