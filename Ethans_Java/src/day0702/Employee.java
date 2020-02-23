package day0702;

public class Employee {
	
	int id,age;
	String name;
	int basic_sal;
	int sal;
	
	void takeData(int id,String name,int age,int basic_sal)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.basic_sal=basic_sal;	
	}
	void show()
	{
		System.out.println("id"+"\t"+id);
		System.out.println("name"+"\t"+name);
		System.out.println("age"+"\t"+age);
		System.out.println("basic sal"+"\t"+basic_sal);
	}
	void calSalary()
	{
		System.out.println(sal);
	}
}
