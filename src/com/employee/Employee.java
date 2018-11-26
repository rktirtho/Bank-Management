/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employee;

import com.human.Address;
import com.human.Person;

/**
 *
 * @author DELL
 */
public abstract class Employee extends Person{
    
    private String employeeId;

    public Employee(String employeeId, String firstName, String lastName, String fatherName, String motherName, Address address) {
        super(firstName, lastName, fatherName, motherName, address);
        this.employeeId = employeeId;
    }

    public Employee(String employeeId, String firstName, String lastName, String dateOfBirth, String fatherName, String motherName, Address address) {
        super(firstName, lastName, dateOfBirth, fatherName, motherName, address);
        this.employeeId = employeeId;
    }

    public Employee(String employeeId, String firstName, String middleName, String lastName, String dateOfBirth, String fatherName, String motherName, Address address) {
        super(firstName, middleName, lastName, dateOfBirth, fatherName, motherName, address);
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

   
    
}
