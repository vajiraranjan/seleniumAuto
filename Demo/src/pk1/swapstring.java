package pk1;

public class swapstring {

	public static void main(String[] args) 
	{
		String a= "hello";
		String b="world";
		
		System.out.println("Before swap:::" );
		System.out.println(a);
		System.out.println(b);
		
		a =a+b;
		b= a.substring(0, a.length()-b.length());
		a= a.substring(b.length());
		
		
		System.out.println("After swap:::" );
		System.out.println(a);
		System.out.println(b);

	}

}
