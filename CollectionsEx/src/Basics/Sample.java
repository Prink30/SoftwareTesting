package Basics;

import java.util.*;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

 HashSet<String> hset = new HashSet<String>();
 
 hset.add("Reena");
 hset.add("Veena");
 
 
 System.out.println(hset);
 
 for(String s :hset) {
	 System.out.println(s);
 }
 
 Iterator ab = hset.iterator();
 
 while(ab.hasNext()) {
	 System.out.println(ab.next());
 }
 
 
 
 
		
	}

}
