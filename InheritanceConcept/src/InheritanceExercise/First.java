package InheritanceExercise;

public class First extends Base implements Second{
	

	public void groundfloor() {
		System.out.println("ground floor");
		
	}
	
	public void cricket() {
		System.out.println("playing cricket");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//First ab = new First();
	    Base cd = new First();
	    cd.a=30;
	    System.out.println(cd.a);
		//Second s = new First();
		
				
		
		
		//System.out.println(Second.a);
	}

}
