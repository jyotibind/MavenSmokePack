package day0702;

public class Admin extends Employee {
	
	int allowance;
	int sal;
	
	//ace is a variable for allowance

	void accept(int allowance)
	{
		this.allowance=allowance;
	}
	
	void calSalary()
	{
		sal=allowance+basic_sal;
	}
	void display()
	{
		System.out.println("Salary of Admin"+"\t"+sal);
		//System.out.println("Salary with allowance"+"\t"+sal);	
	}
}
