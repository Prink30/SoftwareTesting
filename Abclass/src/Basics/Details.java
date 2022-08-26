package Basics;

public class Details {
	
	void test() {
		try {
		String s=null;
		System.out.println(s.length());
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Details d1 = new Details();
d1.test();
	}

}
