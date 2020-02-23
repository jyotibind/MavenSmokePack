package day10;

public class Finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10,b=0;
		try
		{
			int c=a/b;
			System.out.println(c);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Check second number");
		}
		
		try
		{
			int arr[]= {10,20,30};
			System.out.println(arr[10]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		
		{
			System.out.println("Check your array");
		}
		
		finally
		{
			System.out.println("Finally Executed");
		}

		System.out.println("End of the code");
	}

}
