package pk1;

import java.util.Scanner;

public class multimatrixdynamic {

	private static Scanner in;

	public static void main(String[] args) 
	{
		int m,n,c,d,p,q,k,sum=0;
		
		in = new Scanner(System.in);
		System.out.println("Enter no of row and column of 1st Matrix");
		m=in.nextInt();
		n=in.nextInt();
		
		int first[][]=new int[m][n];
		System.out.println("Enter element of 1st Matrix");
		
		for(c=0;c<m;c++)
		{
			for(d=0;d<n;d++)
			{
				first[c][d]=in.nextInt();
			}
		}
	
		
		System.out.println("Enter no of row and column of 2nd matrix");
		p=in.nextInt();
		q=in.nextInt();
		
		if(n!=p)
		{
			System.out.println("Multiplication is not possible");
		}
		else
		{
			int second[][]=new int[p][q];
			int mul[][]=new int[m][q];
			System.out.println("Enter element of 2nd Matrix");
			
			for(c=0;c<p;c++)
			{
				for(d=0;d<q;d++)
				{
					for(k=0;k<p;k++)
					{
						sum=sum+first[m][k]*second[k][q];
					}
					mul[c][d]=sum;
					sum=0;
						
				}
			}
			System.out.println("Resultant Product is");
			
			for(c=0;c<m;c++)
			{
				for(d=0;d<q;d++)
				{
					System.out.print(mul[m][q] + " ");
				}
				System.out.println();
			}
		}
	}

}
