package pk1;

public class ClassB {

	// Pattern Related Programs
	/* 
   1 
  212 
 32123 
4321234 
 32123 
  212 
   1 
 */
	public static void main(String[] args) 
	{
	
		int odd=1,start=0,space=4;
		for(int i=1;i<=7;i++)
		{ 
			
		
			for(int j=1;j<space;j++)
			{
				System.out.print(" ");
			}
			if(i<4)
			{
				start=i;
				space--;
			}
			else
			{
				start=8-i;
				space++;
			}
			
			for(int j=1;j<=odd;j++)
			{
				int middlec=odd/2+1;
				
				System.out.print(start);
				if(j<middlec)
				{
					start--;
				}
				else
				{
					start++;
				}
			}
			System.out.println(" ");
			if(i<4)
			{
				odd=odd+2;
			}
			else
			{
				odd=odd-2;
			}
		}
		
		

	}

}
