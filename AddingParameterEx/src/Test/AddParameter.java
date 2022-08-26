package Test;

public class AddParameter {
	
	void schoolname(String sn) {
		
		System.out.println("School name is " + sn);
	}

void principalname(String pn) {
		
		System.out.println("Principal name is " + pn);
	}

void marks(int s1, int s2, int s3, int s4, int s5) {
	
	System.out.println("Total marks is " + (s1 +s2+s3+s4+s5));
	
	int c= s1+s2+s3+s4+s5;
	
	System.out.println("Average Mark is " + c/5);
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AddParameter obj = new AddParameter();
		
		obj.schoolname("Vasavi Vidyalaya");
		obj.principalname("Reena");
		obj.marks(70, 75, 80, 85, 90);
		
	}
	

}
