package Inheritance;

public class Singlein {
	
	void sample() {
		
		System.out.println("new");
	}
	
	

}

 class Test extends Singlein{
	
	void age() {
	
		System.out.println("age");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test a1 = new Test();
		
		
		a1.age();
		a1.sample();
		
		
		
	}
	

}
