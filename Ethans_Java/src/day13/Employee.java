package day13;

import java.util.ArrayList;

public class Employee {
	
	String name;
	int age,sal,id;

	public Employee(String name, int age, int sal, int id) {
		super();
		this.name = name;
		this.age = age;
		this.sal = sal;
		this.id = id;
	}
	
	public String toString()
	{
		return "\nId:"+id+"\t"+"Name:"+name+"\t"+"Age:"+age+"\t"+"Salary:"+sal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee("Juhi",23,4000,1);
		Employee e2=new Employee("Jyoti",24,5000,2);
		Employee e3=new Employee("Rakesh",25,6000,3);
		ArrayList<Employee>a1=new ArrayList<Employee>();
		
		// Always take generic equivalent to classname
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);
		System.out.println(a1);

	}

}
