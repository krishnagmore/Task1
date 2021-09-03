package ordersystem;

public class OrderProcessor {
        


     
	public Order processOrder(OrderQueue orderqueue) {
		
		return orderqueue.getTopOrder();
	}
	

	
    @Override
	public String toString() {
    	
	    return getClass().getName() + "@" + Integer.toHexString(hashCode());
	    
	}

	
}
