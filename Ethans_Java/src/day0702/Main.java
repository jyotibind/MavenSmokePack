package day0702;

public class Main {

	public static void main(String[] args) {
	
		Admin a1=new Admin();
		a1.takeData(1, "Juhi", 24, 10000);
		a1.accept(1200);
	
		
		HR h1=new HR();
		h1.takeData(1, "Rajesh", 23, 15000);
		h1.getData(300);
	
		
		Developer d1=new Developer();
		d1.takeData(1, "Rakesh", 22, 34000);
		d1.takeDetail(10, 500);
		
		
		Admin ref1;
		ref1=a1;
		ref1.calSalary();
		a1.show();
		a1.display();
		
		
		HR ref2=h1;// or HR ref2;ref2=h1;
		ref2.calSalary();
		h1.show();
		h1.display();
		
		Developer ref3=d1;
		ref3.calSalary();
		d1.show();
		d1.display();
		
		/*Admin a1=new Admin();
		a1.accept(2000f);
		a1.display();
		HR h1=new HR();
		h1.getData(30000f);
		h1.display();
		d1.takeDetail(10,500f);
		d1.display();
		*/
	}

}
