package vehicle;

public class Bus extends Vehicle {

	public Bus(String color, int noOfWheels, String model) {
		super(color, noOfWheels, model);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Bus [color=" + color + ", noOfWheels=" + noOfWheels + ", model=" + model + "]";
	}

}
