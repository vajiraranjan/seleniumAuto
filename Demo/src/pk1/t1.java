package pk1;

public class t1 {

	public static void main(String[] args) {
		try
		{
			bad();
			System.out.println("a");
		}
		catch(RuntimeException ex)
		{
			System.out.println("b");
		}
		catch(Exception ex1)
		{
			System.out.println("c");
		}
		finally
		{
			System.out.println("d");
			
		}
		System.out.println("e");
	}
	public static void bad()
	{
		throw new RuntimeException(); 
		// TODO Auto-generated method stub

	}

}
