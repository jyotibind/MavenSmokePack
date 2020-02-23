package Day05;

public class Employee 

{
	int id,age,sal;
	String name;
	
	void acceptData(int n1,String n2,int n3,int n4)
	{
		id=n1;
		name=n2;
		age=n3;
		sal=n4;
	}
	
	void display1() 
	{
	  System.out.println("Details of first employee");
		System.out.println("Id "+id);
		System.out.println("Name "+name);
		System.out.println("Age "+age);
		System.out.println("Salary "+sal);
	}
	
	void display2()
	
	{
		  System.out.println("Details of second employee");
			System.out.println("Id "+id);
			System.out.println("Name "+name);
			System.out.println("Age "+age);
			System.out.println("Salary "+sal);
		}

}
