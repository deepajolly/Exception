package example;

public class Excep2 {
	public static void main(String args[])
	{
		int a=10;
		try
		{
			int b=a/0;
		}
		catch(ArithmeticException i)
		{
			System.out.println(i);
			
		}
		System.out.println("rest of the code ");
	}
}
