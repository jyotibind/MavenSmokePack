package day07;

public class AdminMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Admin a=new Admin();
		a.accept("Juhi", "Btech", 24);
		a.take(1, 50000f);
		a.display();
		a.getData(10000f);
		a.calSalary();
		System.out.println(a);
		System.out.println(a.toString());
	}

}
