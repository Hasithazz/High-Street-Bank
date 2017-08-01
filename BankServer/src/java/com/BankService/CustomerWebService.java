/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BankService;

import java.text.ParseException;
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

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addNewCustomer")
    public boolean addNewCustomer(@WebParam(name = "name") String name,
            @WebParam(name = "address") String address,
            @WebParam(name = "bday") String bday, @WebParam(name = "sortCode") String sortCode,
            @WebParam(name = "accountType") String accountType,
            @WebParam(name = "accountNumber") String accountNumber,
            @WebParam(name = "card") String card, @WebParam(name = "mobile") String mobile,
            @WebParam(name = "balance") String balance, @WebParam(name = "email") String email) throws ParseException {
        //TODO write your implementation code here:
        
        double doubleBalance = Double.parseDouble(balance);
        int intSortCode = Integer.parseInt(sortCode);
        Date BD = new SimpleDateFormat("yyyy-MM-dd").parse(bday);
        java.sql.Date sqlBD = new java.sql.Date(BD.getTime());
               
        return dbCon.insertNewCustomer(name, address, sqlBD, intSortCode, accountType, accountNumber, card, mobile, doubleBalance, email);
    }
}
