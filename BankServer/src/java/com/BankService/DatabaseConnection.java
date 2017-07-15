/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BankService;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author hsedi
 */
public class DatabaseConnection {
    
    private static String dbUserName = "root";
    private static String dbPassword = "";
    private static String dbDriverClass = "com.mysql.jdbc.Driver";
    private static String dbURL = "jdbc:mysql://localhost:3306/high_street_bank?zeroDateTimeBehavior=convertToNull";
    private static Connection con = null;
    private static Statement stmt= null;
    private static PreparedStatement pstmt = null;
    
//----------------------------------------------employeee-----------------------------------------------------------------------
   public String getName(String empName) {
       String gg = null;
       try{  
            Class.forName(dbDriverClass);  
            con=DriverManager.getConnection(dbURL,dbUserName,dbPassword); 
            stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from employee where userName = '"+empName+"'");  
            while(rs.next())
            gg = rs.getString("Name");
            con.close();  
            }catch(Exception e){ gg="User Not Found";} 
       
            return gg;
            }  
       
       
       
    public boolean findUser(String userName){
        
        boolean find = false;
        try{  
            Class.forName(dbDriverClass);  
            con=DriverManager.getConnection(dbURL,dbUserName,dbPassword);
            stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from employee");  
            while(rs.next()){
                if (userName.equals(rs.getString("userName"))) {
                    find = true;
                }
            }
            con.close();  
            }catch(Exception e){
                System.out.println("User Not Found");
            } 
                
        return find;
    }

    public String getPassword(String userName) {
        String userPassword = null;
        
        try{  
            Class.forName(dbDriverClass);  
            con=DriverManager.getConnection(dbURL,dbUserName,dbPassword); 
            stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from employee where userName = '"+userName+"'");  
            while(rs.next()){
                userPassword = rs.getString("userPassword");
            }
            con.close();  
            }catch(Exception e){
                System.out.println("User Not Found");
            }
        
        return userPassword;
    }
    
    //-----------------------------------------------Customer---------------------------------------------------------------
    
    public ArrayList<String> sendAllCustomerAccountNumbers (){
        
        ArrayList<String> accountNumbers = new ArrayList<>();
        
         try{  
            Class.forName(dbDriverClass);  
            con=DriverManager.getConnection(dbURL,dbUserName,dbPassword); 
            stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from customer");  
            while(rs.next()){
                accountNumbers.add(rs.getString("accountNumber"));
            }
            con.close();  
            }catch(Exception e){
                System.out.println("User Not Found");
            }
        
        return accountNumbers;    
    }
    
    public ArrayList<String> sendAllCustomersNames(){
        
        ArrayList<String> customerName = new ArrayList<>();
        
        try{  
            Class.forName(dbDriverClass);  
            con=DriverManager.getConnection(dbURL,dbUserName,dbPassword); 
            stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from customer");  
            while(rs.next()){
                customerName.add(rs.getString("customerName"));
            }
            con.close();  
            }catch(Exception e){
                System.out.println("User Not Found");
            }
        
        return customerName;
    }
    
    public ArrayList<String> sendAllStringDetails(String accNo){
        
        ArrayList<String> stringDeatails = new ArrayList<>();
        
        try{  
            Class.forName(dbDriverClass);  
            con=DriverManager.getConnection(dbURL,dbUserName,dbPassword); 
            stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from customer where accountNumber ='"+accNo+"'");  
            while(rs.next()){
                stringDeatails.add(rs.getString("customerName"));
                stringDeatails.add(rs.getString("address"));
                stringDeatails.add(rs.getString("mobile"));
                stringDeatails.add(rs.getString("email"));
                stringDeatails.add(rs.getString("accountType"));
                stringDeatails.add(rs.getString("accountNumber"));
                stringDeatails.add(rs.getString("card"));
            }
            con.close();  
            }catch(Exception e){
                System.out.println("User Not Found");
            }
        
        return stringDeatails;
    }
    
