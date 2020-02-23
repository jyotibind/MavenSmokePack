package day0702;

public class Developer extends Employee{
	
	int extra_hours;
	int pay_per_hour;
	int overtime_sal;
	int sal;
	
	void takeDetail(int extra_hours,int pay_per_hour)
	{
		this.extra_hours=extra_hours;
		this.pay_per_hour=pay_per_hour;
	}	
	void calSalary()	
	{
		overtime_sal=extra_hours*pay_per_hour;
		sal=overtime_sal+basic_sal;		
	}
	void display()
	{
		System.out.println("Salary of Developer"+"\t"+sal);
		//System.out.println("Salary with overtime"+"\t"+sal);
	}
}
