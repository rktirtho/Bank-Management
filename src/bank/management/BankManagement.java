/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.management;

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
    
}
