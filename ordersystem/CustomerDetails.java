package ordersystem;

public class CustomerDetails {
	
	private String name;
	private String address;
	private String phone;
	private String email;
	
	  //CustomerDetails Constructor 
     public CustomerDetails(String name, String address, String phone, String email) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

	public String getName() {
	    return name;
	}

	public String getAddress() {
	    return address;
	}

	public String getPhone() {
	    return phone;
	}

	public String getEmail() {
	    return email;
	}

     //Process the customer Details   	
    public  String processCustomerDetails(CustomerDetails customer) { 
		return "CustomerDetails [name = " + customer.name + ", address = " + customer.address
	            + ", phone = " + customer.phone + ", email = " + customer.email + "]";
    }
	}	
	
	

