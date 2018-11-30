/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.management;

import com.account.BankAccount;
import com.account.CheckingAccount;
import com.account.CreditAccount;
import com.account.SavingsAccount;
import com.client.Client;
import com.employee.Employee;
import com.human.Address;
import com.util.Rom;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class BankManagement {

    private static String userName;
    private static String password;
    private static ArrayList<Client> clients;
    private static ArrayList<Employee> employees;

    /**
     * @param args the command line arguments
     */
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initialDatabase();
        employeeTable();
        Rom.printROM();

        while (true) {
            System.out.println("Press 'A' for Employee.\nPress 'B' for Account Holder");
            String adminORUSer = scanner.nextLine().toUpperCase();
            System.out.println("\n\n\n");

            switch (adminORUSer) {
                case "A":
                    System.out.println("Enter Employee ID: ");
                    String employeeID = scanner.nextLine();
                    Employee employee = null;
                    for (Employee employee1 : employees) {

                        if (employeeID.equals(employee1.getEmployeeId())) {
                            employee = employee1;

                        } else {
                            System.err.println("UserName and password doesnot Match");
                            return;
                        }
                    }

                    printEmployeeMenu();
                    System.out.println("Select Menu: ");
                    String employeeselectedMenu = scanner.nextLine();

                    switch (employeeselectedMenu) {
                        case "1":

                            System.out.println("\n\n===============\nSelect Account Type");
                            System.out.println("1.\tChekcking Account");
                            System.out.println("2.\tSavings Account");
                            System.out.println("3.\tCredit Account");
                            String accountType = scanner.nextLine();
                            System.out.println("Enter Account Holder First Name");
                            String customerFirstName = scanner.nextLine();
                             System.out.println("Enter Account Holder First Name");
                            String customerMiddleName = scanner.nextLine();
                            System.out.println("Enter Account Holder First Name");
                            String customerLastName = scanner.nextLine();
                            
                             System.out.println("Enter Account Holder First Name");
                            String customerFatherName = scanner.nextLine();
                           
                            System.out.println("Enter Account Holder First Name");
                            String customerMotherName = scanner.nextLine();
                            
                             System.out.println("Enter Account Holder First Name");
                            String customerHouseNumber = scanner.nextLine();
                           
                             System.out.println("Enter Account Holder First Name");
                            String customerRoadName = scanner.nextLine();
                           
                             System.out.println("Enter Account Holder First Name");
                            String customerpostOffice = scanner.nextLine();
                           
                            System.out.println("Enter Account Holder First Name");
                            String customerSubDiscrict = scanner.nextLine();
                           
                             System.out.println("Enter Account Holder First Name");
                            String customerDistrict = scanner.nextLine();
                           
                             System.out.println("Enter Account Holder First Name");
                            String customerPostCode = scanner.nextLine();
                            
                             System.out.println("Enter Account Holder First Name");
                            String customerUserID = scanner.nextLine();
                           
                             System.out.println("Enter Account Holder First Name");
                            String customerPassword = scanner.nextLine();
                           
                            
                            Address address = new Address(customerHouseNumber
                                    , customerRoadName,
                                    customerpostOffice,
                                    customerSubDiscrict,
                                    customerDistrict,
                                    customerPostCode);
                           
                             System.out.println("Enter New Account Number");
                            String accountNumber = scanner.nextLine();
                            System.out.println("Enter Opening Deposite");
                            double openingBalance = scanner.nextDouble();
                            
                             System.out.println("Enter Account Holder First Name");
                            String customerBirthDate = scanner.nextLine();
                           
                            
                            switch (accountType) {
                                case "1":
                                    BankAccount account = new CheckingAccount(accountNumber, openingBalance);
                                    Client client = new Client(customerUserID,
                                            customerPassword
                                            ,account
                                            ,customerFirstName,
                                            customerMiddleName,
                                            customerLastName, 
                                            customerBirthDate,
                                            customerFatherName,
                                            customerMotherName,
                                            address
                                    );
                                   clients.add(client);
                                    break;
                                case "2":
                                    BankAccount account1 = new SavingsAccount(accountNumber,openingBalance);
                                    Client client1 = new Client(customerUserID,
                                            customerPassword
                                            ,account1
                                            ,customerFirstName,
                                            customerMiddleName,
                                            customerLastName, 
                                            customerBirthDate,
                                            customerFatherName,
                                            customerMotherName,
                                            address
                                    );
                                     clients.add(client1);
                                    
                                    break;
                                case "3":
                                    BankAccount creditAccount=new CreditAccount(accountNumber,openingBalance);
                                     Client client2 = new Client(customerUserID,
                                            customerPassword
                                            ,creditAccount
                                            ,customerFirstName,
                                            customerMiddleName,
                                            customerLastName, 
                                            customerBirthDate,
                                            customerFatherName,
                                            customerMotherName,
                                            address
                                    );
                                     clients.add(client2);
                                    break;
                                case "c":
                                    return;
                                default:
                                    System.out.println("Wrong Input");
                                    break;
                            }
                            break;
                        case "2":
                            break;
                        case "3":
                            break;
                        case "4":
                            break;
                        case "c":
                            break;
                    }

//                    Admin Consol
                    break;
                case "B":
                    System.out.println("User Name: ");
                    userName = scanner.nextLine();
                    System.out.println("Password: ");
                    password = scanner.nextLine();
                    Client client = null;
                    for (Client clien : clients) {

                        if (userName.equals(clien.getUserName()) && password.equals(clien.getPassword())) {
                            client = clien;

                        } else {
                            System.err.println("UserName and password doesnot Match");
                            return;
                        }
                    }

                    clientMenuPrint();

                    String clienChoisedMenu = scanner.nextLine().toLowerCase();
                    while (!clienChoisedMenu.equals("c".toLowerCase())) {
                        switch (clienChoisedMenu) {
                            case "1":
                                System.out.println("Curent balance is : " + client.getAccount().getBanance());
                                break;
                            case "2":
                                System.out.println("=============\nEnter Ammout ");
                                double ammount = 0;
                                while (ammount <= 0) {
                                    try {
                                        ammount = scanner.nextDouble();
                                    } catch (InputMismatchException e) {
                                        System.err.println("Plese Input Decimal Number \n\n");
                                    }
                                }
                                client.getAccount().withdraw(ammount);
                                break;
                            case "3":

                                System.out.println("How Meny Money Do you want to deposite? :");
                                double depositeAmmount = 0;
                                while (depositeAmmount <= 0) {
                                    try {
                                        depositeAmmount = scanner.nextDouble();
                                    } catch (InputMismatchException e) {
                                        System.err.println("Plese Input Decimal Number \n\n");
                                    }
                                }
                                client.getAccount().deposite(depositeAmmount);

                                break;
                            case "4":
                                System.out.println("Account Name : " + client.getFirstName() + " " + client.getLastName());
                                System.out.println("A/C No : " + client.getAccount().getAccountNumber());
                                System.out.println("Father's Name : " + client.getFatherName());
                                System.out.println("Mother's Name : " + client.getMotherName());
                                System.out.println("Mother's Name : " + client.getAddress().getFlatNumber()
                                        + ", " + client.getAddress().getHouseNumber()
                                        + ", " + client.getAddress().getPostOffice()
                                        + ", " + client.getAddress().getSubDistrict()
                                        + ", " + client.getAddress().getDistrict()
                                        + "-" + client.getAddress().getPostCode()
                                );
                                break;
                            case "c":
                                return;
                            default:
                                System.err.println("wrong Input");
                                break;

                        }
                        clientMenuPrint();
                        clienChoisedMenu = scanner.nextLine();
                    }

                    break;
                default:
                    System.err.println("wrong Input");
                    break;
            }

        }
    }

    private static void initialDatabase() {
        clients = new ArrayList<>();
        BankAccount svAccount0 = new SavingsAccount("SVS-220 424 12353", 30000);
        BankAccount svAccount1 = new SavingsAccount("SVS-220 424 12353", 30000);
        BankAccount svAccount2 = new SavingsAccount("SVS-220 424 12353", 30000);
        BankAccount svAccount3 = new SavingsAccount("SVS-220 424 12353", 30000);
        BankAccount svAccount4 = new SavingsAccount("SVS-220 424 12353", 30000);
        BankAccount svAccount5 = new SavingsAccount("SVS-220 424 12353", 30000);
        BankAccount svAccount6 = new SavingsAccount("SVS-220 424 12353", 30000);
        BankAccount svAccount7 = new SavingsAccount("SVS-220 424 12353", 30000);
        BankAccount svAccount8 = new SavingsAccount("SVS-220 424 12353", 30000);
        BankAccount svAccount9 = new SavingsAccount("SVS-220 424 12353", 30000);

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

        BankAccount crAccount0 = new CheckingAccount("CR", 0);
        BankAccount crAccount1 = new CheckingAccount("CR", 0);
        BankAccount crAccount2 = new CheckingAccount("CR", 0);
        BankAccount crAccount3 = new CheckingAccount("CR", 0);
        BankAccount crAccount4 = new CheckingAccount("CR", 0);
        BankAccount crAccount5 = new CheckingAccount("CR", 0);
        BankAccount crAccount6 = new CheckingAccount("CR", 0);
        BankAccount crAccount7 = new CheckingAccount("CR", 0);
        BankAccount crAccount8 = new CheckingAccount("CR", 0);
        BankAccount crAccount9 = new CheckingAccount("CR", 0);

        Address addressc = new Address("10/B", "Kazi Abdurrouf Roud", "Sutrapur", "Dhaka", "1100");
        Client c = new Client("RKT", "123", svAccount0, "", "", "", "", addressc);
        clients.add(c);

    }

    private static void clientMenuPrint() {
        System.out.println("=====================\nSelect Menu");
        System.out.println("1\tCheck Balance");
        System.out.println("2\tWithdraw");
        System.out.println("3\tDeposite");
        System.out.println("4\tSee Your Account Information");
        System.out.println("c\tExit\n=====================\n");

    }

    private static void printEmployeeMenu() {
        System.out.println("=====================\nSelect Menu");
        System.out.println("1\tCreate New Account");
        System.out.println("2\tView All Account");
        System.out.println("3\tYear End(Ofer Interset)");
        System.out.println("4\tService Charge");
        System.out.println("c\tExit\n=====================\n");

    }

    public static void employeeTable() {
        employees = new ArrayList<>();

        Address address = new Address("10/B", "Kazi Abdurrouf Roud", "Sutrapur", "Dhaka", "1100");
        Employee employee1 = new Employee("emp-c-101", "Dilruba", "Khanom", "Test", "test", address);
        Employee employee2 = new Employee("emp-c-102", "A.M", "Hasnat", "Karim", "Test", "test", address);
        Employee employee3 = new Employee("emp-c-103", "Md", "Amirul", "Mahmud", "Test", "test", address);
        Employee employee4 = new Employee("emp-c-104", "Maruf", "Khan", "Test", "test", address);
        Employee employee5 = new Employee("emp-c-105", "Dilruba", "Khanom", "Test", "test", address);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);

    }
}
