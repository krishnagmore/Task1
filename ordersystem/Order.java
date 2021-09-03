package ordersystem;
import java.util.*;
public class  Order {
    
    
	private int orderId ;
    private String itemName;
    private int priority;
    private double amount;

    //Order constructor
    public Order(int orderId,String itemName, int priority, double amount) {
    	this.orderId=orderId;
    	this.itemName = itemName;
        this.priority = priority;
        this.amount=amount;    
        
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
    
    public Double  getAmount() {
	    return amount;
	}
    
	@Override
	public String toString() {
		return "Order [orderId:"+orderId+" itemName=" + itemName + ", priority=" + priority + ", amount="
				+ amount +   "]";
	}
}