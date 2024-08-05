package palidrome_reverse;

public class Palidrome_string {
	public static void main(String[] args) {
		
		String a = "Madam";
		String b="";
		
		for (int i = (a.length())-1 ; i>=0; i--)
		{
			b=b+a.charAt(i);
		}
		
		System.out.println(b);
		
		if (a.equalsIgnoreCase(b))
		{
			System.out.println("Num is Palidrome");
		}
		else
		{
			System.out.println("Num is not Palidrome");
		}
	}

}
