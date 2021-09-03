package ordersystem;

import java.util.Comparator;
import java.util.PriorityQueue;

public class OrderQueue {
   
	@SuppressWarnings("unused")
	private Object order;

	public OrderQueue(Object order) {
		this.order=order; //to initialize OrderQueue
	}



	PriorityQueue<Order> orderQueue = new PriorityQueue<Order>(Comparator.comparing(Order::getPriority).thenComparing(Order::getPriority));
	        
	
	 public void addOrder(Order order) {
		 
		 orderQueue.add(order);
	 }


	public int size() {
		
		return orderQueue.size();
	}


	public Order getTopOrder() {
		
		return orderQueue.poll();
	}


	
	
	       
}
