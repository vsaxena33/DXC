package list;

public class Customer implements Comparable<Customer> {
	public int customerId;
	public String customerName;
	public String address;
	public int bill;
	public Customer(int customerId, String customerName, String address, int bill) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
		this.bill = bill;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + bill;
		result = prime * result + customerId;
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (bill != other.bill)
			return false;
		if (customerId != other.customerId)
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "\nCustomer [customerId=" + customerId + ", customerName=" + customerName + ", address=" + address
				+ ", bill=" + bill + "]";
	}
	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		if(this.bill > o.bill) {
			return 0;
		}
		else {
			return -1;
		}
	}

}
