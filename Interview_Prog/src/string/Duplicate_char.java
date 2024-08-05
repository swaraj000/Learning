package string;

public class Duplicate_char {
	
	public static void main(String[] args) {
		
		//to find duplicate character from string
		
		String str ="hello all good morning";  // l=15
		char[] a = str.toCharArray();  // {h,e,l,l,o...l
		
		for(int i=0;i<str.length();i++)
		{
			int count=1;
			for(int j=i+1; j<str.length();j++) //j=15
			{
				if(a[i]==a[j] && a[i] !=' ')  //h==l
				{
					count=count+1;
					a[j]='0';
				}
			}
			if(count>1 && a[i] !='0')
			{
				System.out.println(a[i]);
				System.out.println("count of chara = " + count);
			}
		}
		
	}

}
