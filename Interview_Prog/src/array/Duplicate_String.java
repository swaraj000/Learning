package array;

public class Duplicate_String {
	
	public static void main(String[] args) {
		
		// to find duplicate String from array
		String [] a = {"Velocity" , "pune" , "velocity", "mumbai", "Pune" , "patna" ,"Delhi" ,"Patna"};
		
		for(int i =0; i<a.length;i++)
		{
			for(int j =i+1; j<a.length;j++)
			{
				if(a[i].equalsIgnoreCase(a[j]))
				{
					System.out.println(a[j]);
				}
			}
		}
		
		
	}

}
