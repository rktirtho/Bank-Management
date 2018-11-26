/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.client;

import com.account.BankAccount;
import com.human.Address;
import com.human.Person;

/**
 *
 * @author DELL
 */
public class Client extends Person{
    private String userName;
    private String password;
    private BankAccount account;

    public Client(String userName, String password, BankAccount account, String firstName, String lastName, String fatherName, String motherName, Address address) {
        super(firstName, lastName, fatherName, motherName, address);
        this.userName = userName;
        this.password = password;
        this.account = account;
    }

    public Client(String userName, String password, BankAccount account, String firstName, String lastName, String dateOfBirth, String fatherName, String motherName, Address address) {
        super(firstName, lastName, dateOfBirth, fatherName, motherName, address);
        this.userName = userName;
        this.password = password;
        this.account = account;
    }

    public Client(String userName, String password, BankAccount account, String firstName, String middleName, String lastName, String dateOfBirth, String fatherName, String motherName, Address address) {
        super(firstName, middleName, lastName, dateOfBirth, fatherName, motherName, address);
        this.userName = userName;
        this.password = password;
        this.account = account;
    }
    
    
    
    
    
    
    
    
    
}
