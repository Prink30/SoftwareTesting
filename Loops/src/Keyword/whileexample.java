package Keyword;

public class whileexample {
	
	void sample() {
		
		int i=1;
		
		while(i<10) {
			
			System.out.println(i);
			i++;
			
			
		}
	}
	
	//do while 
	
	void sample2() {
		
		int i=1;
		
		do {
			
			System.out.println(i);
			i++;
		} while(i<10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     whileexample a2 = new whileexample();
     
     a2.sample();
	}

}
