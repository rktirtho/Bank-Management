/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.account;

/**
 *
 * @author Rejaul Karim
 */
public abstract class BankAccount {
    private final String accountNumber;
    private double banance;

    public BankAccount(String accountNumber, double banance) {
        this.accountNumber = accountNumber;
        this.banance = banance;
    }
    
    

    public String getAccountNumber() {
        return accountNumber;
    }


    public double getBanance() {
        return banance;
    }

    public void deposite(double banance) {
        this.banance+=banance;
        System.out.println("Success Deposite "+banance+" BDT.");
    }
    public void withdraw(double balance){
            this.banance-=balance;
    }
    
    public abstract void serviceCharge();
    
    
    
}
