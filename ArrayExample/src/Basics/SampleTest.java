package Basics;

public class SampleTest {

	//1st type
	void test() {
		
		int[] s = new int[5];
		
	s[0]=10;
	s[1]=20;
	s[2]=30;
	s[3]=40;
	s[4]=50;
	
	System.out.println(s.length);
	
	for(int i=0;i<s.length;i++)
	{
		
		System.out.println(s[i]);
	}
	
	}
	
	//2nd type 
	
	void data() {
		
		
	int	 a1 []= {15,25,30,35};
	System.out.println(a1.length);
	}
	
	//3rd type
	
	void test2() {
		
		int[] b1 = new int[4];
		
		System.out.println(b1.length);
		
	for(int i=0; i<b1.length; i++) {
		System.out.println(b1[i]);
	}
	}
	
	//4 th type
	
	 void test4() {
	 
	 int[] ab = new int[3]; 
	  ab[0]=20; 
	  ab[1]=30; 
	  ab[2]=40; 
	 // ab[3]=50;
	  
	  System.out.println(ab.length); }
	 
	
	//5th type - using for each loop
	
	void test5() {
		
		int[] a4 = new int[3];
		a4[0]=11;
		a4[1]=22;
		a4[2]=33;
		
		System.out.println(a4.length);
		for(int name:a4 ) {
			
		System.out.println(name);
			
			if(name==22) {
				System.out.println("22 is present");
				break;
			} else {
				System.out.println("19 is not present");
			}
				
		}
		
	}
	
	void test6() {
		String[] s6 = new String[4];
		s6[0]= "Khyathi";
		s6[1]="Hrithik";
		s6[2]="Reeta";
		s6[3]= "Deepi";
		
		System.out.println(s6.length);
		
		for(String st : s6) {
			System.out.println(st);
		
		//without printing unwanted elemnt
		if(st.contains("Reeta")) {
			System.out.println("Reeta is present");
			//break;
		
		}
		}
				}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SampleTest s2 = new SampleTest();
		s2.test();
		s2.data();
		s2.test2();
		s2.test5();
		s2.test6();
		
	}

}
