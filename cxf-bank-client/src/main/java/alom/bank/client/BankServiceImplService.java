package alom.bank.client;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceFeature;
import jakarta.xml.ws.Service;

/**
 * This class was generated by Apache CXF 4.0.5
 * 2024-09-27T12:27:55.987+02:00
 * Generated source version: 4.0.5
 *
 */
@WebServiceClient(name = "BankServiceImplService",
                  wsdlLocation = "http://localhost:8080/cxf-bank-server/BankService?wsdl",
                  targetNamespace = "http://service.server.bank.alom/")
public class BankServiceImplService extends Service {

    public static final URL WSDL_LOCATION;

    public static final QName SERVICE = new QName("http://service.server.bank.alom/", "BankServiceImplService");
    public static final QName BankServiceImplPort = new QName("http://service.server.bank.alom/", "BankServiceImplPort");
    static {
        URL url = null;
        try {
            url = URI.create("http://localhost:8080/cxf-bank-server/BankService?wsdl").toURL();
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(BankServiceImplService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/cxf-bank-server/BankService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public BankServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public BankServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BankServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public BankServiceImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public BankServiceImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public BankServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns BankService
     */
    @WebEndpoint(name = "BankServiceImplPort")
    public BankService getBankServiceImplPort() {
        return super.getPort(BankServiceImplPort, BankService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BankService
     */
    @WebEndpoint(name = "BankServiceImplPort")
    public BankService getBankServiceImplPort(WebServiceFeature... features) {
        return super.getPort(BankServiceImplPort, BankService.class, features);
    }

}
