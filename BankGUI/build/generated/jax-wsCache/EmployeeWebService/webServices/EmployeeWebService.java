
package webServices;

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
@WebService(name = "EmployeeWebService", targetNamespace = "http://BankService.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EmployeeWebService {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getName", targetNamespace = "http://BankService.com/", className = "webServices.GetName")
    @ResponseWrapper(localName = "getNameResponse", targetNamespace = "http://BankService.com/", className = "webServices.GetNameResponse")
    @Action(input = "http://BankService.com/EmployeeWebService/getNameRequest", output = "http://BankService.com/EmployeeWebService/getNameResponse")
    public String getName(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param userName
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findUser", targetNamespace = "http://BankService.com/", className = "webServices.FindUser")
    @ResponseWrapper(localName = "findUserResponse", targetNamespace = "http://BankService.com/", className = "webServices.FindUserResponse")
    @Action(input = "http://BankService.com/EmployeeWebService/findUserRequest", output = "http://BankService.com/EmployeeWebService/findUserResponse")
    public boolean findUser(
        @WebParam(name = "userName", targetNamespace = "")
        String userName);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getPassword", targetNamespace = "http://BankService.com/", className = "webServices.GetPassword")
    @ResponseWrapper(localName = "getPasswordResponse", targetNamespace = "http://BankService.com/", className = "webServices.GetPasswordResponse")
    @Action(input = "http://BankService.com/EmployeeWebService/getPasswordRequest", output = "http://BankService.com/EmployeeWebService/getPasswordResponse")
    public String getPassword(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
