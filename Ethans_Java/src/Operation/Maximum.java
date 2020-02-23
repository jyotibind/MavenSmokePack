package Operation;

public class Maximum extends Addition{
	
	int n1,n2,n3,max2,max3;
	
	public void acceptmax2(int n1,int n2)
	{
		this.n1=n1;
		this.n2=n2;
	}
	
	public void acceptmax3(int n1,int n2,int n3)

	{
		this.n1=n1;
		this.n2=n2;
		this.n3=n3;
	}
	
	public void max2()
	{
		if(n1>n2)
		{
			System.out.println(n1+" is greater");
		}
		else
			
		{
			System.out.println(n2+" is greater");
		}
	}
	
	public void max3()
	{
		if(n1>n2&&n1>n3)
		{
			System.out.println(n1+ " is greater");
		}
		else if(n2>n1&&n2>n3)
		{
			System.out.println(n2+ " is greater");
		}
		else
		{
			System.out.println(n3+" is greater");
		}
	}
}
