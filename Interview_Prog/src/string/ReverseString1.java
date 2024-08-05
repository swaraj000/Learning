package string;

public class ReverseString1 {
	
	public static void main(String[] args) {
		
		String a = "My name is Swaraj";
		String b = "";
		
		for (int i=(a.length()-1);i>=0;i--)
		{
			b= b+a.charAt(i);
		}
		System.out.println(b);
		
		
		//Or
		
		String c= "Velocity";
		String d ="";
		
		for (int j=(c.length()-1); j>=0; j--)
		{
			d=d+c.charAt(j);
		}
		System.out.println(d);
		
		
		
		
		
		
		
	}

}
