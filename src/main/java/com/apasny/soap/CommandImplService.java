
package com.apasny.soap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CommandImplService", targetNamespace = "http://service.commandj11.example.com/", wsdlLocation = "https://af95-185-119-1-92.eu.ngrok.io/groups?wsdl")
public class CommandImplService
    extends Service
{

    private final static URL COMMANDIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException COMMANDIMPLSERVICE_EXCEPTION;
    private final static QName COMMANDIMPLSERVICE_QNAME = new QName("http://service.commandj11.example.com/", "CommandImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://af95-185-119-1-92.eu.ngrok.io/groups?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        COMMANDIMPLSERVICE_WSDL_LOCATION = url;
        COMMANDIMPLSERVICE_EXCEPTION = e;
    }

    public CommandImplService() {
        super(__getWsdlLocation(), COMMANDIMPLSERVICE_QNAME);
    }

    public CommandImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), COMMANDIMPLSERVICE_QNAME, features);
    }

    public CommandImplService(URL wsdlLocation) {
        super(wsdlLocation, COMMANDIMPLSERVICE_QNAME);
    }

    public CommandImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, COMMANDIMPLSERVICE_QNAME, features);
    }

    public CommandImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CommandImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Command
     */
    @WebEndpoint(name = "CommandImplPort")
    public Command getCommandImplPort() {
        return super.getPort(new QName("http://service.commandj11.example.com/", "CommandImplPort"), Command.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Command
     */
    @WebEndpoint(name = "CommandImplPort")
    public Command getCommandImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.commandj11.example.com/", "CommandImplPort"), Command.class, features);
    }

    private static URL __getWsdlLocation() {
        if (COMMANDIMPLSERVICE_EXCEPTION!= null) {
            throw COMMANDIMPLSERVICE_EXCEPTION;
        }
        return COMMANDIMPLSERVICE_WSDL_LOCATION;
    }

}
