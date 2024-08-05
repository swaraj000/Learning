package string;

public class Count_alpha_char_digit {
	
	
	//find the count of alphabet,digit,special character
			public static void main(String[] args) { 
				
				String a = "My name is Swaraj *&^%$#@ 0123456789";
				int alpha =0;
				int num =0;
				int spChar=0;
				
				for(int i=0; i<a.length();i++)
				{
					if((a.charAt(i)>='A' && a.charAt(i)<='Z') || (a.charAt(i) >='a' && a.charAt(i)<='z'))
					{
						alpha=alpha+1;
					}
					else
					{
					if(a.charAt(i) >='0' && a.charAt(i) <='9') 
					{
						num=num+1;
					}
					else
					{
						spChar=spChar+1;
					}
					}	
				}
				System.out.println("alphabet count = "+ alpha);
				System.out.println("number count = " + num);
				System.out.println("character count = "+ spChar);
				
			}
}


