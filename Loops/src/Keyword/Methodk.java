package Keyword;

public class Methodk {

	//calling a method
	int no;
	String name;
	
	void add(int a, String b) {
		
		no=a;
		name=b;
		
	}
	
	void display(){
		
		System.out.println(no);
		System.out.println(name);
	}
	
	void display1() {
		this.display(); // or display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Methodk a1 = new Methodk();
		a1.add(11, "Ram");
		a1.display();
		a1.display1();
		
	}

}
