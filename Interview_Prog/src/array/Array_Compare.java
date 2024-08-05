package array;

import java.util.Arrays;

public class Array_Compare {
	public static void main(String[] args) {
		
		//to compare the two array
		int [] ar1= {10,20,30,40};
		int [] ar2= {15,20,25,45};
		int [] ar3= {10,20,30,40};
		
		boolean a=Arrays.equals(ar1, ar3);
		boolean b=Arrays.equals(ar2, ar3);
		boolean c=Arrays.equals(ar2, ar1);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
	}

}
