package day08;

public class Child extends Parent{

	Child()
	
	{
		super(10);  // in case of parameterized constructor we have to explicitly use super keyword
		
		//it should be always first statement in constructor and always used in child class
		System.out.println("In Class Child");
	}
	
}
