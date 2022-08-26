package Basics;

public class Test {
	
	Test(String sn , String Pn){
		System.out.println("School name is " + sn);
		System.out.println("Principal name is " + Pn);
	}
	
void school(String name, int age, int salary) {
	
	System.out.println("Staff name is " + name);
	System.out.println("Staff age is " + age);
	System.out.println("Salary of Staff " + salary );
	
	
	
	 
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Test a1 = new Test("Vasavi Vidyalaya", "Padmalatha");

Test a2 = new Test("Roooo","payflex");



a1.school("Reena", 28, 16000);
a2.school("priyanka",20,40);



	}

}
