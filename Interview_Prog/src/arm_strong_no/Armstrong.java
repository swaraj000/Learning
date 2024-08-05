package arm_strong_no;

public class Armstrong {
	
	public static void main(String[] args) {
		
		 // armstrong no.:- 153 , 370 , 371 , 407 etc..
		int n =153;
		double sum=0;
		double temp;
		int original=n;
		
		while(n>0) 
		 {
			temp = n%10;                  // gives--> (1st)-3 ,(2nd)-5  , (3rd)-1
			temp = Math.pow(temp, 3);     // support double datatype only.
			sum = sum +temp;             //gives-->(0+27=27) , (27+125=152) , (152+1=153)
			n= n/10;             // gives--> (1st)-153/10=15 , (2nd)-15/10=1 , (1/10=not satisfy)			
		 }
		
		System.out.println(sum);
		
		if (sum==original)
		{
			System.out.println("Armstrong No.");
		}
		else
		{
			System.out.println("Not Armstrong No.");
		}
		
		
	}

}
