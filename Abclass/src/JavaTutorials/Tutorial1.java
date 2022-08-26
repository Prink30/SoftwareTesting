package JavaTutorials;

public class Tutorial1 {
	
	//calling non static method
	
	void test() {
		System.out.println("method1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tutorial1 obj = new Tutorial1();
		
		
		int a=10;
		int b=20;
		System.out.println(a+b);
		obj.test();
		
		
		
		
	}

}
