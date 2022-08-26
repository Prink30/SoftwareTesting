package Basics;

public class Sample extends SchoolDetails {
	void schoolname() {
		System.out.println("Vasavi Vidyalaya");
	}
	
	void staffname() {
		System.out.println("Bhuvana");
	}
	
	void marks() {
		System.out.println("95");
	}
	
	void staffage() {
		System.out.println("27");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample s1 = new Sample();
		
		s1.schoolname();
		s1.staffname();
		s1.marks();
		s1.staffage();
	}

}
