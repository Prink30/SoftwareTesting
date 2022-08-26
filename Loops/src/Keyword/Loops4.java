package Keyword;

public class Loops4 {
	
	
	
	void test1(int a) {
		
		if(a<=60 && a>=70) {
			System.out.println("D Grade");
		} else if(a>=80 && a<=70) {
			System.out.println("C Grade");
		} else if (a>=70 && a>=80) {
			System.out.println("B Grade");
		}else {
			System.out.println("A Grade");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loops4 b1 = new Loops4();
		b1.test1(80);

	}

}
