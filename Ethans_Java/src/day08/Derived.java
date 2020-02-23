package day08;

public class Derived extends Base{
	void show()
	{
		System.out.println("In derived class show method");
	}
	void display()
	{
		show();  //will call Derived class method show()
		super.show();  //will call Base class method show(),super with method can be used anywhere
	}
	
	
}
