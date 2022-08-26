package Basics;

import java.util.*;
public class ListEx {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list1 = new ArrayList<String>();
		
		list1.add("sri");
		list1.add("Reena");
		list1.add(" ");
		list1.add("Reena");
		
		// we can print values in three ways
		
		//1st type
		
		System.out.println(list1);
		
		//2nd type - using for each loop
		
		for(String s1 : list1) {
			System.out.println(list1);	
		}
		
		//3 rd type - using iterator concept
		
		ListIterator li = list1.listIterator();
		
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}

	}

}
