package Basics;

public class ExceptnEx {

	void Sample() {
		
		try {
			
			String s = null;
			System.out.println(s.length());
			
			int[] b = new int[2];
			b[0]=10;
			b[1]=20;
			b[2]=30;
			
			System.out.println(b.length);
			
			
		} catch (Exception a){
			System.out.println(a);
		}
		
		finally {
			
			String s = "Reena";
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExceptnEx a1 = new ExceptnEx();
		a1.Sample();
	}

}
