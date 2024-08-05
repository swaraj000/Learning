package fibonacci_series;

public class Series_1 {
	
	public static void main(String[] args) {
		
		//fibonacci series from 0 to 10.(0,1,1,2,3,5,8,13,21,34,55----)
		// 0,1,
		int num1=0;
		int num2=1;
		int num3 ;
		int count = 10;
		
		for(int i=2;i<=count;i++)
		{
			num3=num1+num2; //1
			
			num1=num2;
			num2=num3;
		
		System.out.println(num3);
		}
	}

}
