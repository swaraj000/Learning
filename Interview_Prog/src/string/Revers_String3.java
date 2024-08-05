package string;

public class Revers_String3 {
	
	public static void main(String[] args) {
		
		String a ="My name is Swaraj";
		String [] b = a.split(" ");
		
		   String d="";
		   String m="";
		
			for (int j=0; j<=b.length-1;j++)
			{
				d = b[j];
				
				for (int k=d.length()-1;k>=0;k--)
				{
					m=m+d.charAt(k);
				}
				System.out.print(m);
				System.out.print(" ");
				m="";
			}
		
		
		
		
	}

}
