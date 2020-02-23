package day07;

public class Admin extends Employee{
	
	float allowance;
	float sal;
	
	void getData(float allowance)
	
	{
		this.allowance=allowance;
		
	}
	
	void calSalary()
	
	{
		sal=allowance+basicsal;
		System.out.println(sal);
	}

}
