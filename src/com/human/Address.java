/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.human;

/**
 *
 * @author DELL
 */
public class Address {
    
    private String flatNumber;
    private String houseNumber;
    private String roadName;
    private String postOffice;
    private String subDistrict;
    private String district;
    private String postCode;

    public Address() {
    }
    
    

    public Address(String roadName, String postOffice, String subDistrict, String district, String postCode) {
        this.roadName = roadName;
        this.postOffice = postOffice;
        this.subDistrict = subDistrict;
        this.district = district;
        this.postCode = postCode;
    }
    
    

    public Address(String houseNumber, String roadName, String postOffice, String subDistrict, String district, String postCode) {
        this.houseNumber = houseNumber;
        this.roadName = roadName;
        this.postOffice = postOffice;
        this.subDistrict = subDistrict;
        this.district = district;
        this.postCode = postCode;
    }
    
    
    

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getRoadName() {
        return roadName;
    }

    public void setRoadName(String roadName) {
        this.roadName = roadName;
    }

    public String getPostOffice() {
        return postOffice;
    }

    public void setPostOffice(String postOffice) {
        this.postOffice = postOffice;
    }

    public String getSubDistrict() {
        return subDistrict;
    }

    public void setSubDistrict(String subDistrict) {
        this.subDistrict = subDistrict;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
    
    
    
}
