/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.management;

import com.account.BankAccount;
import com.account.CheckingAccount;
import com.account.SavingsAccount;
import com.client.Client;
import com.util.Rom;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class BankManagement {
    private static String userName;
    private static String password;
    private static ArrayList<Client> clients;

    /**
     * @param args the command line arguments
     */
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        
        Rom.printROM();
        
        while (true) {
            System.out.println("Press 'A' for Admin Panel.\nPress 'B' for Account Holder");
            String adminORUSer= scanner.nextLine().toUpperCase();
            System.out.println("\n\n\n");
            
            switch (adminORUSer) {
                case "A":
//                    Admin Consol
                   
                    
                    break;
                case "B":
                    System.out.println("User Name: ");
                    userName = scanner.nextLine();
                    System.out.println("Password: ");
                    password = scanner.nextLine();
                    
                    
                    
                   System.out.println("Select Menu");
                   System.out.println("1\tCheck Balance");
                    System.out.println("2\tWithdraw");
                    System.out.println("4\tDeposite");
                    System.out.println("4\tExti");
                    
                    
                    
                    break;
                default:
                      System.err.println("wrong Input");
                    break;
            }
            
            
            
        }
    }
    
    
    
    
    
    private static void initialDatabase(){
    BankAccount svAccount1 = new SavingsAccount("SVS-220 424 12353", 30000);
    BankAccount svAccount2 = new SavingsAccount("SVS-220 424 12353", 30000);
    BankAccount svAccount3 = new SavingsAccount("SVS-220 424 12353", 30000);
    BankAccount svAccount4 = new SavingsAccount("SVS-220 424 12353", 30000);
    BankAccount svAccount5 = new SavingsAccount("SVS-220 424 12353", 30000);
    BankAccount svAccount6 = new SavingsAccount("SVS-220 424 12353", 30000);
    BankAccount svAccount7 = new SavingsAccount("SVS-220 424 12353", 30000);
    BankAccount svAccount8 = new SavingsAccount("SVS-220 424 12353", 30000);
    BankAccount svAccount9 = new SavingsAccount("SVS-220 424 12353", 30000);
    BankAccount svAccount0 = new SavingsAccount("SVS-220 424 12353", 30000);
   
    BankAccount chAccount0 = new CheckingAccount("CHK-", 0);
    BankAccount chAccount1 = new CheckingAccount("CHK-", 0);
    BankAccount chAccount2 = new CheckingAccount("CHK-", 0);
    BankAccount chAccount3 = new CheckingAccount("CHK-", 0);
    BankAccount chAccount4 = new CheckingAccount("CHK-", 0);
    BankAccount chAccount5 = new CheckingAccount("CHK-", 0);
    BankAccount chAccount6 = new CheckingAccount("CHK-", 0);
    BankAccount chAccount7 = new CheckingAccount("CHK-", 0);
    BankAccount chAccount8 = new CheckingAccount("CHK-", 0);
    BankAccount chAccount9 = new CheckingAccount("CHK-", 0);
   
    
    BankAccount crAccount0=new CheckingAccount("CR", 0);
    BankAccount crAccount1=new CheckingAccount("CR", 0);
    BankAccount crAccount2=new CheckingAccount("CR", 0);
    BankAccount crAccount3=new CheckingAccount("CR", 0);
    BankAccount crAccount4=new CheckingAccount("CR", 0);
    BankAccount crAccount5=new CheckingAccount("CR", 0);
    BankAccount crAccount6=new CheckingAccount("CR", 0);
    BankAccount crAccount7=new CheckingAccount("CR", 0);
    BankAccount crAccount8=new CheckingAccount("CR", 0);
    BankAccount crAccount9=new CheckingAccount("CR", 0);
    
    clients =new ArrayList<>();
   
//    Client c = new Client(userName, password, crAccount9, userName, userName, userName, userName, address);
    
    
    }
    
}
