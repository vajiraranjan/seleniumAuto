package pk1;

public class CharFollByOcc 
{

	public static void main(String[] args) 
	{
		String str="occurences";
		freq(str);
	}
	
		static int size =26;
		static void freq(String str)
		{
			int n=str.length();
			int[] fre= new int[size];
			for(int i=0;i<n;i++ )
			{
				fre[str.charAt(i) - 'a']++;
			}
			for(int i=0;i<n;i++)
			{
				if(fre[str.charAt(i) - 'a']!=0)
				{
					System.out.print(str.charAt(i));
					System.out.print(fre[str.charAt(i) - 'a']+ " ");
					fre[str.charAt(i) - 'a']=0;
				}
			}
		}
}
