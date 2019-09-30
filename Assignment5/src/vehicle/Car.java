package vehicle;

public class Car extends Vehicle {

	public Car(String color, int noOfWheels, String model) {
		super(color, noOfWheels, model);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", noOfWheels=" + noOfWheels + ", model=" + model + "]";
	}

}
