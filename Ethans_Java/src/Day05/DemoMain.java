package Day05;

public class DemoMain {

	public static void main(String[] args) {
		
		{
			Demo d=new Demo(); //classname objectname=new classname
			d.show();  //instance variables by default takes 0 value
			d.acceptData(20, 30);
			d.show();
			System.out.println("Values of Variables");
			System.out.println(d.a);
			System.out.println(d.b);
		}

	}

}
