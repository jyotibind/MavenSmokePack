package day07;

public class Child extends Parent{
	
	int age;
	String fname,qual;
	
	void acceptData(String fname,int age,String qual)
	
	{
		{
			this.fname=fname;
		    this.qual=qual;
			this.age=age;
			
		}
	}
	
	void display()
	
	{
		show();
		System.out.println(fname+"\t"+"\t"+super.fname+"\t"+"\t"+super.lname+"\t"+"\t"+age+"\t"+"\t"+qual);
	}
	

}
