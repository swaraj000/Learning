package array;

public class Second_largest_no {

	public static void main(String[] args) {
		
		
		int [] a = {10,20,60,50,40,30};
		int max =a[0];
		int secmax=a[0];
		int thirdmax =a[0];

		for(int i=0; i<a.length;i++)
		{
				if (a[i]>max)
				{
					max=a[i];
				}
				else
				{
				  if (a[i]>secmax && secmax !=max) //second largest
				  {
					secmax=a[i];
				  }
				  else
				  {
					  if (a[i]>thirdmax && thirdmax !=max) //third largest
					  {
						  thirdmax=a[i];
					  }
				  }
				}
		}
		System.out.println("Max "+ max);
		System.out.println("2nd Max "+ secmax);
		System.out.println("3rd Max "+ thirdmax);
			
	}
	
}
