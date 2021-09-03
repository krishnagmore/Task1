package ordersystem;
import java.util.*;
public class  Order {
    private Random randomId = new Random();
    
	int orderId = randomId.nextInt(100)+1;
	
    private String itemName;
    private int priority;
    private double amount;
    
    
    public Order(String itemName, int priority, double amount) {
        this.itemName = itemName;
        this.priority = priority;
        this.amount=amount;
      
    }
    public Double  getAmount() {
	    return amount;
	}
	

    public int getOrderId()
    {
        return orderId;
    }


       
    public String getItemName() {
        return itemName;
    }



    public double getPriority() {
        return priority;
    }

	
	@Override
	public String toString() {
		return "Order [orderId:"+orderId+" itemName=" + itemName + ", priority=" + priority + ", amount="
				+ amount +   "]";
	}


}

