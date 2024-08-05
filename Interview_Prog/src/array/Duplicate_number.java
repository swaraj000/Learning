package array;

public class Duplicate_number {
	
	public static void main(String[] args) {
		
		// to find duplicate number from array
		int [] a = {1,8,14,6,8,2,18,2};
		
		for(int i =0; i < a.length;i++)
		{
			for(int j = i+1; j <a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[j]);
				}
			}
		}
	}

}
