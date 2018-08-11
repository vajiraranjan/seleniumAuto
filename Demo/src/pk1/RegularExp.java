package pk1;

public class RegularExp {

	public static void main(String[] args) 
	{
		String s = "#$%^&GJJGV MGJ &%$&*(%(^(( SELenium 1234^&%^^986";
		s= s.replaceAll("[^a-zA-Z0-9]", " "); //if using space then dont remove space
		System.out.println(s);

	}

}
