package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList3 {
	
	
	public static void main(String[] args) {
		
		//Ascending order for string
		ArrayList <String> list = new ArrayList <String> ();
		
		list.add("swaraj");
		list.add("yogesh");
		list.add("geetanjali");
		list.add("rupali");
		list.add("dhanshri");
		
		Collections.sort(list);
		
		System.out.println(list);
		
		
		
	}

}
