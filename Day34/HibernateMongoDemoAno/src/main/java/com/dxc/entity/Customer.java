package com.dxc.entity;

import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.search.annotations.IndexedEmbedded;

@Entity
@Table(name = "CustomerDetails")
public class Customer {
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private int customerId;
	private String customerName;
	
	@ElementCollection
	@IndexedEmbedded
	private Set<BillAmount> billAmount;
	public Customer() {
		super();
	}
	public Customer(String customerName, Set<BillAmount> billAmount) {
		super();
		this.customerName = customerName;
		this.billAmount = billAmount;
	}
	public Customer(int customerId, String customerName, Set<BillAmount> billAmount) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.billAmount = billAmount;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Set<BillAmount> getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(Set<BillAmount> billAmount) {
		this.billAmount = billAmount;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", billAmount=" + billAmount
				+ "]";
	}

}
