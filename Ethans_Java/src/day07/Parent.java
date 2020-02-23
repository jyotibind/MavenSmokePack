package day07;

public class Parent {
	
	int age;
	String fname,mname,lname,qual;
	
	void takeData(String fname,String mname,String lname,int age,String qual)
	
	{
		this.fname=fname;
		this.mname=mname;
		this.lname=lname;
		this.age=age;
		this.qual=qual;
		
	}
	
	void show()
	
	{
		System.out.println(fname+"\t"+"\t"+mname+"\t"+"\t"+lname+"\t"+"\t"+age+"\t"+"\t"+qual);
		
	}

}
