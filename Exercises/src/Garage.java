import java.util.*;

public class Garage {
	String name;
	
	public Garage(String name) {
		super();
		name = this.name;
	}

	ArrayList<Vehicle> vehiclesInGarage = new ArrayList<Vehicle>();
	
	void displayAll(){			//Lists and creates a bill for each Vehicle depending on its Class
	System.out.println("Vehicles in Garage:");
	Iterator<Vehicle> itr = vehiclesInGarage.iterator();
	
	while (itr.hasNext()){
		Vehicle element = itr.next();
		System.out.print(vehiclesInGarage.indexOf(element) + " - "+ element.getClass().getName() + ": " + element.make + ", " + element.model + " - ");
		
		if (element.getClass().getName().equals("Motorbike")){
			System.out.println("Price for fixing Motorcycle = £500");
		}
		else if (element.getClass().getName().equals("Car")){
			System.out.println("Price for fixing Car = £750");
		}
		else if (element.getClass().getName().equals("Bus")){
		System.out.println("Price for fixing Bus = £1000");
		}
		else{
		System.out.println("Price for Unknown Vehicle Type - £1500");
		}
	}
	}
	
	void checkIn(Vehicle V){	//Adds a Vehicle of a specified class given all variables that are required are entered
		vehiclesInGarage.add(V);
	}
	
	void deleteClass(String ClassType) {		//Deletes all instances of a specified class within the Array
		Iterator<Vehicle> iterator1 = vehiclesInGarage.listIterator();
		while (iterator1.hasNext()){
			Vehicle item = iterator1.next();
			if (item.getClass().getName().equals(ClassType)){
				iterator1.remove();
			}
		}
	}
	
	void emptyGarage() { 		//Empties all Vehicles from the Garage Array
	vehiclesInGarage.clear();
	System.out.println("Garage Emptied");
	}
	
	void fixVehicle(String license) {		//Fixes a vehicle in the garage based on its license plate (id)
		for (Vehicle V : vehiclesInGarage){
			if (V.license == (license)){
				V.setFixed(true);
				System.out.println("Vechicle " + V.license + " set to fixed");
				break;
			}
		}
	}
}
