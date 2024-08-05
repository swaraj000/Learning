package prime_No;

public class PrimeClass1 {
	
	public static void main(String[] args) {
		
		
		
		for (int i =1; i<=50;i++)
		{
			  int count=0;
			for (int j =i; j>=1; j--)
			{
				if(i%j==0)
				{ 
				    count = count+1;
				}
			}
			
			if(count==2)
			{
				System.out.println("Prime num " + i);
			}
			else
			{
				System.out.println("not Prime num");
			}
		}
		
		
	}

}
