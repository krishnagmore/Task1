package ordersystem;
import java.util.*;
public class Input {
	
	static OrderProcessor orderProcessor = new OrderProcessor();
	
	static OrderDetails orderDetails = new OrderDetails();
	
	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
    
    
    System.out.println("Enter the customer name:");
    String name = sc.nextLine();
  
    
    System.out.println("Enter the customer address:");
    String address = sc.nextLine();

    
    System.out.println("Enter the customer phone:");
    String phone = sc.nextLine();
  
    
    System.out.println("Enter the customer email:");
    String email = sc.nextLine();
    
    CustomerDetails customerDetails = new CustomerDetails(name, address, phone, email);
    

        System.out.println("Cart Implementation using priority queue\n");


       

        char ch;
        
        OrderQueue orderqueue = new OrderQueue(null);
        do
        {
           
            System.out.println("1. insert item into the cart");
            System.out.println("2. Display Customer Details");
            System.out.println("3. Process the higest priority Item");
            System.out.println("4.The current Cart size ");
            String input = sc.next();
   
		    
               
            if (input.equals("1")) {
            	System.out.println("Enter item name ");
            	String itemName = sc.next();
            	System.out.println("Enter Priority: oneplus-1,prime-2,other-3");
            	int priority = sc.nextInt();
            	System.out.println("Enter Amount ");
            	double amount = sc.nextDouble();
            	
            	Order order=new Order(itemName,priority,amount);


            	orderqueue.addOrder(order);
             
               System.out.println(orderDetails.orderDeatils(order));            
               System.out.println(orderDetails.cartSize(orderqueue));
                
                
            }
            else if(input.equals("2"))
            {
            	System.out.println(customerDetails.processCustomerDetails(customerDetails));
    
            }
            
            else if(input.equals("3")) {
            	System.out.println("The Processed Item:"+orderProcessor.processOrder(orderqueue));
            	
            }
            
            else if(input.equals("4")) {
            	System.out.println(orderDetails.cartSize(orderqueue));
            }

            
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = sc.next().charAt(0);
        } while (ch == 'Y'|| ch == 'y');
        
        sc.close();
    }

}



