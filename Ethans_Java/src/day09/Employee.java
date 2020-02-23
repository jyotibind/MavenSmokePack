package day09;

public class Employee extends Person {
	
	String name;
	int id;
	int sal;
	void accept(String name,int id,int sal)
	
	{
		this.name=name;
		this.id=id;
		this.sal=sal;		
	}
	
	void display()
	{
		System.out.println("Name of Person "+name);
		System.out.println("Id "+id);
		System.out.println("sal "+sal);
	
	}

}
