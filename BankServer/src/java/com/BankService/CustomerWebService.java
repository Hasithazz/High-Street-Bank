/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BankService;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author hsedi
 */
@WebService(serviceName = "CustomerWebService")
public class CustomerWebService {
    
    private  DatabaseConnection dbCon = new DatabaseConnection();
    private static String customerAccountNumber;
    

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getAllCustomersDetails")
    public ArrayList<String> getAllCustomersDetails() throws NullPointerException {
        //TODO write your implementation code here:
        
        ArrayList<String> customerArrayList =new ArrayList<>();
        customerArrayList = dbCon.sendAllCustomerAccountNumbers();
        
        return customerArrayList;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getCustomerName")
    public ArrayList<String> getCustomerName() throws InputMismatchException {
        //TODO wrigte your implementation code here:
        
        ArrayList<String> customerNameArrayList =new ArrayList<>();
        customerNameArrayList = dbCon.sendAllCustomersNames();
        return customerNameArrayList;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getCurrentCusAccNo")
    @Oneway
    public void getCurrentCusAccNo(@WebParam(name = "accNO") String accNO) {
        customerAccountNumber = accNO;
        System.out.println(customerAccountNumber);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "sendCusAccNo")
    public String sendCusAccNo() {
        //TODO write your implementation code here:
        System.out.println("sending "+customerAccountNumber);
        return customerAccountNumber;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "sendAllStringDetails")
    public ArrayList<String> sendAllStringDetails(@WebParam(name = "accNo") String accNo) {
        //TODO write your implementation code here:
        
        return dbCon.sendAllStringDetails(accNo);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "setCustomerBD")
    public String setCustomerBD(@WebParam(name = "accNo") String accNo) {
        String Stringdate;
        //TODO write your implementation code here:
        Date date = dbCon.sendCustomerBD(accNo);
        
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Stringdate = df.format(date);
        System.out.println("String Date"+Stringdate);
        
        return Stringdate;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "setBalance")
    public double setBalance(@WebParam(name = "accNo") String accNo) {
        //TODO write your implementation code here:      
        return dbCon.setBalance(accNo);//geting balance from DatabaseConnection calss
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "setSortCode")
    public int setSortCode(@WebParam(name = "accNo") String accNo) {
        //TODO write your implementation code here:
        return dbCon.setScode(accNo);
    }

}
