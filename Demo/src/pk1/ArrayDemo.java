package pk1;

public class ArrayDemo {

	public static void main(String[] args) 
	{
		int[] a=new int[3];
	//	int[] d=new int[-3];                //NegativeArraySizeException
		int[] c= {10,20,30};
		int[] b=new int[] {10,20,30};
		
		for(int i:c)
		{
			System.out.println(i);
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}

	}

}
