package Keyword;

public class Loops2 {
	
	void test() {
		
		int age = 19;
		int weight = 55;
		
		if(age==20 && weight<=60) {
			System.out.println("he is normal");
		} else if(age>=20 && weight>=60) {
			System.out.println("he is normal now");
		} else if (age<=20 && weight>=60) {
			System.out.println("normal now");
		} else
			System.out.println("correct weight");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Loops2 b1 = new Loops2();
b1.test();
		
	}

}