    public Date sendCustomerBD (String accNo){
        Date date = new Date();
        
        try{  
            Class.forName(dbDriverClass);  
            con=DriverManager.getConnection(dbURL,dbUserName,dbPassword); 
            stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from customer where accountNumber ='"+accNo+"'");  
            while(rs.next()){
                date = rs.getDate("birthDate");
            }
            con.close();  
            }catch(Exception e){
                System.out.println("User Not Found");
            }
        System.out.println(date);
        return date;    
    }
    public double setBalance(String accNo){
        
        double balance=0.00;
        
        try{  
            Class.forName(dbDriverClass);  
            con=DriverManager.getConnection(dbURL,dbUserName,dbPassword); 
            stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from customer where accountNumber ='"+accNo+"'");  
            while(rs.next()){
                balance = rs.getDouble("balance");
            }
            con.close();  
            }catch(Exception e){
                System.out.println("User Not Found");
            }
        
        return balance;
          
    }
    
    public int setScode(String accNo){
        
        int scode=0;
        
        try{  
            Class.forName(dbDriverClass);  
            con=DriverManager.getConnection(dbURL,dbUserName,dbPassword); 
            stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from customer where accountNumber ='"+accNo+"'");  
            while(rs.next()){
                scode = rs.getInt("sortCode");
            }
            con.close();  
            }catch(Exception e){
                System.out.println("User Not Found");
            }
        
        return scode;
          
    }
    
    //------------------------------------------------admin---------------------------------------------------------------------
    
    public boolean findAdmin(String userName){
        
        boolean find = false;
        try{  
            Class.forName(dbDriverClass);  
            con=DriverManager.getConnection(dbURL,dbUserName,dbPassword);
            stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from admin");  
            while(rs.next()){
                if (userName.equals(rs.getString("userName"))) {
                    find = true;
                }
            }
            con.close();  
            }catch(Exception e){
                System.out.println("User Not Found");
            } 
                
        return find;
    }
    
    public String getAdminPassword(String userName) {
        String userPassword = null;
        
        try{  
            Class.forName(dbDriverClass);  
            con=DriverManager.getConnection(dbURL,dbUserName,dbPassword); 
            stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from admin where userName = '"+userName+"'");  
            while(rs.next()){
                userPassword = rs.getString("userPassword");
            }
            con.close();  
            }catch(Exception e){
                System.out.println("User Not Found");
            }
        
        return userPassword;
    }
    public boolean insertEmployee(String userName,String userPassword,String name, String position){
        
        boolean inserted = false;
        
        try{  
            Class.forName(dbDriverClass);  
            con=DriverManager.getConnection(dbURL,dbUserName,dbPassword); 
            stmt=con.createStatement();
            String query = "Insert Into employee (userID,userName,userPassword,position,Name)"+
                    " VALUES(?,?,?,?,?)";
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, null);
            pstmt.setString(2, userName);
            pstmt.setString(3, userPassword);
            pstmt.setString(4, position);
            pstmt.setString(5, name);
            
            pstmt.execute();
            inserted = true;
            con.close();  
            }catch(Exception e){
                System.out.println("User Not inserted");
                System.err.println(e);
            }
        
        return inserted;    
    }
    
    public ArrayList<String> sendAllEmployeeNames(){
        
        ArrayList<String> allNames = new ArrayList<>();
        
        try{  
            Class.forName(dbDriverClass);  
            con=DriverManager.getConnection(dbURL,dbUserName,dbPassword); 
            stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from employee");  
            while(rs.next()){
                allNames.add(rs.getString("Name"));
            }
            con.close();  
            }catch(Exception e){
                System.out.println("User Not Found");
            }
        
        return allNames;    
    }
    
    public ArrayList<String> sendAllEmployeePositions(){
        
        ArrayList<String> allPosition = new ArrayList<>();
        
        try{  
            Class.forName(dbDriverClass);  
            con=DriverManager.getConnection(dbURL,dbUserName,dbPassword); 
            stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from employee");  
            while(rs.next()){
                allPosition.add(rs.getString("Position"));
            }
            con.close();  
            }catch(Exception e){
                System.out.println("User Not Found");
            }
        
        return allPosition;    
    }
    
}    
    
        
    
    
    
    
    

