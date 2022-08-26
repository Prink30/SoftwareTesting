package JavaTutorials;

public class NormalCons {
	
	// Parametrized Constructor and Normal method
	
	NormalCons(String s, int a){
		
		System.out.println(s + " " + a);
	}

	
	void test(int a, int b) {
		
		System.out.println(a);
		System.out.println(b);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NormalCons obj = new NormalCons("Reena",10);
		NormalCons obj1 = new NormalCons("Veena",20);
		obj.test(10, 5);
		
	}

}
