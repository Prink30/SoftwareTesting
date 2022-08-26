package Keyword;

public class Loops3 {
	
	void marks() {
		int mark=90;
		
		if (mark<=65 && mark>=70) {
			System.out.println("D Grade");
		}
		
		else if(mark<=80 && mark>=90) {
			System.out.println("C Grade");
		}
		
		else if(mark<=80 && mark<=70) {
			System.out.println("B Grade");
		}
		
		else if(mark>=90 && mark>=80) {
			System.out.println("A Grade");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Loops3 a1 = new Loops3();
     a1.marks();
	}

}
