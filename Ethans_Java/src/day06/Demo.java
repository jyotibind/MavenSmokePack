package day06;

public class Demo {

	Demo() //default constructor
	{
		System.out.println("In constructor");
	}
	
	Demo(int a) //parameterized constructor
	{
		System.out.println("In parameterised constructor "+a);
	}
	
	void show() {
		System.out.println("In show");
	}
}
