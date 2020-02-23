package day11;

import java.util.Scanner;  // import predefined scanner class to take input from user

public class Employee {
	
	int age,id,sal;
	String name;
	Scanner s= new Scanner(System.in); // used to take input from user
	void accept()
	{
		System.out.println("Enter id");
		id=s.nextInt();
		System.out.println("Enter name");
		name=s.next();
		System.out.println("Enter age");
		age=s.nextInt();
		System.out.println("Enter salary");
		sal=s.nextInt();
		
	}
	
	void display()
	{
		System.out.println("Details of Employee");
		System.out.println("Id:"+id);
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Salary:"+sal);
	}
	
	public static void main(String[] args) {
		
		Employee e= new Employee();
		e.accept();
		e.display();
	}

}
