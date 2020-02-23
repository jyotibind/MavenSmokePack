package day10;

public class ThrowsEgwithoutTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age=10;
		if (age < 18)
		{
			//throw new ArithmeticException(); // it will call automatically Arithmetic Exception's
			throw new ArithmeticException("Not Valid");
			//it will call ArithmeticException's parameterized constructor
		}
		else
		{
			System.out.println("Eligible");
		}

	}

}
