package Inheritance;

public class Inhexp extends Sample {
	
	void display() {
		System.out.println("display");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Inhexp a1 = new Inhexp();
		
		a1.age();
		a1.sample();
		a1.car();
		a1.display();

	}

}
