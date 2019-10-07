package com.cms.vs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cms.vs.dbconnection.DBConnection;
import com.cms.vs.model.Passenger;

public class PassengerDAOImpl implements PassengerDAO {

	
	Connection connection = DBConnection.getConnection();
	private static final String FETCH_Passenger_ALL = "select * from passenger";
	public PassengerDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Passenger getPassenger(int passengerId) {
		Passenger passenger = new Passenger();
		try {
			// TODO Auto-generated method stub
			PreparedStatement statement = connection.prepareStatement("select * from passenger where passengerId = ?");
			statement.setInt(1, passengerId);
			ResultSet resultSet = statement.executeQuery();
			resultSet.next();
			passenger.setPassengerId(resultSet.getInt(1));
			passenger.setPassengerName(resultSet.getString(2));
			passenger.setPassengerAddress(resultSet.getString(3));
			passenger.setPrice(resultSet.getInt(4));
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return passenger;
	}

	@Override
	public List<Passenger> getAllPassengers() {
		// TODO Auto-generated method stub
		List<Passenger> allPassengers = new ArrayList<Passenger>();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSets = statement.executeQuery(FETCH_Passenger_ALL);
			while(resultSets.next()) {
				Passenger passenger = new Passenger();
				passenger.setPassengerId(resultSets.getInt(1));
				passenger.setPassengerName(resultSets.getString(2));
				passenger.setPassengerAddress(resultSets.getString(3));
				passenger.setPrice(resultSets.getInt(4));
				allPassengers.add(passenger);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return allPassengers;
	}

	@Override
	public void addPassenger(Passenger passenger) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement preparedStatement = 
					connection.prepareStatement("insert into passenger values (?,?,?,?)");
			preparedStatement.setInt(1, passenger.getPassengerId());
			preparedStatement.setString(2, passenger.getPassengerName());
			preparedStatement.setString(3, passenger.getPassengerAddress());
			preparedStatement.setInt(4, passenger.getPrice());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deletePassenger(int passengerId) {
		// TODO Auto-generated method stub
		try {
			// TODO Auto-generated method stub
			PreparedStatement statement = connection.prepareStatement("select * from passenger where passengerId = ?");
			statement.setInt(1, passengerId);
			PreparedStatement statementDelete = connection.prepareStatement("delete from passenger where passengerId = " + passengerId + ";");
			statementDelete.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	@Override
	public void updatePassenger(Passenger passenger, int passengerIdOld) {
		// TODO Auto-generated method stub
		try {
//			PreparedStatement statement = connection.prepareStatement("select * from passenger where passengerId = " + passengerIdOld + ";");
//			statement.get(1, passengerIdOld);
			PreparedStatement preparedStatement = 
					connection.prepareStatement("update passenger set "
							+ "passengerId = ?, passengerName = ?, "
							+ "passengerAddress = ?, "
							+ "Price = ? where passengerId = " + passengerIdOld + ";");
			preparedStatement.setInt(1, passenger.getPassengerId());
			preparedStatement.setString(2, passenger.getPassengerName());
			preparedStatement.setString(3, passenger.getPassengerAddress());
			preparedStatement.setInt(4, passenger.getPrice());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
