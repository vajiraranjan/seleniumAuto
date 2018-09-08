package pk1;

import java.util.Scanner;

public class multimatrixdynamic 
{

	private static Scanner in;

	public static void main(String[] args) 
	{
		int sum=0;
		
		in = new Scanner(System.in);
		int m=in.nextInt();
		int n=in.nextInt();
		int first[][]=new int[m][n];
		System.out.println("Enter element of 1st Matrix");
		
		for(int c=0;c<m;c++)
		{
			for(int d=0;d<n;d++)
			{
				first[c][d]=in.nextInt();
			}
		}
		System.out.println("Enter no of row and column of 2nd matrix");
		int p=in.nextInt();
		int q=in.nextInt();
		if(n!=p)
		{
			System.out.println("Multiplication is not possible");
		}
		else
		{
			int second[][]=new int[p][q];
			int mul[][]=new int[m][q];
			System.out.println("Enter element of 2nd Matrix");
			
			for(int c=0;c<p;c++)
			{
				for(int d=0;d<q;d++)
				{
					second[c][d]=in.nextInt();
				}
			}
			for(int c=0;c<m;c++)
			{
				for(int d=0;d<q;d++) 
				{
					for(int k=0;k<p;k++)
					{
						sum=sum+first[c][k]*second[k][d];
					}
					mul[c][d]=sum;
					sum=0;
						
				}
			}
			System.out.println("Resultant Product is");
			
			for(int c=0;c<m;c++)
			{
				for(int d=0;d<q;d++)
				{
					System.out.print(mul[c][d] + " ");
				}
				System.out.println();
			}
		}
	}

}
