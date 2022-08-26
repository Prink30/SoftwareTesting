package InterfaceExample;

public class Test1 implements IntFace2 {

	public void courses() {
		
		System.out.println("testing");
	}
	
	public void data() {
		System.out.println("new data");
	}
	
	public void test23() {
		System.out.println("test");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
Test1 t1 = new Test1();
t1.courses();
t1.data();
t1.test23();
	}

}
