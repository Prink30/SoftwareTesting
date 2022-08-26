package Keyword;

public class Loopnew {
	
	void sample() {
		
		int age=19;
		int weight = 62;
		
		if(age>18 && weight>60) {
			
			System.out.println("age is greater than 18 and weight is greater than 60");
		} else {
			System.out.println("age is less than 18 and weight is less than 60");
		}
	}
	
	void test() {
		
		int age=19;
		int weight=62;
		
		if(age<18 || weight>60) {
			System.out.println("age is less than 18 and weight is greater than 60");
		}else {
			System.out.println("age is greater than 18 and weight is greater than 60");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Loopnew a1 = new Loopnew();
		a1.sample();
		a1.test();

	}

}
