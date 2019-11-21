package com;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity  
@Table(name="tbl_address")  

public class Address {
	@Id  
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="std_gen")  
	@SequenceGenerator(name="std_gen",sequenceName="TBL_ADDRESS_SEQ",allocationSize=1)  
    private int addressid; 
	
    private String addressline1,city,state,country;    
    private int pincode;    
    
    public String getCity() {  
        return city;  
    }  
    public void setCity(String city) {  
        this.city = city;  
    }  
    public String getState() {  
        return state;  
    }  
    public void setState(String state) {  
        this.state = state;  
    }  
    public String getCountry() {  
        return country;  
    }  
    public void setCountry(String country) {  
        this.country = country;  
    }  
    public int getPincode() {  
        return pincode;  
    }  
    public int getAddressid() {
		return addressid;
	}
	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}
	public String getAddressline1() {
		return addressline1;
	}
	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}
	public void setPincode(int pincode) {  
        this.pincode = pincode;  
    }  
    

}
