package day11;

import java.util.Scanner;  // import predefined scanner class to take input from user

public class EmployeeArray {
	
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
	
	/*void display()
	{
		System.out.println("Details of Employee");
		System.out.println("Id:"+id);
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Salary:"+sal);
	}
	*/
	void displaysp()
	{
		
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
	
	public static void main(String[] args) {
		
		EmployeeArray e[] = new EmployeeArray[3];
		for(int i=0;i<e.length;i++)
		{
			e[i] = new EmployeeArray();
			e[i].accept();
			//e[i].display();
			/*
			if(e[i].sal>=30000 && e[i].sal<=40000)
			{
				e[i].displaysp();
			}
			else
			{
				System.out.println("Salary is less than 30k");
			}
			*/
		}
		// or
		
		for(int i=0;i<e.length;i++)
		{
			e[i] = new EmployeeArray();
			e[i].accept();
			//e[i].display();
			
		}
		
		for(int i=0;i<e.length;i++)
		{
		if(e[i].sal>=30000 && e[i].sal<=40000)
		{
		System.out.println("Name:"+e[i].name+"id:"+e[i].id);
		}
		}
		
		
		
		
		
	}

}

