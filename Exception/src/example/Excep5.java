package example;

public class Excep5 {
	public static void main(String args[])
	{
		
		try
		{
			int b=10/0;
			System.out.println("rest of the code ");
		}
		catch(ArithmeticException i)
		{
			System.out.println(i);
			
		}
		finally
		{
			System.out.println("rest of the code");
		}
		
	}
}
