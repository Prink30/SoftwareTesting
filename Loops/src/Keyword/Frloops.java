package Keyword;

public class Frloops {
	
	void test() {
		for(int i=1;i<=10;i++) 
		{
			
			if(i%2==0) {
				System.out.println( i + "number is divisible by2");
			}else {
				System.out.println(i+ "number not divisible by 2 ");
			}
			
			break;
		
		}
			}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Frloops a1 = new Frloops();

a1.test();
	}

}
