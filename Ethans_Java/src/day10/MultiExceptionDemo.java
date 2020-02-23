package day10;

public class MultiExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			int a=10,b=0;
			int c=a/b;
			System.out.println(c);
			
			int arr[] = {10,20,30};
			
			try 
			{
				System.out.println(arr[10]);
			}
			
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("check your array");
			}
			//we can write this type of code but control will not go in
			//has occurred in above code
			System.out.println("End of code");
		}

		catch(ArithmeticException e)
		{
			//System.out.println(e);
			System.out.println("Check 2nd no");
		}
		System.out.println("End of try catch");
	}

}
