package p1;

public class ExceptionHandling {

	public static void divide() throws Exception
	{
		int x=5;
		int y=1;
		System.out.println(x/y);
		throw new ArithmeticException();
	}
	public static void main(String[] args){
		try
		{
			divide();
		}
		catch(Exception e)
		{
			System.out.println("Exception came" + e.getMessage());
		}
		
//		int x=5;
//		int y=0;
//		System.out.println(x/y);
//		try
//		{
//			System.out.println(x/y);
//		}
//		catch(Exception e)
//		{
//			System.out.println("Exception came" + e.getMessage());
//		}
//		
//		finally {
//			System.out.println("last section");
//		}
		System.out.println("hello");

	}

	
}
