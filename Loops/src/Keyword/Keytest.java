package Keyword;

public class Keytest {

	int rollno;
	String name;
	//without using this keyword we are using global variable in a method
	
	void add(int num, String dba) {
		
		rollno=num;
		name=dba;
	}
	
	void display() {
		
		System.out.println(rollno);
		System.out.println(name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Keytest a = new Keytest();
		
		a.add(65, "Reeta");
		a.display();

	}

}
