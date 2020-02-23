package day09;

public class Worker extends Person{
	
	String wname;
	int whrs;
	void accept(String wname,int whrs)
	{
		this.wname=wname;
		this.whrs=whrs;
	}
	
	@Override // Notification in java signifies that method is overridden
	void display()
	{
		System.out.println("Name of Worker "+wname);
		System.out.println("Working hours "+whrs);
		
	}

}
