package Day05;

public class Demo01Main {

	int a,b;
	void accept(int a,int b)
	{
		System.out.println(a+"\t"+b);
		this.a=a;
		this.b=b;
		
	}
	void show()
	
	{
		System.out.println(a+"\t"+b);
	}
	
	public static void main(String[] args) {
		
		Demo01Main d1=new Demo01Main();
		d1.accept(10, 20);
		d1.show();


	}


}
