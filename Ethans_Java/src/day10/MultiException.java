package day10;

public class MultiException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			int arr[] = {10,20,30};
			try
			{
				try
				{
					String s = null;
					System.out.println(s.length());
				}
				catch(NullPointerException e)
				{
					System.out.println("String is null");
				}
				System.out.println(arr[10]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Check your array");
			}
			
			int a=10,b=0;
			int c=a/b;
			System.out.println(c);
			System.out.println("End of code");
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("Check your 2nd no");
		}
		System.out.println("End of try catch");

	}

}
