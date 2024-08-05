package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
	public static void main(String[] args) {
		
	//sort  ascending order from ArrayList
	
	ArrayList <Integer> list = new  ArrayList <Integer> ();
	
	list.add(12);
	list.add(5);
	list.add(25);
	list.add(11);
	
	Collections.sort(list);
	
	System.out.println(list);
	
	
	
	}
}
