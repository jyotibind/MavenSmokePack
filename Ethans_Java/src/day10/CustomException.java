package day10;

public class CustomException {
	

		void checkAge (int age)
		{
			try
			{
				if(age < 18)
				{
					throw new AgeNotValidException(); 
				}
				else
				{
					System.out.println("Eligible");
				}
					
			}
			catch (AgeNotValidException e)
			{
				System.out.println("Not eligible");
			}
		}
		
		void ValidateAge(int age) throws AgeNotValidException
		
		{
			if (age < 18)
			{
				throw new AgeNotValidException("Age Invalid");
			}
			else
			{
				System.out.println("Eligible");
			}
		}// when using throws its method or objects responsibility to handle the exception

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomException c= new CustomException();
		c.checkAge(4);
		try
		{
			c.ValidateAge(2);
		}
		catch(AgeNotValidException e)
		{
			System.out.println("Not eligible");
			//e.printStackTrace();
		}
		

	}

}
