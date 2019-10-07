package com.cms.vs.model;

public class Passenger {
	private int passengerId;
	private String passengerName;
	private String passengerAddress;
	private int Price;
	public Passenger() {
		super();
	}
	public Passenger(int passengerId, String passengerName, String passengerAddress, int price) {
		super();
		this.passengerId = passengerId;
		this.passengerName = passengerName;
		this.passengerAddress = passengerAddress;
		Price = price;
	}
	public int getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public String getPassengerAddress() {
		return passengerAddress;
	}
	public void setPassengerAddress(String i) {
		this.passengerAddress = i;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Price;
		result = prime * result + ((passengerAddress == null) ? 0 : passengerAddress.hashCode());
		result = prime * result + passengerId;
		result = prime * result + ((passengerName == null) ? 0 : passengerName.hashCode());
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
		Passenger other = (Passenger) obj;
		if (Price != other.Price)
			return false;
		if (passengerAddress == null) {
			if (other.passengerAddress != null)
				return false;
		} else if (!passengerAddress.equals(other.passengerAddress))
			return false;
		if (passengerId != other.passengerId)
			return false;
		if (passengerName == null) {
			if (other.passengerName != null)
				return false;
		} else if (!passengerName.equals(other.passengerName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "\n Passenger [passengerId=" + passengerId + ", passengerName=" + passengerName + ", passengerAddress="
				+ passengerAddress + ", Price=" + Price + "]";
	}

}
