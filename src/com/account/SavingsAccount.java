/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.account;

/**
 *
 * @author DELL
 */
public class SavingsAccount extends BankAccount implements IncomeTax, Interest{

    public SavingsAccount(String accountNumber, double banance) {
        super(accountNumber, banance);
    }
    /**
     * 
     * @param balance 
     * @exception This method withdraw money from client account.
     * Here notice if client deposited amount is less then 500 BDT. Then system automatic prevent withdraw.
     */

    @Override
    public void withdraw(double balance) {
        if (getBanance()+500>balance) {
            super.withdraw(balance);
        } else {
            System.err.println("You Have not Enough Balance to widtdraw. \nYour Current Balance is "
                    +getBanance());
        }
    }
 
    @Override
    public void serviceCharge() {
        
        //This method is override from parent class. This is impossible to implement without real system. Becouse of here need database and other feature. 
        
    }

    @Override
    public void incomeTax() {
       
        
    }

    @Override
    public void interest() {
        
        
    }
    
}
