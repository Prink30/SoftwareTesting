package Naveen;

public class Vehicle {
	
	public void start() {
		System.out.println("vehicle is started");
	}
	
	public void stop() {
		System.out.println("vehicle is stopped");
	}

}

class Car extends Vehicle{
	
	public void start() {
		System.out.println("Car is started");
	}
	
	public void stop() {
		System.out.println("Car is stopped");
	}
   
	public void model() {
		System.out.println("Car is new model");
	}
	
	
}

class TestingModule {
	
	public void test() {
		
	}
	
	public static void main (String[] args) {
		
		// static polymorphism - creating object for child class
		
		Car c = new Car();
		c.model();
		c.start();
		
		// dynamic polymorphism - child class object is accessed by parent class variable
		
	Vehicle ab = new Car();
	
	ab.start();
	ab.stop();
	
		
	//	Vehicle v = new Vehicle();
		
	//	v.start();
	//	v.stop();
		
	}
}




