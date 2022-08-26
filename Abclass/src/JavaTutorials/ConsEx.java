package JavaTutorials;

public class ConsEx {
	
	String employername;
	
	// No Arguement Constructor
	
	 ConsEx(){ 
		 int a=10; 
		 employername="seeta";
		 System.out.println(a+employername);
		 
		 }
	 
	//Parametrized Constructor
	 
	ConsEx(int a, int b, String s){
		
		
		System.out.println(a+b+s);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// constructor
		
		ConsEx obj = new ConsEx();
		ConsEx obj1 = new ConsEx(10,20,"Reena");

	}

}
