package pk1;

public class ReverseInt {

	public static void main(String[] args) 
	
	{
		int num =1234561;
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println("Reverse Integer is " +rev);

		//2nd method
		long num1=1234567771;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	}
	
	

}
