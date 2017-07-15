
package com.bankservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bankservice package. 
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

    private final static QName _SendCusAccNo_QNAME = new QName("http://BankService.com/", "sendCusAccNo");
    private final static QName _SetSortCode_QNAME = new QName("http://BankService.com/", "setSortCode");
    private final static QName _SetCustomerBDResponse_QNAME = new QName("http://BankService.com/", "setCustomerBDResponse");
    private final static QName _SendCusAccNoResponse_QNAME = new QName("http://BankService.com/", "sendCusAccNoResponse");
    private final static QName _SendAllStringDetails_QNAME = new QName("http://BankService.com/", "sendAllStringDetails");
    private final static QName _SetBalance_QNAME = new QName("http://BankService.com/", "setBalance");
    private final static QName _GetAllCustomersDetails_QNAME = new QName("http://BankService.com/", "getAllCustomersDetails");
    private final static QName _GetCurrentCusAccNo_QNAME = new QName("http://BankService.com/", "getCurrentCusAccNo");
    private final static QName _GetCustomerNameResponse_QNAME = new QName("http://BankService.com/", "getCustomerNameResponse");
    private final static QName _SendAllStringDetailsResponse_QNAME = new QName("http://BankService.com/", "sendAllStringDetailsResponse");
    private final static QName _SetCustomerBD_QNAME = new QName("http://BankService.com/", "setCustomerBD");
    private final static QName _SetSortCodeResponse_QNAME = new QName("http://BankService.com/", "setSortCodeResponse");
    private final static QName _GetCustomerName_QNAME = new QName("http://BankService.com/", "getCustomerName");
    private final static QName _GetAllCustomersDetailsResponse_QNAME = new QName("http://BankService.com/", "getAllCustomersDetailsResponse");
    private final static QName _SetBalanceResponse_QNAME = new QName("http://BankService.com/", "setBalanceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bankservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllCustomersDetails }
     * 
     */
    public GetAllCustomersDetails createGetAllCustomersDetails() {
        return new GetAllCustomersDetails();
    }

    /**
     * Create an instance of {@link GetCurrentCusAccNo }
     * 
     */
    public GetCurrentCusAccNo createGetCurrentCusAccNo() {
        return new GetCurrentCusAccNo();
    }

    /**
     * Create an instance of {@link GetCustomerNameResponse }
     * 
     */
    public GetCustomerNameResponse createGetCustomerNameResponse() {
        return new GetCustomerNameResponse();
    }

    /**
     * Create an instance of {@link SendAllStringDetailsResponse }
     * 
     */
    public SendAllStringDetailsResponse createSendAllStringDetailsResponse() {
        return new SendAllStringDetailsResponse();
    }

    /**
     * Create an instance of {@link SetCustomerBD }
     * 
     */
    public SetCustomerBD createSetCustomerBD() {
        return new SetCustomerBD();
    }

    /**
     * Create an instance of {@link SetSortCodeResponse }
     * 
     */
    public SetSortCodeResponse createSetSortCodeResponse() {
        return new SetSortCodeResponse();
    }

    /**
     * Create an instance of {@link GetCustomerName }
     * 
     */
    public GetCustomerName createGetCustomerName() {
        return new GetCustomerName();
    }

    /**
     * Create an instance of {@link SetBalanceResponse }
     * 
     */
    public SetBalanceResponse createSetBalanceResponse() {
        return new SetBalanceResponse();
    }

    /**
     * Create an instance of {@link GetAllCustomersDetailsResponse }
     * 
     */
    public GetAllCustomersDetailsResponse createGetAllCustomersDetailsResponse() {
        return new GetAllCustomersDetailsResponse();
    }

    /**
     * Create an instance of {@link SendCusAccNo }
     * 
     */
    public SendCusAccNo createSendCusAccNo() {
        return new SendCusAccNo();
    }

    /**
     * Create an instance of {@link SetCustomerBDResponse }
     * 
     */
    public SetCustomerBDResponse createSetCustomerBDResponse() {
        return new SetCustomerBDResponse();
    }

    /**
     * Create an instance of {@link SetSortCode }
     * 
     */
    public SetSortCode createSetSortCode() {
        return new SetSortCode();
    }

    /**
     * Create an instance of {@link SendCusAccNoResponse }
     * 
     */
    public SendCusAccNoResponse createSendCusAccNoResponse() {
        return new SendCusAccNoResponse();
    }

    /**
     * Create an instance of {@link SendAllStringDetails }
     * 
     */
    public SendAllStringDetails createSendAllStringDetails() {
        return new SendAllStringDetails();
    }

    /**
     * Create an instance of {@link SetBalance }
     * 
     */
    public SetBalance createSetBalance() {
        return new SetBalance();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendCusAccNo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BankService.com/", name = "sendCusAccNo")
    public JAXBElement<SendCusAccNo> createSendCusAccNo(SendCusAccNo value) {
        return new JAXBElement<SendCusAccNo>(_SendCusAccNo_QNAME, SendCusAccNo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetSortCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BankService.com/", name = "setSortCode")
    public JAXBElement<SetSortCode> createSetSortCode(SetSortCode value) {
        return new JAXBElement<SetSortCode>(_SetSortCode_QNAME, SetSortCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCustomerBDResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BankService.com/", name = "setCustomerBDResponse")
    public JAXBElement<SetCustomerBDResponse> createSetCustomerBDResponse(SetCustomerBDResponse value) {
        return new JAXBElement<SetCustomerBDResponse>(_SetCustomerBDResponse_QNAME, SetCustomerBDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendCusAccNoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BankService.com/", name = "sendCusAccNoResponse")
    public JAXBElement<SendCusAccNoResponse> createSendCusAccNoResponse(SendCusAccNoResponse value) {
        return new JAXBElement<SendCusAccNoResponse>(_SendCusAccNoResponse_QNAME, SendCusAccNoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendAllStringDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BankService.com/", name = "sendAllStringDetails")
    public JAXBElement<SendAllStringDetails> createSendAllStringDetails(SendAllStringDetails value) {
        return new JAXBElement<SendAllStringDetails>(_SendAllStringDetails_QNAME, SendAllStringDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetBalance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BankService.com/", name = "setBalance")
    public JAXBElement<SetBalance> createSetBalance(SetBalance value) {
        return new JAXBElement<SetBalance>(_SetBalance_QNAME, SetBalance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCustomersDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BankService.com/", name = "getAllCustomersDetails")
    public JAXBElement<GetAllCustomersDetails> createGetAllCustomersDetails(GetAllCustomersDetails value) {
        return new JAXBElement<GetAllCustomersDetails>(_GetAllCustomersDetails_QNAME, GetAllCustomersDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentCusAccNo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BankService.com/", name = "getCurrentCusAccNo")
    public JAXBElement<GetCurrentCusAccNo> createGetCurrentCusAccNo(GetCurrentCusAccNo value) {
        return new JAXBElement<GetCurrentCusAccNo>(_GetCurrentCusAccNo_QNAME, GetCurrentCusAccNo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BankService.com/", name = "getCustomerNameResponse")
    public JAXBElement<GetCustomerNameResponse> createGetCustomerNameResponse(GetCustomerNameResponse value) {
        return new JAXBElement<GetCustomerNameResponse>(_GetCustomerNameResponse_QNAME, GetCustomerNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendAllStringDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BankService.com/", name = "sendAllStringDetailsResponse")
    public JAXBElement<SendAllStringDetailsResponse> createSendAllStringDetailsResponse(SendAllStringDetailsResponse value) {
        return new JAXBElement<SendAllStringDetailsResponse>(_SendAllStringDetailsResponse_QNAME, SendAllStringDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCustomerBD }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BankService.com/", name = "setCustomerBD")
    public JAXBElement<SetCustomerBD> createSetCustomerBD(SetCustomerBD value) {
        return new JAXBElement<SetCustomerBD>(_SetCustomerBD_QNAME, SetCustomerBD.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetSortCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BankService.com/", name = "setSortCodeResponse")
    public JAXBElement<SetSortCodeResponse> createSetSortCodeResponse(SetSortCodeResponse value) {
        return new JAXBElement<SetSortCodeResponse>(_SetSortCodeResponse_QNAME, SetSortCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomerName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BankService.com/", name = "getCustomerName")
    public JAXBElement<GetCustomerName> createGetCustomerName(GetCustomerName value) {
        return new JAXBElement<GetCustomerName>(_GetCustomerName_QNAME, GetCustomerName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCustomersDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BankService.com/", name = "getAllCustomersDetailsResponse")
    public JAXBElement<GetAllCustomersDetailsResponse> createGetAllCustomersDetailsResponse(GetAllCustomersDetailsResponse value) {
        return new JAXBElement<GetAllCustomersDetailsResponse>(_GetAllCustomersDetailsResponse_QNAME, GetAllCustomersDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetBalanceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BankService.com/", name = "setBalanceResponse")
    public JAXBElement<SetBalanceResponse> createSetBalanceResponse(SetBalanceResponse value) {
        return new JAXBElement<SetBalanceResponse>(_SetBalanceResponse_QNAME, SetBalanceResponse.class, null, value);
    }

}
