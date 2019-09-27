package oop;

public class Customer 
{
	private String customerName;
	private String customerAddress;
	private String customerId;
	private int billAmount;
	
	public Customer() {
		super();
		customerId = "1000";
		customerAddress = "NA";
		customerName = "NA";
		billAmount = 500;
	}

	public Customer(String customerName, String customerAddress) {
		this();
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}

	public Customer(String customerId, int billAmount) {
		this();
		this.customerId = customerId;
		this.billAmount = billAmount;
	}

	public Customer(String customerName, String customerAddress, String customerId, int billAmount) {
		super();
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerId = customerId;
		this.billAmount = billAmount;
	}
	
	public void display() {
		System.out.println("Customer Name: " + customerName);
		System.out.println("Customer Address: " + customerAddress);
		System.out.println("Customer Id: " + customerId);
		System.out.println("Customer bill amount: " + billAmount);
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public int getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}
	

}
