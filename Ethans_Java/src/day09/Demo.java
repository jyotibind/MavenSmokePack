package day09;

public class Demo implements Test,Sample{
	
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
		System.out.println(x);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo d1=new Demo();
		d1.show();
		d1.display(20);
		d1.show(30);

	}

	@Override
	public void display(int x) {
		// TODO Auto-generated method stub
		
		System.out.println(x);
	}

	@Override
	public void show(int a) {
		// TODO Auto-generated method stub
		
		System.out.println(a);
		
	}

}
