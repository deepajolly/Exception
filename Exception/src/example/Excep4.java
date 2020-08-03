package example;

public class Excep4 {
	public static void main(String args[])
	{
		int a=10;
		try
		{
			int b=a/0;
			System.out.println("rest of the code ");
		}
		catch(NullPointerException i)
		{
			System.out.println(i);
			
		}
		finally
		{
			System.out.println("rest of the code");
		}
		
	}
}
