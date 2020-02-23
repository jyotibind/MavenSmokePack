package Operation;

public class Addition {
	
	int a1,a2,add;
	float b1,b2,b3,sub;
	
	public void acceptadd(int a1,int a2)
	{
		this.a1=a1;
		this.a2=a2;
	}
	
	public void acceptsub(float b1,float b2,float b3)
	
	{
		this.b1=b1;
		this.b2=b2;
		this.b3=b3;
		
	}
	
	public void add()
	
	{
		add=a1+a2;
		System.out.println(add);
	}
	
	public void subtract()
	
	{
		sub=b1-b2-b3;
		System.out.println(sub);
	}

}
