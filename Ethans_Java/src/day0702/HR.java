package day0702;

public class HR extends Employee{
	
	int incentive;
	
	void getData(int incentive)
	{
		this.incentive=incentive;
	}
	
	void calSalary()
	{
		sal=incentive+basic_sal;		
	}
	void display()
	{
		System.out.println("Salary of HR"+"\t"+sal);
		//System.out.println("Salary with incentive"+"\t"+sal);
	}

}
