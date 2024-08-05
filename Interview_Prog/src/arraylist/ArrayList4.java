package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList4 {
	
	public static void main(String[] args) {
		
		//Descending order for string
		ArrayList <String> list = new ArrayList <String> ();
		
		list.add("swaraj");
		list.add("yogesh");
		list.add("geetanjali");
		list.add("rupali");
		list.add("dhanshri");
		
		Collections.sort(list,Collections.reverseOrder() );
		
		System.out.println(list);
		
		
		
	}

}
