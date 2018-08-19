package pk1;

public class matrixmul {

	public static void main(String[] args) 
	{
		int m1[][]= {{1,2,3},{4,5,6},{7,8,9}}; //3*3
		int m2[][]= {{7,8,9},{9,10,11},{11,12,13}}; //3*3
		int r[][]= new int[3][3];
		int sum=0;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<3;k++)
				{
					sum=sum+m1[i][k]*m2[k][j];
				}
				r[i][j]=sum;
				sum=0;
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(r[i][j] +" ");
			}
			System.out.println();
		}
		
		

	}

}
