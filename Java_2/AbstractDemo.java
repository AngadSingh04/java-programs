class Vehicle {
	String name;
	String type;
    double speedLimit = 90;
	
	void brake() {
		System.out.println("Take a break.");
	}
	void accelerate() {
		System.out.println("Vehicle accelerated.");
		speedLimit = 100;
	}
	void accelerate(double x) {
		System.out.println("Acceleration by x: kmph.." + x);
	}
}

class Truck extends Vehicle {
	void brake() {
		System.out.println("I am using Fluid brakes.");

	}

	void autoclean() {
		System.out.println("To auto clean.");
	}

	void accelerate() {
		System.out.println("I am TATA accelerating in different way");
		
	}
}


class Jeep extends Vehicle {

	void brake() {
		System.out.println("I am using Disc brakes.");
	}

	void accelerate() {
		System.out.println("I am Mahindra accelerating in different way");
	}
}


public class AbstractDemo {
	public static void main(String[] args) {

		Vehicle v1 = new Truck(); 
		v1.accelerate();

		v1 = new Jeep();
		v1.accelerate();
		
		Vehicle v2 = new Vehicle();

	}

}
