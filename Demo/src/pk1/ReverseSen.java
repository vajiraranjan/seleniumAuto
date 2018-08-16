package pk1;

public class ReverseSen {

	public static void main(String[] args) 
	{
		String str = "I Love My India";
		String Spit[] = str.split(" ");
		String rev ="";
		for(int i= Spit.length-1;i>=0;i--)
		{
			rev=rev+Spit[i] + " ";
		}
		System.out.println("The reversed sentence is ::: " +rev);

	}

}
