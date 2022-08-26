package Basics;

public class Arrayex {

	
	void test() throws ArrayIndexOutOfBoundsException{
		int[] a1 = new int[3];
		a1[0]=20;
		a1[1]=30;
		a1[2]=40;
		a1[3]=50;
		
		System.out.println(a1.length);
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Arrayex a2 = new Arrayex();
  a2.test();
	}

}
