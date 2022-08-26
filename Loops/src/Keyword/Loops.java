package Keyword;

public class Loops {

	void age() {
		int age =18;
		
		if(age>18) {
			
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	
	void number() {
		 int a=10;
		
		 int b=9;
		 
		 if(a%2==0) {
			 
			 System.out.println("the number is divided by 2");
		 } else {
			 System.out.println("the number is not divided by 2");
		 }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Loops l1 = new Loops();
		
		l1.age();
		l1.number();

	}

}
