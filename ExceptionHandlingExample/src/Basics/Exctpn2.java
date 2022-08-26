package Basics;

public class Exctpn2 {
	
	void data() {
		
		String s = "Anu";
		throw new ArithmeticException("Arithmetic Expression");
		
	}
	
	void test() {
		
		int age=12;
		
		if(age >18) {
			
			System.out.println("age is greater than 18");
		} else
			
			throw new ArithmeticException("Exceptionnew");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exctpn2 a1 = new Exctpn2();
		a1.data();
		a1.test();
		
	}

}
