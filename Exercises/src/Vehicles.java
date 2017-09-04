abstract class Vehicle {
	int wheels;
	String make;
	String model;
	String colour;
	String license;
	Boolean mot;
	Boolean fixed;

	public Vehicle(int wheels, String make, String model, String colour, String license, Boolean mot, Boolean fixed) {
		super();
		this.wheels = wheels;
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.license = license;
		this.mot = mot;
		this.fixed = fixed;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public Boolean getMot() {
		return mot;
	}
	public void setMot(Boolean mot) {
		this.mot = mot;
	}
	public Boolean getFixed() {
		return fixed;
	}
	public void setFixed(Boolean fixed) {
		this.fixed = fixed;
	}

	
}

class Car extends Vehicle {
	int doors;
	int seats;
	int windows;

	public Car(int wheels, String make, String model, String colour, String license, Boolean mot, Boolean fixed,
			int doors, int seats, int windows) {
		super(wheels, make, model, colour, license, mot, fixed);
		this.doors = doors;
		this.seats = seats;
		this.windows = windows;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
}

class Motorbike extends Vehicle {
	int engineCC;
	public Motorbike(int wheels, String make, String model, String colour, String license, Boolean mot, Boolean fixed,
			int engineCC) {
		super(wheels, make, model, colour, license, mot, fixed);
		this.engineCC = engineCC;
	}
}

class Bus extends Vehicle {
	int windows;
	int seats;

	public Bus(int wheels, String make, String model, String colour, String license, Boolean mot, Boolean fixed,
			int windows, int seats) {
		super(wheels, make, model, colour, license, mot, fixed);
		this.windows = windows;
		this.seats = seats;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
}