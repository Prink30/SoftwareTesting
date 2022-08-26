package Basics;

public class stringnew {
	
	public void sample() {
		
		String s1 = "Devi";
		
		String s2= "Devi";
		
		if(s1==s2) {
			
			System.out.println("object reference variable is same");
			
		} else {
			System.out.println("object reference variable is not same");
		}
		
		if(s1.equals(s2)) {
			
			System.out.println("values are same");
		} else {
			System.out.println("values are different");
		}
		
	}
	
	void display() {
		
		String s3 = "Arjun";
		String s4 = "arjun";
		
if(s3.equalsIgnoreCase(s4)) {
			
			System.out.println("name is same");
			
		} else {
			System.out.println("name is different");
		}
	}

	void test() {
		
		String s5 = "Hello world";
		String s6 = "Hello";
		
		if(s5.contains(s6)) {
			System.out.println("s5 value is present in s6");
		}else {
			System.out.println("s5 value is not present in s6");
		}
	}
	
	void test1() {
		String a = "49.5";
		
		
		a=a.concat("Reena");
		
		//a.concat("Aaaron");
		
		System.out.println(a);
		
		
	}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub

		 stringnew s1 = new stringnew();
		 
		 s1.sample();
		s1.display();
		s1.test();
		s1.test1();
		
	}

}
