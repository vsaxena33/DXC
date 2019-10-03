package com.cms.dxc.model;

import com.cms.dxc.exception.InvalidBillException;
import com.cms.dxc.exception.InvalidCustomerIdException;

public class Customer {
	public int customerId;
	public String customerName;
	public String address;
	public int bill;
	public Customer(int customerId, String customerName, String address, int bill)
	throws InvalidBillException, InvalidCustomerIdException{
		super();
		CheckCustomerId(customerId);
		this.customerName = customerName;
		this.address = address;
		CheckBill(bill);
	}
	private void CheckBill(int bill) throws InvalidBillException {
		if (bill < 0) {
			throw new InvalidBillException("Bill Invalid");
		}
		else {
			this.bill = bill;
		}
	}
	private void CheckCustomerId(int customerId) throws InvalidCustomerIdException {
		if (customerId > 100 || customerId < 0) {
			throw new InvalidCustomerIdException("CustomerID Invalid");
		}
		else {
			this.customerId = customerId;
		}
	}
	public Customer() {
		super();
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", address=" + address
				+ ", bill=" + bill + "]";
	}

}
