package day09;

public class AllMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating objects of both classes
		/*
		Employee e1=new Employee();
		e1.accept("Amit", 1, 10000);
		e1.display();
		
		Worker w1=new Worker();
		w1.accept("Rajesh", 10);
		w1.display();
		*/
		
		// using ref variable
		
		Person ref;
		Employee e1=new Employee();
		e1.accept("Amit", 1, 10000);
		
		Worker w1=new Worker();
		w1.accept("Rajesh", 10);
		
		ref=e1;
		ref.display();
		
		ref=w1;
		ref.display();
		
		
				

	}

}
