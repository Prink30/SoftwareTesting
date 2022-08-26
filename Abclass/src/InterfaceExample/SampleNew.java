package InterfaceExample;

public class SampleNew implements Sample {
	
	public void data() {
	
		System.out.println("new data");
		System.out.println(s);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SampleNew s2 = new SampleNew();
		s2.data();
		
	}

}
