package string;

public class ReverseString4 {
	
	public static void main(String[] args) {
		
		
		String a ="My name is Swaraj";
		String [] b= a.split(" ");
		String c="";
		String m="";
		
		for(int i=b.length-1;i>=0;i--)
		{
			c=b[i];
			for(int j=c.length()-1; j>=0; j--)
			{
				m=m+c.charAt(j);
			}
			System.out.print(m);
			System.out.print(" ");
			m="";
		}
	}

}
