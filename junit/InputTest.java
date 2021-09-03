package Junit;
import org.junit.jupiter.api.Test;

import ordersystem.OrderProcessor;
import ordersystem.OrderQueue;

class InputTest {

	OrderProcessor Orderprocessor = new OrderProcessor();

	@Test
	void testMain() {
		var OrderQueue= new OrderQueue();
		OrderQueue.getTopOrder();
	
	}

}
