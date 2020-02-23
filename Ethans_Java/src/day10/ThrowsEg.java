package day10;

public class ThrowsEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age=10;
		try
		{
			if(age<18)
			{
				//throw new ArithmeticException();//it will call ArithmeticException's 
				//default constructor
				throw new ArithmeticException("not valid");
				//it will call Arithmetic Exception's parametrized constructor
			}
			else
			{
				System.out.println("Eligible");
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("not eligible");
		}

	}

}
