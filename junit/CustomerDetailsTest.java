package Junit;

 
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import ordersystem.CustomerDetails;

class CustomerDetailsTest {
	
	
	    int totalCustomerDetails = 0;
	    int totalNumOfAcceptableCustomerDetails = 10;
	    
	    @Test
		void Add_CustomerDetails_intoQueue() {
		
			CustomerDetails CustomerDetails = new CustomerDetails("kavya", "belur", "9876543210", "kavya@gmail.com");
			equals(CustomerDetails.processCustomerDetails == 1);
		}
		
		@Test
		
		void check_CustomerDetails_when_Queue_empty() {
			
		
			CustomerDetails CustomerDetails = new CustomerDetails(null, null, null,null);
			equals(CustomerDetails.processCustomerDetails == 0);
		}
	     
	    @Before
	    public void set_Data(){
	        this.totalCustomerDetails = 9;
	    }
	     
	    @Test
	    public void customer_Assertions() {
	        assert((this.totalCustomerDetails != this.totalNumOfAcceptableCustomerDetails));
	    }
	     
	    @Test
	    public void customer_AssertFalse() {
	        equals((this.totalCustomerDetails == this. totalNumOfAcceptableCustomerDetails));
	    }
	     
	    @Test
	    public void testAssertTrueWithMessage(){
	        assertTrue("Is total number of applicants acceptable?",(this.totalCustomerDetails != this.totalNumOfAcceptableCustomerDetails));
	    }
}