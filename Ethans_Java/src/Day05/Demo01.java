package Day05;

public class Demo01 {
	
	int a,b;
	void accept(int a,int b)
	{
		System.out.println(a+"\t"+b);
		a=a;
		b=b;
		
	}
	void show()
	
	{
		System.out.println(a+"\t"+b);
	}
	
	public static void main(String[] args) {
		
		Demo01 d1=new Demo01();
		d1.accept(10, 20);
		d1.show();

	}

}
