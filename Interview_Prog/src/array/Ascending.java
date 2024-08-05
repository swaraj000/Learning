package array;

public class Ascending {
	
	public static void main(String[] args) { 
		
		int [] a = {10,5,20,7};
		int b ;
		
		for(int i=0;i<a.length;i++)  // i=1 
		{
			for(int j=i+1;j<a.length;j++) //j=3 a[j]=7
			{
				if(a[i]>a[j])  //5>7  a[i]=10
				{
					b=a[i];
					a[i]=a[j];  //a[i]=5
					a[j]=b;   //a[j]=10
				}
			}
			System.out.println(a[i]);
		}
	}

}
