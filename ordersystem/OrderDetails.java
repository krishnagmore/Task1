package ordersystem;

public class OrderDetails {

    public static final String orderqueue = null;
	public int cartSize;


	public String orderDeatils(Order order) {
    	
		return "Order Item Name:"+order.getItemName()+" Order Priority:"+order.getPriority()+"Item Amount:"+order.getAmount();// To get the order deatils
    } 
     
    
	public  String cartSize(OrderQueue orderqueue) {
		
		return "The size of the Cart :"+orderqueue.size(); //To get the Size of the cart
		
		
	}


	public void orderqueue(OrderDetails orderdetails) {
		
		
	}
	
	  
}
