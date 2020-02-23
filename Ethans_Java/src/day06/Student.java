package day06;

public class Student {

	int id,age;
	float per;
	String name;
	
	Student(int id,int age,float per,String name)
	
	{
		this.id=id;
		this.age=age;
		this.per=per;
		this.name=name;
		
	}
	
	void show()
	{
		System.out.println(id+"\t"+age+"\t"+per+"\t"+name);
	}


	public static void main(String[] args) {
		
		Student s1=new Student(1,20,80f,"Juhi");
		s1.show();
		Student s2=new Student(2,23,85f,"Ahna");
		s2.show();
		Student s3=new Student(3,21,82f,"Rohit");
		s3.show();
		
		
		if (s1.per>s2.per)
		{
			if(s1.per>s3.per)
			{
				System.out.println(s1);
			}
			else
			{
				System.out.println(s3);
			}
			
			
		}
		else
		{
			if(s2.per>s3.per)
			{
				System.out.println(s2);
			}
			
			else
			{
				System.out.println(s3);
			}
		}
		
		/*
		if (s1.per>s2.per && s1.per>s3.per)
		{
			System.out.println(s2.name+s1.id);
			
			
		}
		
		else if(s2.per>s1.per&&s2.per>s3.per)
		
		{
			System.out.println(s2.name+s2.id);
		}
		
		else
			
		{
			System.out.println(s3.name+s3.id);
		}
		*/
	
	}

}
