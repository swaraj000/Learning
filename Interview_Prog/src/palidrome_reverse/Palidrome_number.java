package palidrome_reverse;

public class Palidrome_number {

	public static void main(String[] args) {
		
		int n =454;
		int temp;
		int sum=0;
		int original=n;
		
		while(n>0)            // 454   , 45   ,4
		{
			temp = n%10;           // gives->4  , 5   , 4
			sum = (sum*10)+temp;      // gives->4  , (4*10)+5=45,   (45*10)+4=454
			n=n/10;                 //gives->45
		}
		
		System.out.println(sum);
		
		if(original==sum)
		{
			System.out.println("Num is palidrome");
		}
		else
		{
			System.out.println("Num is not palidrome");
		}
		
	
	}
}
