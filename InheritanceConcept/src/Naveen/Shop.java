package Naveen;

public class Shop implements Bottle, Flask{
	
public void colour() {
	System.out.println("red colour");
}
	
	public void shape() {
		System.out.println("rectangle shape");
	}
	
	public void cool() {
		System.out.println("cool to drink");
	}
	
	public void heat() {
		System.out.println("so hot");
	}
   
	public void validity() {
		System.out.println("validity is high");
	}
}

class Bigshop {
	
	
	public static void main(String[] args) {
		Shop s = new Shop();
		s.colour();
		s.shape();
		s.heat();
		s.cool();
		s.validity();
		
	Bottle b =	new  Shop();
	b.colour();
	b.shape();
	b.cool();
	
	Flask f = new Shop();
	
	f.heat();

	
	}
	
	
	
}
