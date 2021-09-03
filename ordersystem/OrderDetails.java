package ordersystem;

public class OrderDetails {

     // To get Order Details
	public String orderDeatils(Order order) {
    	
		return "Order-> OrderId:"+order.getOrderId()+" Item Name:"+order.getItemName()+" Order Priority:"+order.getPriority()+"Item Amount:"+order.getAmount();// To get the order deatils
    }    
	
	//To get the Size of the cart	
	public  String cartSize(OrderQueue orderqueue) {
		
		return "The size of the Cart :"+orderqueue.size(); 	
	}
	  
}
