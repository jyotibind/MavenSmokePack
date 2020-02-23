package day06;

public class Employee {

	int id,age,sal;
	String name;
	static String company_name = "Ethans";
	static int count=0;
	
	 Employee(int n1,String n2,int n3,int n4)
	 
	{
		id=n1;
		name=n2;
		age=n3;
		sal=n4;
		count++;
	}
	
	void display() 
	{
		System.out.println("Id "+id);
		System.out.println("Name "+name);
		System.out.println("Age "+age);
		System.out.println("Salary "+sal);
		System.out.println("Company Name "+company_name);
	}
	
	static void print()
	
	{
		System.out.println("Inside static");
		System.out.println(company_name);
		System.out.println(count);//can only access static variables
		//System.out.println(id); cannot use here
	}
}
