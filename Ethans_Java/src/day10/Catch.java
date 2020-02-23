package day10;

public class Catch {
	
	public static void main(String[] args)
	{
		try
		{
			int a=10,b=0;
			int c=a/b;
			System.out.println(c);
			
			int arr[]= {10,20,30};
			
			System.out.println(arr[1]);
			System.out.println("End of code");
			String s= null;
			System.out.println(s.length());
		}
		catch(ArithmeticException e)
		
		{
			//System.out.println(e);
			System.out.println("Check 2nd no");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		
		{
			System.out.println("Check your array");
		}
		catch(Exception e)
		
		{
			System.out.println(e);	
		}
		
		System.out.println("End of try catch");
	}

}
