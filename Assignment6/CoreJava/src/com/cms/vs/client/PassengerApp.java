package com.cms.vs.client;

import java.util.Scanner;

import com.cms.vs.dao.PassengerDAO;
import com.cms.vs.dao.PassengerDAOImpl;
import com.cms.vs.model.Passenger;


public class PassengerApp {
	PassengerDAO passengerDAO;
	int choise = 0;
	int passengerId;
	String passengerName;
	String passengerAddress;
	int price;
	Scanner scanner = new Scanner(System.in);

	public PassengerApp() {
		// TODO Auto-generated constructor stub
		this.passengerDAO = new PassengerDAOImpl();
	}
	public void launchPassengerApp() {
		PassengerDAO passengerDAO = new PassengerDAOImpl();
		while (true) {
			System.out.println("M.E.N.U");
			System.out.println("1. Add the passenger");
			System.out.println("2. Get all the passenger");
			System.out.println("3. Search passenger");
			System.out.println("4. Delete passenger");
			System.out.println("5. Update passenger");
			System.out.println("6. E X I T");
			int choice = 0;
			System.out.println("Please enter your choice: (1-6)");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				Passenger passenger = takePassengerInput();
				passengerDAO.addPassenger(passenger);
				break;
			case 2:
                System.out.println(passengerDAO.getAllPassengers());
                break;
			case 3:
				System.out.println("Please enter passenger id to search: ");
				passengerId = scanner.nextInt();
				Passenger searchPassenger = passengerDAO.getPassenger(passengerId);
				System.out.println(searchPassenger);
				break;
			case 4:
				System.out.println("Please enter passenger id to delete: ");
				passengerId = scanner.nextInt();
				passengerDAO.deletePassenger(passengerId);
				System.out.println("Passenger deleted successfully");
				break;
			case 5:
				System.out.println("Please enter passenger id to update: ");
				int passengerIdOld = scanner.nextInt();
				Passenger passengerToUpdate = takePassengerInput();
				passengerDAO.updatePassenger(passengerToUpdate, passengerIdOld);
				System.out.println("Your passenger update successfully");
				break;
            case 6:
                System.out.println("Thanks for using my app");
                System.exit(0);
			default:
				System.out.println("Please enter (1-3)");
			}
		}

	}
	private Passenger takePassengerInput() {
		System.out.println("Please enter passenger id: ");
		passengerId = scanner.nextInt();
		System.out.println("Please enter passenger Name: ");
		String passengerName = scanner.next();
		System.out.println("Please enter passenger Address: ");
		passengerAddress = scanner.next();
		System.out.println("Please enter price: ");
		price = scanner.nextInt();
		Passenger passenger = new Passenger(passengerId, passengerName, passengerAddress, price);
		return passenger;
	}

}
