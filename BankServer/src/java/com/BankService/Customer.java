/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BankService;

import java.util.Date;

/**
 *
 * @author hsedi
 */
public class Customer {
    private String customerName;
    private Date customerBD;
    private String customerAddress;
    private String customermobile;
    private String customerEmail;
    private String customerAccountNumber;
    private String customerAccountType;
    private int customerSortCode;
    private double customerBalance;
    private String customerCard;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getCustomerBD() {
        return customerBD;
    }

    public void setCustomerBD(Date customerBD) {
        this.customerBD = customerBD;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomermobile() {
        return customermobile;
    }

    public void setCustomermobile(String customermobile) {
        this.customermobile = customermobile;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerAccountNumber() {
        return customerAccountNumber;
    }

    public void setCustomerAccountNumber(String customerAccountNumber) {
        this.customerAccountNumber = customerAccountNumber;
    }

    public String getCustomerAccountType() {
        return customerAccountType;
    }

    public void setCustomerAccountType(String customerAccountType) {
        this.customerAccountType = customerAccountType;
    }

    public int getCustomerSortCode() {
        return customerSortCode;
    }

    public void setCustomerSortCode(int customerSortCode) {
        this.customerSortCode = customerSortCode;
    }

    public double getCustomerBalance() {
        return customerBalance;
    }

    public void setCustomerBalance(double customerBalance) {
        this.customerBalance = customerBalance;
    }

    public String getCustomerCard() {
        return customerCard;
    }

    public void setCustomerCard(String customerCard) {
        this.customerCard = customerCard;
    }
    
    
}
