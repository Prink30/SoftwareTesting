package Basics;

public class Ovrloading {
	
	void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	void sum(int a, String s) {
		
		System.out.println(a + s);
		
	}
	
	void sum(String a, String b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Ovrloading ab = new Ovrloading();

ab.sum(10, 20);
ab.sum(30, "Reeta");
ab.sum("Aaron", "Kezia");

	}

}
