package day10;

public class AgeNotValidException extends Exception

{
	public AgeNotValidException()
	{
		System.out.println("In AgeNotValidException default constructor");
	}
	
	public AgeNotValidException(String msg)
	{
		System.out.println(msg + "In AgeNotValidException parametrized Constructor");
	}
}
