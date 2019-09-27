package oop;

public class Main {
	public static void main(String[] args) {
		Customer c1 = new Customer();
		Customer c2 = new Customer("Vaibhav", "Raipur");
		Customer c3 = new Customer("0137", 500);
		Customer c4 = new Customer("Vaibhav", "Raipur", "0137", 500);
		c1.display();
		System.out.println("------");
		c2.display();
		System.out.println("------");
		c3.display();
		System.out.println("------");
		c4.display();
		System.out.println("------");
		
		System.out.println(c1.getBillAmount());
		c1.setBillAmount(1000);
		System.out.println(c1.getBillAmount());
	}

}
