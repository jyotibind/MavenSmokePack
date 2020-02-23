package day06;

public class StaticDemo {
	
	static
	{
		String OS=System.getenv("OS");
		
		//getenv is predefined method and OS is predefined var
		
		if(OS.equals("Linux"))
		{
			System.out.println("You can proceed further");
		}
		else
		{
			System.out.println("Please check with your OS");
			System.exit(0);
			//used to break the flow of code here
		}
	}

	public static void main(String args[])
	
	{
		System.out.println("In main");
	}
}
