package oop;

public class Passenger 
{
	String pnrNumber;
	String mobNumber;
	String passengerName;
	float fare;
	float cgst = 2.5f;
	float sgst = 2.5f;
	public void bookTicket()
	{
		pnrNumber = "123456";
		mobNumber = "1234567890";
		passengerName = "Vaibhav Saxena";
		fare = 9800 + 9800*cgst/100 + 9800*sgst/100;
		System.out.println(passengerName + " Your ticket booked successfully");
		System.out.println(mobNumber + " is recorded too");
		System.out.println("Your fare is: " + fare);
	}
	public void cancelTicket()
	{
		pnrNumber = "123456";
		mobNumber = "1234567890";
		passengerName = "Vaibhav Saxena";
		fare = 7800 + 9800*cgst/100 + 9800*sgst/100;
		System.out.println(passengerName + " Your ticket cancelled successfully");
		System.out.println(mobNumber + " is recorded too");
		System.out.println("Your fare is: " + fare);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Passenger p = new Passenger();
		p.bookTicket();
		System.out.println("##################");
		p.cancelTicket();

	}

}
