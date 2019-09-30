package vehicle;

public class Truck extends Vehicle {

	public Truck(String color, int noOfWheels, String model) {
		super(color, noOfWheels, model);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Truck [color=" + color + ", noOfWheels=" + noOfWheels + ", model=" + model + "]";
	}

}
