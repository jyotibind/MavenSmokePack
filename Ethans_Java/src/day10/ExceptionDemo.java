package day10;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			int a=10,b=0;
			int c=a/b;
			System.out.println(c);
			
			int arr[] = {10,20,30};
			System.out.println(arr[10]);
			System.out.println("End of Code");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("Check 2nd no");
		}
		System.out.println("End of try catch");

	}

}
