public class Intermediate_5 {

	public static void main(String[] args) {
		
		Garage MyGarage = new Garage("MyGarage");
		
		MyGarage.checkIn(new Car(4, "Nissan", "X-Trail", "Black", "SIN7 8TS", true, false, 5, 5, 6));
		MyGarage.checkIn(new Motorbike(2, "Triumph", "Patriot", "White", "SIO9 9JH", true, false, 1500));
		MyGarage.checkIn(new Car(4, "Ford", "Mondeo", "Green", "AX96 7TD", false, false, 5, 5, 6));
		MyGarage.checkIn(new Bus(4, "Ford", "Ford Bus", "Red", "RX70 S63", true, false, 20, 30));
		
		MyGarage.displayAll();
		
		//MyGarage.emptyGarage();
		
		//MyGarage.DeleteCar("Car"); //Goes through VehiclesInGarage and deletes anything that is of Class "Car"
	}
}


// For Vehicle - int wheels, String make, String model, String colour, String license, Boolean mot, Boolean fixed
// For Car - int wheels, String make, String model, String colour, String license, Boolean mot, Boolean fixed,
//int doors, int seats, int windows
// For Bike - int wheels, String make, String model, String colour, String license, Boolean mot, Boolean fixed,
//int engineCC
// For Bus - int wheels, String make, String model, String colour, String license, Boolean mot, Boolean fixed,
//int windows, int seats