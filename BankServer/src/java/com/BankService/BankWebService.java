/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BankService;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author hsedi
 */
@WebService(serviceName = "BankWebService")
public class BankWebService {
    private DatabaseConnection dbCon = new DatabaseConnection();
    private String name,position;

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findAdmin")
    public boolean findAdmin(@WebParam(name = "userName") String userName) {
        //TODO write your implementation code here:
        return dbCon.findAdmin(userName);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getAdminPassword")
    public String getAdminPassword(@WebParam(name = "userName") String userName) {
        //TODO write your implementation code here:
        return dbCon.getAdminPassword(userName);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "createEmployee")
    public boolean createEmployee(@WebParam(name = "userName") String userName, @WebParam(name = "password") String password, @WebParam(name = "Name") String Name, @WebParam(name = "position") String position) {
        //TODO write your implementation code here:
        return dbCon.insertEmployee(userName, password, Name, position);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "sendAllEmployeeNames")
    public ArrayList<String> sendAllEmployeeNames() {
        //TODO write your implementation code here:
        
        return dbCon.sendAllEmployeeNames();
    }
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "sendAllEmployeePositions")
    public ArrayList<String> sendAllEmployeePositions() {
        //TODO write your implementation code here:
        
        return dbCon.sendAllEmployeePositions();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "setEmpNameAndPosition")
    public void setEmpNameAndPosition(String name, String position) {
        //TODO write your implementation code here:
        this.name = name;
        this.position = position;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "setEmployeeDetails")
    public ArrayList<String> setEmployeeDetails(@WebParam(name = "name") String name, @WebParam(name = "position") String position) {
        //TODO write your implementation code here:
        
        return dbCon.setEmployeeDetails(name, position);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getEmployeeName")
    public String getEmployeeName() {
        //TODO write your implementation code here:
        return name;
    }
    
     /**
     * Web service operation
     */
    @WebMethod(operationName = "getEmployeePosition")
    public String getEmployeePosition() {
        //TODO write your implementation code here:
        return position;
    }
    
    
}
