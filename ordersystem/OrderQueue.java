package ordersystem;

import java.util.Comparator;
import java.util.PriorityQueue;

public class OrderQueue {

	PriorityQueue<Order> orderQueue = new PriorityQueue<Order>(new OrderComparator());

	class OrderComparator implements Comparator<Order> {

		public int compare(Order s1, Order s2) {
			if (s1.getPriority() > s2.getPriority())
				return 1;
			else if (s1.getPriority() < s2.getPriority())
				return -1;
			return 0;
		}
	}

	public void addOrder(Order order) {
		try {
			orderQueue.add(order);
		} catch (NullPointerException queueIsEmpty) {
			queueIsEmpty.printStackTrace();
		}
	}

	public int size() {
		try {
			return orderQueue.size();
		} catch (NullPointerException queueIsEmpty) {
			queueIsEmpty.printStackTrace();
			return 0;
		}
	}

	public Order getTopOrder() {
		try {
			return orderQueue.poll();
		} catch (NullPointerException queueIsEmpty) {
			queueIsEmpty.printStackTrace();
			return null;
		}
	}
}
