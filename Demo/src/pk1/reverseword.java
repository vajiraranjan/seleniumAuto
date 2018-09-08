package pk1;

public class reverseword 
{

	public static void main(String[] args) 
	{
		String str="I Love My India";
		String Spit[]=str.split(" ");
		String rev="";
		for(int i=0;i<=Spit.length-1;i++)
		{
			String word=Spit[i];
			String revword="";
			for(int j=word.length()-1;j>=0;j--)
			{
				revword = revword+ word.charAt(j);
			}
			rev=rev+revword+ " ";
			
		}
		System.out.println(rev);
		
	}

}
