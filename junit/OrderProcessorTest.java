package Junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import javax.management.AttributeNotFoundException;

import org.junit.jupiter.api.Test;

import ordersystem.Order;
import ordersystem.OrderProcessor;
import ordersystem.OrderQueue;

class Order_ProcessorTest {

	@Test
	void Process_Order()  {
		try {
			
		
         Order  order = new Order(11,"ball", 1, 23445);
         OrderQueue orderqueue = new OrderQueue();
         OrderProcessor OrderProcessorTest = new OrderProcessor();
           orderqueue.addOrder(order);
         Order orderqueueTrue = OrderProcessorTest.processOrder(orderqueue);
         assertTrue(orderqueueTrue == order);
		}
		catch(NullPointerException e) {
			System.out.println("Order queue is Null");
	
		 }
		}
	
	void Process_Multiple_Order() {
		
	
		try {
		
        Order  order1= new Order(1,"pen", 2, 45);
        Order  order2 = new Order(12,"book", 3,500);
        OrderQueue orderqueue = new OrderQueue();
        OrderProcessor OrderProcessorTest = new OrderProcessor();
          orderqueue.addOrder(order1);
          orderqueue.addOrder(order2);
        Order orderqueueTrue = OrderProcessorTest.processOrder(orderqueue);
        assertTrue(orderqueueTrue == order1);
	}
		catch(Exception e ) {
			System.out.println("error in order processing ");
		
			
		}
			
		}
}
