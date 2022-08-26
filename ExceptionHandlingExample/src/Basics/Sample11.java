package Basics;

public class Sample11 {
	
	//nullpointer exception

	void test() {
		
		try {
		String s1 = null;
		System.out.println(s1.length());
		}
		
		catch(NullPointerException t1) {
			
		System.out.println(t1);
			//System.out.println("error");
		}
		
		}
	
	//array index out of bound 
	
	void sample() {
		try {
		int[] ab = new int[3]; 
		ab[0]=20;
		ab[1]=30; 
		ab[2]=40; 
		ab[4]=50;
		}
		
		catch( NullPointerException r) {
			System.out.println(r);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Sample11 s = new Sample11();
  s.test();
  s.sample();
  
  
	}

}
