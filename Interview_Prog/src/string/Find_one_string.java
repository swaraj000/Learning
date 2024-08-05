package string;

public class Find_one_string {
	
	public static void main(String[] args) { 
		
		//to print only swaraj from given string
	String a = "my name is Swaraj patel";
	String [] b= a.split(" ");
	
	for(int i=0;i<b.length;i++)
	{
		if(b[i].equalsIgnoreCase("swaraj"))
		{
			System.out.println(b[i]);
		}
	}
        
	}
	

}
