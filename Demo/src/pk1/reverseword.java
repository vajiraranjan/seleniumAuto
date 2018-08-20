package pk1;

public class reverseword {

	public static void main(String[] args) 
	{
		String str="I Love My India";
		String Spit[]=str.split(" ");
		String rev="";
		for(int i=0;i<=Spit.length-1;i++)
		{
			for(int j=Spit.length-1;j>=0;j--)
			{
				rev = rev+ str.charAt(j)+ " ";
			}
			System.out.println(rev);
		}
		
		
	}

}
