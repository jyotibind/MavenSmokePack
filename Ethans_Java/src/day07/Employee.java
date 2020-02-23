package day07;

public class Employee extends Person{
	
	int id;
	float basicsal;
	
	void take(int id,float basicsal)
	
	{
		this.id=id;
		this.basicsal=basicsal;
		
	}
	
	void display()
	
	{
		disp();   //this.disp()
		System.out.println(id);
		System.out.println(basicsal);
	}
	
}
