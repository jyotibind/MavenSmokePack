package day0901;

public class Result extends Marks implements SportsMarks{

	float totmarks;
	float tot=400f;
	float per;
	
	void totalmarks()
	{
		totmarks=m1+m2+m3+spmarks;
		System.out.println("Total Marks"+"\t"+totmarks);
	}
	
	void percentage()
	{
		per=(totmarks/tot)*100;
		System.out.println("Percentage"+"\t"+per);
	}
	void grade()
	{
		System.out.println("Student Grade");
		if(per>=70f)
		{
			System.out.println("A grade");
		}
		else if(per>=60f||per<70f)
		{
			System.out.println("B grade");
		}
		else
		{
			System.out.println("C grade");
		}
	}
	
	void show()
	{
		System.out.println("Details of Student");
		System.out.println("Student id"+"\t"+id+"\t"+"Age"+"\t"+age+"\t"+"Name Of Student"+"\t"+name);
		System.out.println("Marks for 3 subjects");
		System.out.println("English"+"\t"+m1);
		System.out.println("Hindi"+"\t"+m2);
		System.out.println("Social Science"+"\t"+m3);
		//System.out.println("SportsMarks"+"\t"+SportsMarks.spmarks);
	}

	@Override
	public void acceptspmarks(float spmarks) {
		// TODO Auto-generated method stub
		System.out.println("SportsMarks"+"\t"+SportsMarks.spmarks);
		
	}

	
}
