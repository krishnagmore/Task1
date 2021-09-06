package ordersystem;

import java.io.IOException;
import java.util.*;

public class Input {

	static OrderProcessor orderProcessor = new OrderProcessor();

	public static void main(String args[]) throws IOException {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the customer name:");
		String name = sc.nextLine();
		if (name == null) {
			throw new IOException("Invalid customer name.");
		} else if (name.isEmpty()) {
			throw new IOException("Invalid customer name.");
		}

		System.out.println("Enter the customer address:");
		String address = sc.nextLine();
		if (address == null) {
			throw new IOException("Invalid Address.");
		} else if (address.isEmpty()) {
			throw new IOException("Invalid Address.");
		}
		System.out.println("Enter the customer phone:");
		int phone = sc.nextInt();
		sc.nextLine();
		try {

			int checkPhone = phone;
		} catch (NumberFormatException e) {
			System.out.println("Input is not a valid integer" + e);
		}

		System.out.println("Enter the customer email:");
		String email = sc.nextLine();
		if (email == null) {
			throw new IOException("Invalid Email.");
		} else if (email.isEmpty()) {
			throw new IOException("Invalid Email.");
		}

		CustomerDetails customerDetails = new CustomerDetails(name, address, phone, email);

		System.out.println("Cart Implementation using priority queue\n");

		char ch;
		OrderQueue orderqueue = new OrderQueue();

		do {
			System.out.println("1. insert item into the cart");
			System.out.println("2. Display Customer Details");
			System.out.println("3. Process the higest priority Item");
			String input = sc.next();

			if (input.equals("1")) {
				System.out.println("Enter item name ");
				String itemName = sc.next();
				if (itemName == null) {
					throw new IOException("Invalid itemName.");
				} else if (itemName.isEmpty()) {
					throw new IOException("Invalid itemName.");
				}

				System.out.println("Enter Priority: oneplus-1,prime-2,other-3");
				int priority = sc.nextInt();

				try {

					int validatePriority = priority;
				} catch (NumberFormatException e) {
					System.out.println("Input is not a valid integer" + e);
				}

				System.out.println("Enter Amount ");
				double amount = sc.nextDouble();
				try {

					double validateAmount = amount;
				} catch (NumberFormatException e) {
					System.out.println("Input is not a valid integer" + e);
				}

				Random orderid = new Random();
				int orderId = orderid.nextInt(100) + 1;

				Order order = new Order(orderId, itemName, priority, amount);

				orderqueue.addOrder(order);
				if (orderqueue == null) {
					throw new NullPointerException("No items Added");
				}

			} else if (input.equals("2")) {
				System.out.println(customerDetails.processCustomerDetails());
			}

			else if (input.equals("3")) {
				System.out.println("The Processed Item:" + orderProcessor.processOrder(orderqueue));
			}

			System.out.println("\nDo you want to continue (Type y or n) \n");
			ch = sc.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');

		sc.close();
	}

}
