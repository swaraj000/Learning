package array;

public class SecondLargestNo {
	
	public static void main(String[] args) {
		
		//to find max & 2nd max no.
		
		int [] a= {5,15,50,20,45};
		int b;
		
		for(int i=0; i<a.length;i++)
		{
		   for(int j=i+1; j<a.length;j++)
		   {
			   if(a[i]<a[j])
			   {
				   b=a[i];
				   a[i]=a[j];
				   a[j]=b;
			   }
		   }
		}
		System.out.println("max no =" + a[0]);
		System.out.println("second largest =" + a[1]);
		
		
		
	}

}
