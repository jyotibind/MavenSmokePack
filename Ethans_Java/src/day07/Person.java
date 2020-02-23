package day07;

public class Person {
	
	String name,quali;
	int age;

	void accept(String name,String quali,int age)
	
	{
		
		this.name=name;
		this.quali=quali;
		this.age=age;
		
	}
	
	void disp()
	
	{
		System.out.println(name);
		System.out.println(quali);
		System.out.println(age);
	}

}
