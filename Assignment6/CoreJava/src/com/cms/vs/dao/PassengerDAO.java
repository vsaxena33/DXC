package com.cms.vs.dao;

import java.util.List;

import com.cms.vs.model.Passenger;

public interface PassengerDAO {
	public Passenger getPassenger(int passengerId);
	public List<Passenger> getAllPassengers();
	public void addPassenger(Passenger passenger);
	void deletePassenger(int passengerId);
	void updatePassenger(Passenger passenger, int passengerIdOld);

}
