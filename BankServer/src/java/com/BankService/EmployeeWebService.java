/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BankService;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.sql.SQLException;
import java.sql.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author hsedi
 */
@WebService(serviceName = "EmployeeWebService")
public class EmployeeWebService {

    private static String dbUserName = "root";
    private static String dbPassword = "";
    private static String dbDriverClass = "com.mysql.jdbc.Driver";
    private static String dbURL = "jdbc:mysql://localhost:3306/high_street_bank?zeroDateTimeBehavior=convertToNull";
    private static Connection con = null;
    private DatabaseConnection dbCon = new DatabaseConnection();

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getName")
    public String getName(String empName) {

        String name = dbCon.getName(empName);
        return name;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "findUser")
    public boolean findUser(@WebParam(name = "userName") String userName) {
        //TODO write your implementation code here:
        boolean check = dbCon.findUser(userName);

        return check;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getPassword")
    public String getPassword(String userName) {
        //TODO write your implementation code here:
        String userPassword = dbCon.getPassword(userName);
        return userPassword;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "deleteCustomer")
    public boolean deleteCustomer(@WebParam(name = "accountNumber") String accountNumber) {
        //TODO write your implementation code here:
        return dbCon.deleteCustomer(accountNumber);
    }

}
