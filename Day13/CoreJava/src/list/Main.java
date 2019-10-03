package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Customer> customers = customerData();
		printCustomerData("Before sorting",customers);
		Collections.sort(customers);
		printCustomerData("Before sorting",customers);
//		Iterator<Customer> iterator = customers.iterator();
//		while(iterator.hasNext()) {
//			Customer cust = iterator.next();
//			System.out.println(cust);
//		}
	}

	private static void printCustomerData(String message, List<Customer> customers) {
		// TODO Auto-generated method stub
		System.out.println(message);
		System.out.println(customers);
	}

	private static List<Customer> customerData() {
		Customer customer1 = new Customer(1, "A", "abc", 10);
		Customer customer2 = new Customer(2, "B", "abc", 2);
		Customer customer3 = new Customer(3, "C", "abc", 3);
		Customer customer4 = new Customer(4, "D", "abc", 4);
		Customer customer5 = new Customer(5, "E", "abc", 5);
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		customers.add(customer4);
		customers.add(customer5);
		customers.add(new Customer(1000, "Vaibhav", "Tamil Nadu", 0));
		return customers;
	}

}
