package example;

public class Excep3 {
	public static void main(String args[])
	{
		int a=10;
		try
		{
			int b=a/0;
			System.out.println("rest of the code ");
		}
		catch(ArithmeticException i)
		{
			System.out.println(i);
			
		}
		
	}
}
