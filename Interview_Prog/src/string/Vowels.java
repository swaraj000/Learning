package string;

public class Vowels {
	
	public static void main(String[] args) { 
		
		String x = "my name is swaraj";
		
		for ( int i=0; i<x.length();i++)
		{
			if(x.charAt(i)=='a' ||x.charAt(i)=='e' || x.charAt(i)=='i'||x.charAt(i)=='o'||x.charAt(i)=='u')
			{
				System.out.println(x.charAt(i));
			}
		}
	}
	

}
