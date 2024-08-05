package string;

public class Reverse_String2 {
	
	public static void main(String[] args) {
		
		String a= "My Name is Swaraj";  
		String [] b = a.split(" ");    //size =4  last index=4-1=3
		
		String c="";
		
		for (int i=(b.length-1); i>=0 ; i--)
		{
			c= c + b[i] +" " ;    //c=swaraj +is +name +my 
		}
		System.out.println(c);
		
	}

}
