
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

    private final static QName _GetAdminPassword_QNAME = new QName("http://BankService.com/", "getAdminPassword");
    private final static QName _SendAllEmployeeNames_QNAME = new QName("http://BankService.com/", "sendAllEmployeeNames");
    private final static QName _SendAllEmployeePositions_QNAME = new QName("http://BankService.com/", "sendAllEmployeePositions");
    private final static QName _FindAdmin_QNAME = new QName("http://BankService.com/", "findAdmin");
    private final static QName _SendAllEmployeeNamesResponse_QNAME = new QName("http://BankService.com/", "sendAllEmployeeNamesResponse");
    private final static QName _SendAllEmployeePositionsResponse_QNAME = new QName("http://BankService.com/", "sendAllEmployeePositionsResponse");
    private final static QName _CreateEmployeeResponse_QNAME = new QName("http://BankService.com/", "createEmployeeResponse");
    private final static QName _FindAdminResponse_QNAME = new QName("http://BankService.com/", "findAdminResponse");
    private final static QName _GetAdminPasswordResponse_QNAME = new QName("http://BankService.com/", "getAdminPasswordResponse");
    private final static QName _SetEmpNameAndPosition_QNAME = new QName("http://BankService.com/", "setEmpNameAndPosition");
    private final static QName _CreateEmployee_QNAME = new QName("http://BankService.com/", "createEmployee");
    private final static QName _SetEmpNameAndPositionResponse_QNAME = new QName("http://BankService.com/", "setEmpNameAndPositionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bankservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendAllEmployeeNames }
     * 
     */
    public SendAllEmployeeNames createSendAllEmployeeNames() {
        return new SendAllEmployeeNames();
    }

    /**
     * Create an instance of {@link GetAdminPassword }
     * 
     */
    public GetAdminPassword createGetAdminPassword() {
        return new GetAdminPassword();
    }

    /**
     * Create an instance of {@link FindAdmin }
     * 
     */
    public FindAdmin createFindAdmin() {
        return new FindAdmin();
    }

    /**
     * Create an instance of {@link SendAllEmployeePositions }
     * 
     */
    public SendAllEmployeePositions createSendAllEmployeePositions() {
        return new SendAllEmployeePositions();
    }

    /**
     * Create an instance of {@link SendAllEmployeeNamesResponse }
     * 
     */
    public SendAllEmployeeNamesResponse createSendAllEmployeeNamesResponse() {
        return new SendAllEmployeeNamesResponse();
    }

    /**
     * Create an instance of {@link SendAllEmployeePositionsResponse }
     * 
     */
    public SendAllEmployeePositionsResponse createSendAllEmployeePositionsResponse() {
        return new SendAllEmployeePositionsResponse();
    }

    /**
     * Create an instance of {@link CreateEmployeeResponse }
     * 
     */
    public CreateEmployeeResponse createCreateEmployeeResponse() {
        return new CreateEmployeeResponse();
    }

    /**
     * Create an instance of {@link FindAdminResponse }
     * 
     */
    public FindAdminResponse createFindAdminResponse() {
        return new FindAdminResponse();
    }

    /**
     * Create an instance of {@link GetAdminPasswordResponse }
     * 
     */
    public GetAdminPasswordResponse createGetAdminPasswordResponse() {
        return new GetAdminPasswordResponse();
    }

    /**
     * Create an instance of {@link SetEmpNameAndPosition }
     * 
     */
    public SetEmpNameAndPosition createSetEmpNameAndPosition() {
        return new SetEmpNameAndPosition();
    }

    /**
     * Create an instance of {@link CreateEmployee }
     * 
     */
    public CreateEmployee createCreateEmployee() {
        return new CreateEmployee();
    }

    /**
     * Create an instance of {@link SetEmpNameAndPositionResponse }
     * 
     */
    public SetEmpNameAndPositionResponse createSetEmpNameAndPositionResponse() {
        return new SetEmpNameAndPositionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdminPassword }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BankService.com/", name = "getAdminPassword")
    public JAXBElement<GetAdminPassword> createGetAdminPassword(GetAdminPassword value) {
        return new JAXBElement<GetAdminPassword>(_GetAdminPassword_QNAME, GetAdminPassword.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendAllEmployeeNames }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BankService.com/", name = "sendAllEmployeeNames")
    public JAXBElement<SendAllEmployeeNames> createSendAllEmployeeNames(SendAllEmployeeNames value) {
        return new JAXBElement<SendAllEmployeeNames>(_SendAllEmployeeNames_QNAME, SendAllEmployeeNames.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendAllEmployeePositions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BankService.com/", name = "sendAllEmployeePositions")
    public JAXBElement<SendAllEmployeePositions> createSendAllEmployeePositions(SendAllEmployeePositions value) {
        return new JAXBElement<SendAllEmployeePositions>(_SendAllEmployeePositions_QNAME, SendAllEmployeePositions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAdmin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BankService.com/", name = "findAdmin")
    public JAXBElement<FindAdmin> createFindAdmin(FindAdmin value) {
        return new JAXBElement<FindAdmin>(_FindAdmin_QNAME, FindAdmin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendAllEmployeeNamesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BankService.com/", name = "sendAllEmployeeNamesResponse")
    public JAXBElement<SendAllEmployeeNamesResponse> createSendAllEmployeeNamesResponse(SendAllEmployeeNamesResponse value) {
        return new JAXBElement<SendAllEmployeeNamesResponse>(_SendAllEmployeeNamesResponse_QNAME, SendAllEmployeeNamesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendAllEmployeePositionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BankService.com/", name = "sendAllEmployeePositionsResponse")
    public JAXBElement<SendAllEmployeePositionsResponse> createSendAllEmployeePositionsResponse(SendAllEmployeePositionsResponse value) {
        return new JAXBElement<SendAllEmployeePositionsResponse>(_SendAllEmployeePositionsResponse_QNAME, SendAllEmployeePositionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEmployeeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BankService.com/", name = "createEmployeeResponse")
    public JAXBElement<CreateEmployeeResponse> createCreateEmployeeResponse(CreateEmployeeResponse value) {
        return new JAXBElement<CreateEmployeeResponse>(_CreateEmployeeResponse_QNAME, CreateEmployeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAdminResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BankService.com/", name = "findAdminResponse")
    public JAXBElement<FindAdminResponse> createFindAdminResponse(FindAdminResponse value) {
        return new JAXBElement<FindAdminResponse>(_FindAdminResponse_QNAME, FindAdminResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdminPasswordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BankService.com/", name = "getAdminPasswordResponse")
    public JAXBElement<GetAdminPasswordResponse> createGetAdminPasswordResponse(GetAdminPasswordResponse value) {
        return new JAXBElement<GetAdminPasswordResponse>(_GetAdminPasswordResponse_QNAME, GetAdminPasswordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetEmpNameAndPosition }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BankService.com/", name = "setEmpNameAndPosition")
    public JAXBElement<SetEmpNameAndPosition> createSetEmpNameAndPosition(SetEmpNameAndPosition value) {
        return new JAXBElement<SetEmpNameAndPosition>(_SetEmpNameAndPosition_QNAME, SetEmpNameAndPosition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEmployee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BankService.com/", name = "createEmployee")
    public JAXBElement<CreateEmployee> createCreateEmployee(CreateEmployee value) {
        return new JAXBElement<CreateEmployee>(_CreateEmployee_QNAME, CreateEmployee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetEmpNameAndPositionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BankService.com/", name = "setEmpNameAndPositionResponse")
    public JAXBElement<SetEmpNameAndPositionResponse> createSetEmpNameAndPositionResponse(SetEmpNameAndPositionResponse value) {
        return new JAXBElement<SetEmpNameAndPositionResponse>(_SetEmpNameAndPositionResponse_QNAME, SetEmpNameAndPositionResponse.class, null, value);
    }

}
