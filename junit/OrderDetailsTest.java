package Junit;
import java.util.*;
import org.junit.jupiter.api.Test;
import ordersystem.OrderDetails;
import ordersystem.OrderQueue;

class Details_of_Customer {
 
	OrderDetails orderDetails = new OrderDetails();
	
	@Test
	void Cart_Size_not_Empty() {
		new OrderDetails();
		OrderQueue orderqueue= new OrderQueue();
		equals(orderqueue.size()==1);
		System.out.println("cart is not empty");
	}
 
 
	@Test
	void cart_Size_is_Empty()  {
		try {
		OrderQueue orderqueue= new OrderQueue();
		equals(orderqueue.size()==0);
		System.out.println("cart is empty");
	}
		catch(NullPointerException cartNull) {
			System.out.println("Cart is Null"+cartNull);
		}
		}
	

}

