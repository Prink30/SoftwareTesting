package Keyword;

public class Sample {

	int rollno;
	String name;
	
	void add(int rollno, String name) {
		
	this.rollno=rollno;
	this.name=name;
				
	}
	
	void display() {
		
		System.out.println(rollno);
		System.out.println(name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample s = new Sample();
		s.add(22, "Reena");
		s.display();
		// 0 and null due to default constructor i.e the values are not assigned (without using this keyword)
		

	}

}
