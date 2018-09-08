package pk1;

public class fibonacci {

	public static void main(String[] args) 
	{
		int n= 10;
		int t1 = 0,t2=1,next;
		
		for(int i=1;i<=n;i++)
		{
			System.out.print(t1 + " ");
			next= t1+t2;
			t1=t2;
			t2=next;
		}

	}

}
