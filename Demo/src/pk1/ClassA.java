package pk1;

public class ClassA {

	/* Pattern *
	     *
		***
	   *****
	  *******
	 *********
	 */
	public static void main(String[] args) {
		
		int odd=1,space=4;
		
		for(int i=1;i<=5;i++)
		{
			int k=0;
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=odd;j++)
			{
				if(j<=i)
				{
					k=k+1;
				}
				else
				{
					k=k-1;
				}
				System.out.print("*");
			}
			System.out.println();
			odd=odd+2;
			space=space-1;
		}
		

		//System.out.println("hello world");
	}

}
