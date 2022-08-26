package Basics;

public class Test1 {
	
	void add(int a, String s) {
		
		System.out.println(a+s);
		
	}
}

 class Test2{
	
void add(int a, String s) {
	System.out.println(a+s);
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test1 t = new Test1();
		Test2 t1 = new Test2();
		
		t.add(10, "Reeta");
		t1.add(20, "Creeta");

	}

}
