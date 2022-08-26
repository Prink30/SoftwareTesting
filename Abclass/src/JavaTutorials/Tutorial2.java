package JavaTutorials;

public class Tutorial2 {
	
	//STATIC
	//Static method
	public static void test() {
		
		System.out.println("static method");
		
	}
	
	//static block - used to initialize static variables
	
	static {
		System.out.println("static block");
	}
	
	//static variables - common to all instances of the class because it is a class level variable
	//only single copy of sv is created and shard amomg all the instance of the class
	
	static int a;
	int b;
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tutorial2 obj = new Tutorial2();
		Tutorial2 obj1 = new Tutorial2();
		test();
		a=100;
		
		obj.a=10;
		obj1.a=20;
		obj.b=100;
		obj1.b=200;
		
		
		
		System.out.println(obj.a + obj1.a);
		System.out.println(obj.b + obj1.b);
		
		
		
		
		
		
	}

}
