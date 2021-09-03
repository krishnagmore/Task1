package Junit;

import org.junit.jupiter.api.Test;

import ordersystem.Order;
import ordersystem.OrderQueue;

class OrderQueueTest {


	Order order = new Order(11,"ball",1,1);
	@Test
	void Add_Order_in_Cart( ) {
		
		OrderQueue orderqueue= new OrderQueue();
		orderqueue.addOrder(order);
	}

	@Test
	void Cart_Size_not_Empty() {
		OrderQueue orderqueue= new OrderQueue();
		equals(orderqueue.size()==1);
		System.out.println("cart is not empty");
	}
	
	@Test
	void cart_Size_is_Empty() {
		try {
		OrderQueue orderqueue= new OrderQueue();
		equals(orderqueue.size()==0);
		System.out.println("cart is empty");
	}
		catch (Exception e) {
			System.out.println("cart size is empty");
		}
		}

	@Test
	void Get_Top_Order_ofQueue() {
		var OrderQueue= new OrderQueue();
		OrderQueue.getTopOrder();
	}

}
