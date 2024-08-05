package Factorial;

public class Test_Class_1 {
	
	public static void main(String[] args) {
		
		//to find factorial number = 4
		int fact =1;
				
		for(int a=4; a>=1;a--)
		{
			fact = a * fact;	
		}
		System.out.println(fact);
		
		//OR
//		int fact=1;
//		int a= 4;
//		
//		while(a>=1)
//		{
//			fact =a*fact;
//			a--;
//			
//			System.out.println(fact);
//		}
		//System.out.println(fact);
	}

}
