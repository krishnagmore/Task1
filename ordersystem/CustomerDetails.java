package ordersystem;
import java.util.*;
import java.io.*;


public class CustomerDetails {
	
	
	public static final int processCustomerDetails = 0;
	private String name;
	private String address;
	private String phone;
	private String email;
	
     public CustomerDetails(String name, String address, String phone, String email) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

	public String getName(String string) {
	    return name;
	}

	public String getAddress(String string) {
	    return address;
	}

	public String getPhone() {
	    return phone;
	}

	public String getEmail() {
	    return email;
	}

	
    public  String processCustomerDetails(CustomerDetails customer) { 
		return "CustomerDetails [name = " + customer.name + ", address = " + customer.address
	            + ", phone = " + customer.phone + ", email = " + customer.email + "]";
    }
	}	
	
	

