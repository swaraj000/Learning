package string;

public class No_of_letter_Ocurrance {
	
	public static void main(String[] args) {
		
		//to find count of 'e'
		
		String a="swaraj patel yogesh geetanjali rupalee sagar dhanashree";
		
		int s = a.length();
		System.out.println(s);
		
		String b = a.replace("e", "");
		System.out.println(b);
		int t =b.length();
		System.out.println(t);
		
		int num = s-t;
		System.out.println("No of times e = " +num);
		
		
		
	}

}
