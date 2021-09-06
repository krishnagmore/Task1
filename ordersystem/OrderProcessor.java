package ordersystem;

public class OrderProcessor {
	public Order processOrder(OrderQueue orderqueue) {
		try {
			return orderqueue.getTopOrder();

		} catch (NullPointerException queueIsEmpty) {
			queueIsEmpty.printStackTrace();
			return null;
		}
	}
}
