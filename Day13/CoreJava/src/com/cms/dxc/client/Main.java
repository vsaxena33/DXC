package com.cms.dxc.client;

import com.cms.dxc.exception.InvalidBillException;
import com.cms.dxc.exception.InvalidCustomerIdException;
import com.cms.dxc.model.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = null;
		try {
			customer = new Customer(10, "Vaibhav", "Raipur", -98000);
		} catch (InvalidBillException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			//e.printStackTrace();
		} catch (InvalidCustomerIdException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(customer);

	}

}
